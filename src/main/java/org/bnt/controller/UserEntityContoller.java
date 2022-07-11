package org.bnt.controller;


import org.bnt.auth.CustomUserDetails;
import org.bnt.auth.JwtProvider;
import org.bnt.mapper.UserMapper;
import org.bnt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserEntityContoller {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtProvider jwtProvider;

    private static class AuthRequest {
        private String login;
        private String password;

        AuthRequest() {
            this.login = "";
            this.password = "";
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
    }

    private static class AuthResponse {
        private String token;

        private int id;

        private String name;

        AuthResponse(int id, String name) {
            this.id = id;
            this.name = name;
        }

        AuthResponse(String token) {
            this.token = token;
        }
        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }
    }

    @PostMapping("auth")
    public ResponseEntity<?> authenticateUser(HttpServletRequest req, @ModelAttribute("login") AuthRequest request) {
        UsernamePasswordAuthenticationToken authReq = new UsernamePasswordAuthenticationToken(request.login, request.password);
        Authentication auth = authenticationManager.authenticate(authReq);
        //Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(auth);
        CustomUserDetails userDetails = (CustomUserDetails) auth.getPrincipal();
        ResponseCookie jwtCookie = jwtProvider.generateJwtCookie(userDetails);
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
                .body(new AuthResponse(0,
                        userDetails.getUsername()));
    }


}

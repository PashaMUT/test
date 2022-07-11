package org.bnt.auth;

import org.bnt.entity.User;
import org.bnt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserMapper accountService;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User account = accountService.getByLogin(username);
        CustomUserDetails userDetail = CustomUserDetails.fromUserEntityToCustomUserDetails(account);
        return  userDetail;
    }
}
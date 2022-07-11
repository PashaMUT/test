package org.bnt.auth;

import org.bnt.entity.Role;
import org.bnt.entity.User;
import org.bnt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CustomUserDetails implements UserDetails {

    private String login;

    private String password;

    private Collection<? extends GrantedAuthority> grantedAuthorities;

    @Autowired
    private static UserMapper userMapper;

    public static CustomUserDetails fromUserEntityToCustomUserDetails(User account) {
        CustomUserDetails c = new CustomUserDetails();
        c.login = account.getLogin();
        c.password = account.getPass();
        List<SimpleGrantedAuthority> roles = new ArrayList<>();
        for (Role temp : account.getRoles()) {
            roles.add(new SimpleGrantedAuthority(temp.getName()));
        }
        c.grantedAuthorities = roles;
        return c;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

package org.bnt.entity;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int uid;           // id пользователя

    private String login;      // Имя пользователя

    private String email;      // email

    private String surname;    // Фамилия (surname)

    private String name;       // Имя (name)

    private String patronymic; // Отчество (patronymic)

    private String pass;       // Пароль пользователя

    private String phone;      // Телефон пользователя

    List<Role> roles = new ArrayList<Role>();

    public User() {
        super();
    }

    public User(int uid, String login, String email, String surname, String name, String patronymic, String pass, String phone) {
        this.uid = uid;
        this.login = login;
        this.email = email;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.pass = pass;
        this.phone = phone;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Role> getRoles() {
        Role r = new Role();
        r.setId(1);
        r.setName("USER");
        r.setName("NOTE");
        roles.add(r);
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Login " + this.name + ", pasword " + this.pass + ", e-mail " + this.email;
    }
}

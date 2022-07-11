package org.bnt.mapper;

import org.bnt.entity.Role;
import org.bnt.entity.User;

import java.util.List;

public interface UserMapper {

        List<User> getAll();

        User getById(int id);

        User getByLogin(String login);

        List<Role> getRoles(int id);

}

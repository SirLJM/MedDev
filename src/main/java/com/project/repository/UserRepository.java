package com.project.repository;

import com.project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public User addUser(User user) {

        return user;
    }

    public User updateUser(User user) {

        return user;
    }

    public User getUserById(int userId) {

        User user = new User();
        return user;
    }

    public List<User> getAllUsers() {

        List<User> list = new ArrayList<User>();
        return list;
    }

    public void deleteUser(int userId) {

        deleteUser(userId);
    }
}

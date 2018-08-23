package com.project.repository;

import com.project.entity.User;

import java.util.SortedSet;
import java.util.TreeSet;

public class UserRepository {

    private SortedSet<User> users;

    public UserRepository() {
        users = new TreeSet<>();
    }

    public void store(User user) {
        users.add(user);
    }

    public SortedSet<User> getAll() {
        return users;
    }

}

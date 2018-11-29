package com.leadiq.service;

import com.leadiq.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
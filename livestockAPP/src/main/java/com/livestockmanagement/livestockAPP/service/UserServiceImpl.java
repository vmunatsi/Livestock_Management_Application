package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.User;
import com.livestockmanagement.livestockAPP.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user) ;
    }
}

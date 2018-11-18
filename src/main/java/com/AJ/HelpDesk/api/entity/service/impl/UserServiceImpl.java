package com.AJ.HelpDesk.api.entity.service.impl;

import com.AJ.HelpDesk.api.entity.User;
import com.AJ.HelpDesk.api.entity.repository.UserRepository;
import com.AJ.HelpDesk.api.entity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmai(email);
    }

    @Override
    public User createOrUpdate(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        this.userRepository.delete(id);
    }

    @Override
    public Page<User> findAll(int page, int count) {
        Pageable pages = new PageRequest(page, count);
        return this.userRepository.findAll(pages);
    }
}
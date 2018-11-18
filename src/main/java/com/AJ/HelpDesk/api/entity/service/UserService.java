package com.AJ.HelpDesk.api.entity.service;

import com.AJ.HelpDesk.api.entity.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface UserService {

    User findByEmail(String email);

    User createOrUpdate(User user);

    Optional<User> findById(String id);

    void delete(String id);

    Page<User> findAll(int page, int count);


}

package com.AJ.HelpDesk.api.entity.repository;

import com.AJ.HelpDesk.api.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmai(String email);
}

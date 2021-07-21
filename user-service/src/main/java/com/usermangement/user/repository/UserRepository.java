package com.usermangement.user.repository;

import com.usermangement.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User,Long> {

    User findByUserId(Long userId);
}

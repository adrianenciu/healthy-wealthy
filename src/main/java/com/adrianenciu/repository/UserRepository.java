package com.adrianenciu.repository;

import com.adrianenciu.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

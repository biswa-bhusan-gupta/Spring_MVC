package com.app.test.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.test.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}

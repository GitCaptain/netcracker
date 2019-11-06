package com.netcracker.musicband.repository;

import com.netcracker.musicband.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String name);
}
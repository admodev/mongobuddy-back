package com.technorth.mongobuddyback.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technorth.mongobuddyback.Domain.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
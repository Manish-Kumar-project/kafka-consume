package com.example.consumer.repository;

import com.example.consumer.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInformation,Integer> {
}

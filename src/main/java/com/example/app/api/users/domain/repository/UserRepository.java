package com.example.app.api.users.domain.repository;

import com.example.app.api.users.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}

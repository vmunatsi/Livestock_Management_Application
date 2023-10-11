package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

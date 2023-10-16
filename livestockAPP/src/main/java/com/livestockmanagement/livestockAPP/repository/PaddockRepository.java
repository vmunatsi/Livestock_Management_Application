package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaddockRepository extends JpaRepository<Paddock,Long> {
    Optional<Paddock> findByPaddockName(String paddockName);
}

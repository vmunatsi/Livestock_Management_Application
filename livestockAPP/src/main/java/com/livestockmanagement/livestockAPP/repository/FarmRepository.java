package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmRepository extends JpaRepository<Farm, Long> {
    Optional<Farm> findByFarmName(String farmName);
}

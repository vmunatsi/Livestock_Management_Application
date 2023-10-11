package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm, Long> {
}

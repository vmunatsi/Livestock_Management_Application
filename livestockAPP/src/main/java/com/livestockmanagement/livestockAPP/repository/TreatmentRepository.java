package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}

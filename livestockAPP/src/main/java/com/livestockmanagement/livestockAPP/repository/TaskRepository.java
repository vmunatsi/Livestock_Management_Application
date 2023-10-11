package com.livestockmanagement.livestockAPP.repository;

import com.livestockmanagement.livestockAPP.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

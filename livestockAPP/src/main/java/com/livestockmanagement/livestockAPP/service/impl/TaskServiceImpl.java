package com.livestockmanagement.livestockAPP.service.impl;

import com.livestockmanagement.livestockAPP.entity.Task;
import com.livestockmanagement.livestockAPP.repository.TaskRepository;
import com.livestockmanagement.livestockAPP.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}

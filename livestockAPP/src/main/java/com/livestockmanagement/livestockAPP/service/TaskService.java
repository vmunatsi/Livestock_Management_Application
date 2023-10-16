package com.livestockmanagement.livestockAPP.service;

import com.livestockmanagement.livestockAPP.entity.Task;

import java.util.List;

public interface TaskService {
    public Task createTask(Task task);
    public List<Task> getAllTasks();
    public Task getTaskById(Long id);
    public Task updateTaskById(Task task, Long id);
    public void deleteTaskById(Long id);
}

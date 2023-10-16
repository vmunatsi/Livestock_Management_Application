package com.livestockmanagement.livestockAPP.service.impl;

import com.livestockmanagement.livestockAPP.entity.Task;
import com.livestockmanagement.livestockAPP.exception.ResourceNotFoundException;
import com.livestockmanagement.livestockAPP.repository.TaskRepository;
import com.livestockmanagement.livestockAPP.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("The task is not available"));
    }

    @Override
    public Task updateTaskById(Task task, Long id) {
        return taskRepository.findById(id).map(task1 -> {
            task1.setTaskTitle(task.getTaskTitle());
            task1.setReminderDate(task.getReminderDate());
            task1.setDueDate(task.getDueDate());
            task1.setCompletionStatus(task.getCompletionStatus());
            task1.setTaskId(task.getTaskId());
            return taskRepository.save(task1);
        }).orElseThrow(()-> new ResourceNotFoundException("Task not available"));
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Task is not available"));
        taskRepository.deleteById(id);
    }
}

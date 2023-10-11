package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Task;
import com.livestockmanagement.livestockAPP.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/task")
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
}

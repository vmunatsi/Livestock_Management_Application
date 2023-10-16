package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.Task;
import com.livestockmanagement.livestockAPP.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/task")
    public ResponseEntity <Task> createTask(@RequestBody Task task){

        return new ResponseEntity<>(taskService.createTask(task), HttpStatus.CREATED) ;
    }

    @GetMapping("/task")
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }
    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTasksById(@PathVariable("id") Long id){
        return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> updateTasksById(@RequestBody Task task,@PathVariable("id") Long id){
        return new ResponseEntity<>(taskService.updateTaskById(task, id), HttpStatus.OK);
    }
    @DeleteMapping("/task/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable("id") Long id){
        return new ResponseEntity<>("The task has been successfully deleted !!!", HttpStatus.OK);
    }
}

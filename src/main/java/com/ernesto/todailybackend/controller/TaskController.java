package com.ernesto.todailybackend.controller;

import com.ernesto.todailybackend.model.Task;
import com.ernesto.todailybackend.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
public class TaskController {

    @Autowired
    private TaskServices taskServices;

        @RequestMapping("/tasks")
        public List<Task> getTask(){
            return taskServices.getAllTasks();
        }

        @RequestMapping(method = RequestMethod.POST, value = "/tasks/{Id}")
        public void addTask(@RequestBody Task task){
            System.out.println(task);
            taskServices.addTask(task);
        }

        @RequestMapping(method = RequestMethod.PUT, value = "/tasks/{Id}")
        public void updateTask(@PathVariable String id, @RequestBody Task task){
            System.out.println(task);
            taskServices.updateTask(id, task);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "/tasks/deleteAll")
        public void deleteAllTasks(){
            taskServices.deleteAll();
        }

}

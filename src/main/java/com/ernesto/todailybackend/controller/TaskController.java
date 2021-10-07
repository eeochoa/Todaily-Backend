package com.ernesto.todailybackend.controller;

import com.ernesto.todailybackend.model.Task;
import com.ernesto.todailybackend.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskServices taskServices;

        @RequestMapping("/tasks")
        public List<Task> getTask(){
            return taskServices.getAllTasks();
        }

        @RequestMapping(method = RequestMethod.POST, value = "/tasks/{taskId}")
        public void addTask(@RequestBody Task task){
            taskServices.addTask(task);
        }

}

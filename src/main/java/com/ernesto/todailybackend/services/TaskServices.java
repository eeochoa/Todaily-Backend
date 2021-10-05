package com.ernesto.todailybackend.services;

import com.ernesto.todailybackend.model.Task;
import com.ernesto.todailybackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TaskServices {

    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        List<Task> tasks = new ArrayList<>();
        taskRepository.findAll().forEach(tasks::add);

        return tasks;
    }

}

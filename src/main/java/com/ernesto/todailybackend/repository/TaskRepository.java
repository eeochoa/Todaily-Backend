package com.ernesto.todailybackend.repository;

import com.ernesto.todailybackend.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;


public interface TaskRepository extends CrudRepository<Task, String> {

    Task findTaskById(String taskId);
    //Task findTodoByDate(Date date);
}

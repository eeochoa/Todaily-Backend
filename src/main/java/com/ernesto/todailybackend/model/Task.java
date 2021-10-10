package com.ernesto.todailybackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    private String description;
    private String status;
    private String time;
    private String date;

    public Task(){}

    public Task(String Id, String title, String description, String status, String time, String date){
        this.id = Id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.time = time;
        this.date = date;
    }

    public Task(String Id, String title, String description, String time, String date){
        this.id = Id;
        this.title = title;
        this.description = description;
        this.time = time;
        this.date = date;
    }

    public Task(String Id, String title, String time, String date){
        this.id = Id;
        this.title = title;
        this.time = time;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
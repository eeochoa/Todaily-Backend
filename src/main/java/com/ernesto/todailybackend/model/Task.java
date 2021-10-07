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
    private String ID;
    private String title;
    private String description;
    private String status;
    private Date time;
    private Date date;

    public Task(){}

    public Task(String id, String title, String description, String status, Date time, Date date){
        this.ID = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.time = time;
        this.date = date;
    }

    public Task(String id, String title, String description, Date time, Date date){
        this.ID = id;
        this.title = title;
        this.description = description;
        this.time = time;
        this.date = date;
    }

    public Task(String id, String title, Date time, Date date){
        this.ID = id;
        this.title = title;
        this.time = time;
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
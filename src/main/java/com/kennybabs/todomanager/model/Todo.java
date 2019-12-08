package com.kennybabs.todomanager.model;


import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.Size;

@Entity
@Table(name="")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;

    @Size(min = 10, message = "Enter at least 10 Characters...")
    private String description;

    private Date targetDate;

    public Todo(String user, String description, Date targetDate) {
        this.userName = user;
        this.description = description;
        this.targetDate = targetDate;
    }

    public Todo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodoName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}

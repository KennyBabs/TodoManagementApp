package com.kennybabs.todomanager.service;

import com.kennybabs.todomanager.model.Todo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface TodoService {
    List<Todo> getTodosByUser(String user);

    Optional< Todo > getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}

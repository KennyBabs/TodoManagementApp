package com.kennybabs.todomanager.repository;

import com.kennybabs.todomanager.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUserName(String user);
}

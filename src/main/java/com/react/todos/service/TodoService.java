package com.react.todos.service;

import com.react.todos.domain.Todo;
import com.react.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;
    public List<Todo> getTodo() {
        List<Todo> todos = todoRepository.findAll();

        return todos;
    }
}

package com.react.todos.controller;

import com.react.todos.domain.Todo;
import com.react.todos.dto.TodoDto;
import com.react.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ResponseBody
public class TodoController {

    @Autowired
    TodoService todoService;


    @GetMapping(value = "/todo")
    public List<TodoDto.Response> getTodo() {
        List<Todo> todoList = todoService.getTodo();
        return TodoDto.Response.toDto(todoList);
    }


}

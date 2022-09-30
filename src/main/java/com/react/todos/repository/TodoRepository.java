package com.react.todos.repository;

import com.react.todos.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//jpa를 담당하는 부분
public interface TodoRepository extends JpaRepository<Todo, Integer> {


}

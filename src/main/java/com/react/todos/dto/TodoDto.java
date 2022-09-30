package com.react.todos.dto;

import com.react.todos.domain.Todo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class TodoDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request{
        private int id;
        private String contents;
        private String checked;

    }

    @Getter
    @Setter
    public static class Response{
        private int id;
        private String contents;
        private String checked;


        public static Response toDto(Todo todo){
            Response response  = new Response();
            response.setId(todo.getId());
            response.setContents(todo.getContents());
            response.setChecked(todo.getChecked());
            return response;
        }

        public static List<Response> toDto(List<Todo> todoList){
            List<Response> responses = new ArrayList<>();
            for(Todo todo: todoList){
                responses.add(toDto(todo));
            }
            return responses;
        }
    }
}

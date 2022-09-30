package com.react.todos.domain;

import com.react.todos.dto.TodoDto;
import lombok.*;

import javax.persistence.*;

// entity
// db테이블에 존재하는 Column들을 필드로 가지는 객체

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String contents;

    @Column(name = "checked_yn")
    private String checked;

}

package com.study.designpattern.iterator.sample;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private String name;

    //AllArgsConstructor 어노테이션 대체
//    public Book(String name) {
//        this.name = name;
//    }

    //Getter 어노테이션 대체
//    public String getName() {
//        return name;
//    }
}

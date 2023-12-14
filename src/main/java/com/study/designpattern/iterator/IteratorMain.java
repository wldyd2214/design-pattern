package com.study.designpattern.iterator;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String args[]) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("클린코드"));
        bookShelf.appendBook(new Book("도커/쿠버네티스"));
        bookShelf.appendBook(new Book("스프링 부트와 AWS로 혼자 구현하는 웹 서비스"));
        bookShelf.appendBook(new Book("마이크로 서비스 패턴"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}

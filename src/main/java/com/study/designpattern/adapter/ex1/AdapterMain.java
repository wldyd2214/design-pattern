package com.study.designpattern.adapter.ex1;

/*
 * 상속을 사용한 패턴
 */

public class AdapterMain {
    public static void main(String args[]) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

package com.nk.java8;

public class InterfaceMain {

    public static void main(String[] args) {
        C  c = new C();
        c.test();
    }

}


interface A {
    default void test() {
    }

    default void test2() {
    }

}

interface B {
    default void test() {
    }

    default void test1() {
    }


}

class C implements A, B {

    @Override
    public void test() {
      A.super.test();
    }
}
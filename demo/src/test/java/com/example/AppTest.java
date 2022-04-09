package com.example;

import org.apache.commons.math3.stat.inference.GTest;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    public void example1() {
        Item item = new Item();
        item.setA(createA(100));
        item.setB(createB(200));
        item.setC(createC(300));
    }

    public void example2() {
        Item item = new Item();
        item.setA(A.builder().amount(createAmount(100)).build());
        item.setB(B.builder().amount(createAmount(100)).build());
        item.setC(C.builder().amount(createAmount(100)).build());
    }

    public static A createA(Integer amount) {
        return A.builder().amount(amount).build();
    }

    public static B createB(Integer amount) {
        return B.builder().amount(amount).build();
    }

    public static C createC(Integer amount) {
        return C.builder().amount(amount).build();
    }

    private Integer createAmount(Integer amount) {
        return amount;
    }
}

package com.example;

import com.example.A.ABuilder;
import com.example.B.BBuilder;
import com.example.C.CBuilder;

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

    public void example3(){
        Item item = new Item();
        item.setA(buildA(100).build());
        item.setB(buildB(100).build());
        item.setC(buildC(100).build());
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

    private ABuilder buildA(Integer amount) {
        return A.builder().amount(amount);
    }

    private BBuilder buildB(Integer amount) {
        return B.builder().amount(amount);
    }

    private CBuilder buildC(Integer amount) {
        return C.builder().amount(amount);
    }
}

package com.demo;

import com.unit.Calculator;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Junit5Dome1
 * @Title:
 * @Packag
 * @Description:
 * @date 2020/11/16
 **/
public class Junit5Dome1 {
    @RepeatedTest(10)
    public void countTest() throws InterruptedException {
        int result= Calculator.count(1);
        System.out.print(result);
//        assertEquals(10,result);
    }

}

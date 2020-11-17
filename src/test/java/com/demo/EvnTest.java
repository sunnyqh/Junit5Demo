package com.demo;


import com.unit.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author EvnTest
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/9
 **/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EvnTest {
    @Test
    public void clearTest(){
         Calculator.clear();
    }

    @Test
    @Order(1)
    public void addTest(){
        int result= Calculator.add(4,2);
        System.out.print(result);
        assertEquals(6,result);
    }
    @Test
    @Order(2)
    public void subTractTest(){
        int result= Calculator.subtract(4,2);
        System.out.print(result);
        assertEquals(2,result);
    }
    @Test
    @Order(3)
    public void multiplyTest(){
        int result= Calculator.multiply(4,2);
        System.out.print(result);
        assertEquals(8,result);
    }
    @Test
    @Order(4)
    public void divideTest(){
        int result= Calculator.divide(4,2);
        System.out.print(result);
        assertEquals(2,result);
    }
    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result= Calculator.count(1);
        System.out.print(result);
        assertEquals(2,result);
    }

}

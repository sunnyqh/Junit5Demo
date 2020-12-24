//package com.demo;
//
//import com.unit.Calculator;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
//
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
///**
// * @author Junit5Dome1
// * @Title:
// * @Packag
// * @Description:
// * @date 2020/11/16
// **/
//public class Junit5Dome1 {
//    //多线程
////    @RepeatedTest(10)
////    public void countTest() throws InterruptedException {
////        int result= Calculator.count(1);
////        System.out.print(result);
////        assertEquals(10,result);
////    }
//
//    //混合并发
//    @RepeatedTest(10)
//    public void addTest(){
//        int result= Calculator.add(4,2);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.print(result+"\r\n");
//        assertEquals(6,result);
//    }
//
//    @RepeatedTest(10)
//    public void subTractTest(){
//        int result= Calculator.subtract(4,2);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.print(result+"\r\n");
//        assertEquals(2,result);
//    }
//
//}

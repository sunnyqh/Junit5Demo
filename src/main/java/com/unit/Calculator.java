package com.unit;

/**
 * @author Calculator
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/9
 **/
public class Calculator {
    public static int result=0;

    //加法
    public static int add(int x,int y){
        int result=x+y;
        return result;
    }

    //累加
    public synchronized static int count(int x) throws InterruptedException {
        int i=result;
        Thread.sleep(1000);
        result=i+x;
        return result;
    }

    //减法
    public static int subtract(int x,int y){
        int result=x-y;
        return result;
    }

    //乘法
    public static int multiply(int x,int y){
        result=x*y;
        return result;
    }

    //除法
    public static int divide(int x,int y){
        result=x/y;
        return result;
    }

    //清零
    public static void clear(){
        result = 0;
        System.out.print("当前结果已清零");
    }
}

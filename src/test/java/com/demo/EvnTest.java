package com.demo;


import com.unit.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author EvnTest
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/9
 **/
@Epic("Epic 计算器项目")
@Feature("Feature 冒烟测试用例")
public class EvnTest {
    @Test
    public void clearTest(){
         Calculator.clear();
    }

    @Test
    @Description("Description")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("www.baidu.com")
    @Link(name = "Link 社区贴", type = "mylink",url = "https://www.baidu.com/?tn=21002492_27_hao_pg")
    public void addTest(){
        int result= Calculator.add(4,2);
        System.out.print(result);
        assertEquals(6,result);
    }
    @Test
    public void subTractTest(){
        int result= Calculator.subtract(4,2);
        System.out.print(result);
        assertEquals(2,result);
    }
    @Test
    public void multiplyTest(){
        int result= Calculator.multiply(4,2);
        System.out.print(result);
        assertEquals(8,result);
    }
    @Test
    public void divideTest(){
        int result= Calculator.divide(4,2);
        System.out.print(result);
        assertEquals(2,result);
    }
    @Test
    public void countTest() throws InterruptedException {
        int result= Calculator.count(1);
        System.out.print(result);
        assertEquals(2,result);
    }

}

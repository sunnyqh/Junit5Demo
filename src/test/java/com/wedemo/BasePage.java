package com.wedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    public BasePage() {
    }

    void click(By by){
        driver.findElement(by).click();
    }
    void sendKeys(By by,String contect){
        driver.findElement(by).sendKeys(contect);
    }
}

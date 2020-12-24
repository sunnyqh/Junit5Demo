package com.wedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    private By parterInfo = By.cssSelector(".js_party_info");

    public ContactPage(WebDriver driver) {
        //保存MainPage中driver的值到自己的实例
        super(driver);
    }
    //添加成功与失败返回页面不一样，需要封装不同方法
    public ContactPage addMember(String username, String acctid, String mobile){
        return this;
    }

    public ContactPage addMemberFail(String username, String acctid, String mobile){
        return this;
    }

    public ContactPage searchDepart(String departName){
        sendKeys(By.id("memberSearchInput"),departName);

        String contect = driver.findElement(parterInfo).getText();
        System.out.println(contect);

        click(By.cssSelector(".ww_icon_AddMember"));
        return this;
    }
    public String getPartyInfo(){
        String contect = this.driver.findElement(parterInfo).getText();

        return contect;
    }
}
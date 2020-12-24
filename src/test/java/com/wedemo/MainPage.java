package com.wedemo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    void needLogin() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://work.weixin.qq.com/wework_admin/frame");
        Thread.sleep(1500);
        Set<Cookie> cookies = driver.manage().getCookies();
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.writeValue(new File("cookie.yaml"),cookies);
        System.exit(0);

    }

    void beforeAll() throws IOException, InterruptedException {
        File file = new File("cookie.yaml");
        if(file.exists()){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://work.weixin.qq.com/wework_admin/frame");

            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            TypeReference typeReference = new TypeReference<List<HashMap<String,Object>>>(){
            };

            List<HashMap<String, Object>> cookies = (List<HashMap<String, Object>>) mapper.readValue(file, typeReference);
            System.out.println(cookies);

            cookies.forEach(cookieMap ->{
                driver.manage().addCookie(new Cookie(cookieMap.get("name").toString(),cookieMap.get("value").toString()));
            });
            driver.navigate().refresh();
        }else {
            needLogin();
        }
    }
    public MainPage() throws IOException, InterruptedException {
        //初始化你的selenium 打开网站
        this.beforeAll();
    }

    public ContactPage contact(){
        //进入通讯录
        click(By.id("menu_contacts"));
        //传递selenium的driver给ContactPage（跳转或进入新页面使用返回新的OP来模拟）
        return new ContactPage(driver);
    }

}

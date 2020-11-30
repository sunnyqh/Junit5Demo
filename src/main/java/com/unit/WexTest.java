package com.unit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.channels.MembershipKey;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author WexTest
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/30
 **/
public class WexTest {
    public static WebDriver driver;
    @BeforeAll
    public static void initData(){
        System.setProperty("webdriver.chrome.driver","D:\\webdriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    void testLogin() throws IOException, InterruptedException {
        driver.get("https://work.weixin.qq.com/wework_admin/loginpage_wx");
//        Set<Cookie> cookies = driver.manage().getCookies();
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        TypeReference typeReference = new TypeReference<List<HashMap<String,Object>>>(){};
        List<HashMap<String,Object>> cookies=mapper.readValue(new File("cookie.yaml"),typeReference);



        driver.quit();
    }
}

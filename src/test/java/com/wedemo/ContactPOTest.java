package com.wedemo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ContactPOTest {
    @Test
    void testDepartSearchChain() throws IOException, InterruptedException {
//        MainPage mainPage = new MainPage();
//        ContactPage contactPage = mainPage.contact();
//        contactPage.addMember("zhangsan","zhangsan","15812345678");
//        contactPage.searchDepart("销售部");
//        String contect = contactPage.getPartyInfo();
//
//        assertTrue(contect.contains("无任何成员"));
        new MainPage().contact().searchDepart("销售部").getPartyInfo().contains("无任何成员");
//        assert contactPage.search("zhangsan").getInfo();
    }
}

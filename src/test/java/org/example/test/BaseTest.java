package org.example.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    @BeforeSuite
    public void init() {
        Configuration.baseUrl = "https://www.demoblaze.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterClass
    public void closeDriver() {
        closeWebDriver();
    }
}

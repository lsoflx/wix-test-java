package org.example.page;

import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class BasePage {

    protected Alert getAlert() {
        Wait().until(alertIsPresent());
        return getWebDriver().switchTo().alert();
    }
}

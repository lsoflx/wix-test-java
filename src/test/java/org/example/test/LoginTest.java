package org.example.test;

import org.example.component.NavBarComponent;
import org.example.page.LoginPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    private final NavBarComponent navBarComponent = new NavBarComponent();
    private final LoginPage loginPage = new LoginPage();

    private static final String INVALID_NAME = "INVALID_NAME";
    private static final String INVALID_PASS = "INVALID_PASS";

    @Test
    public void shouldAlertOnInvalidNameAndPass() {
        open("/");
        navBarComponent.openLogin();
        loginPage.inputName(INVALID_NAME);
        loginPage.inputPass(INVALID_PASS);

        loginPage.clickLogin();
        loginPage.verifyUserDoesNotExistAlert();
    }
}

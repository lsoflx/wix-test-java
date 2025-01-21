package org.example.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends BasePage {

    private final SelenideElement nameInput = $("#loginusername");
    private final SelenideElement passInput = $("#loginpassword");
    private final SelenideElement loginButton = $("[onclick=\"logIn()\"]");

    public void inputName(String name) {
        nameInput.shouldBe(enabled).val(name);
    }

    public void inputPass(String pass) {
        passInput.shouldBe(enabled).val(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void verifyUserDoesNotExistAlert() {
        assertThat(getAlert().getText()).isEqualTo("User does not exist.");
    }
}

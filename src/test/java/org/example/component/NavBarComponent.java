package org.example.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavBarComponent extends BaseComponent {

    private final SelenideElement cart = $("#cartur");
    private final SelenideElement login = $("#login2");

    public void openCart() {
        cart.click();
    }

    public void openLogin() {
        login.click();
    }
}

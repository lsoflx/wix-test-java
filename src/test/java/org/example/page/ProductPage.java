package org.example.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage {

    private final SelenideElement addToCartButton = $(".btn-lg");

    public void addToCart() {
        addToCartButton.click();
    }

    public void acceptProductAddedToCartAlert() {
        getAlert().accept();
    }
}

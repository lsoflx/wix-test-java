package org.example.page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends BasePage {

    private final ElementsCollection cartProducts = $$(".success");

    public void verifyCartHasProducts(int numberOfCartProducts) {
        cartProducts.shouldHave(size(numberOfCartProducts));
    }
}

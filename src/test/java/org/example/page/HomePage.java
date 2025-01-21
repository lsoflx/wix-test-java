package org.example.page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends BasePage {

    private final ElementsCollection products = $$(".card");

    public void openFirstProduct() {
        products.shouldHave(sizeGreaterThan(0));
        products.first().shouldBe(clickable).click();
    }
}

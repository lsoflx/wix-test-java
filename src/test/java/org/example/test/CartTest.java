package org.example.test;

import org.example.component.NavBarComponent;
import org.example.page.CartPage;
import org.example.page.HomePage;
import org.example.page.ProductPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CartTest extends BaseTest {

    private final HomePage homePage = new HomePage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final NavBarComponent navBarComponent = new NavBarComponent();

    @Test
    public void shouldAddProductToCart() {
        open("/");
        homePage.openFirstProduct();
        productPage.addToCart();
        productPage.acceptProductAddedToCartAlert();

        navBarComponent.openCart();
        cartPage.verifyCartHasProducts(1);
    }
}

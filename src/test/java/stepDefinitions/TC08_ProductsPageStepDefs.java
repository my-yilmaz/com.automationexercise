package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TC08_ProductsPage;

public class TC08_ProductsPageStepDefs {
    TC08_ProductsPage productsPage=new TC08_ProductsPage();

    @Given("Click on Products button")
    public void click_on_products_button() {
        productsPage.productsButton.click();
    }
    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(productsPage.allProducts.isDisplayed());

    }
    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(productsPage.productsList.isDisplayed());

    }
    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        productsPage.viewProductButton.click();

    }
    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue( productsPage.productDetail.isDisplayed());

    }
    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(productsPage.detail.isDisplayed());

    }
}

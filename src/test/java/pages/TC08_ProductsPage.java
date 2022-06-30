package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC08_ProductsPage {

    public TC08_ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement allProducts;

    @FindBy(xpath = "//div=[@class='features_items']")
    public WebElement productsList;

    @FindBy(xpath = "//*[text()='View Product']")
    public WebElement viewProductButton;

    @FindBy(xpath = "//div=[@class='product-details']")
    public WebElement productDetail;

    @FindBy(xpath = "//div=[@class='product-information']")
    public WebElement detail;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC04_LogoutUserPage {

    public TC04_LogoutUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[9]")
    public WebElement LoggedInUserName;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[4]")
    public WebElement LogOutButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement logintoYourAcoountText;


}

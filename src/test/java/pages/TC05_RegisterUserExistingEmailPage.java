package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC05_RegisterUserExistingEmailPage {
    public TC05_RegisterUserExistingEmailPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameKutusu;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement singUpButonu;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAdressAlreadyExistText;

}

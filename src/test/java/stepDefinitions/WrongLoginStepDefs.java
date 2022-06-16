package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Login2Page;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WrongLoginStepDefs {
     LoginPage loginPage=new LoginPage();
    Login2Page login2Page = new Login2Page();
    @Given("Navigate to url {string}")
    public void navigate_to_url(String expectedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(expectedUrl));
    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(loginPage.logoElementi.isDisplayed());

    }
    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {

        loginPage.loginSignUP.click();


    }
    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(login2Page.logintoYourAcoountText.isDisplayed());

    }
    @Given("Enter {string} and {string}")
    public void enter_and(String email, String password) {
        login2Page.emailBox.sendKeys(ConfigReader.getProperty(email));
        login2Page.passwordBox.sendKeys(ConfigReader.getProperty(password));

    }

    @Given("Click login button")
    public void click_login_button() {
           login2Page.loginButonu.click();
    }
    @Given("Verify Your email or password is incorrect! is visible")
    public void verify_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(login2Page.yanlisMailveSifreGirildiYazisi.isDisplayed());
    }


}

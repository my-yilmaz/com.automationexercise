package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC05_RegisterUserExistingEmailPage;
import utilities.ConfigReader;

public class TC05_RegisterUserExistingEmailStepDefs {
    TC05_RegisterUserExistingEmailPage TC05RegisterUserExistingEmailPage = new TC05_RegisterUserExistingEmailPage();

    @Given("Verify New User Signup! is visible")
    public void verify_is_visible() {
        Assert.assertTrue(TC05RegisterUserExistingEmailPage.newUserSignupText.isDisplayed());

    }

    @And("Enter {string} and already registered {string}")
    public void enterAndAlreadyRegistered(String name, String email) {
        TC05RegisterUserExistingEmailPage.nameKutusu.sendKeys(ConfigReader.getProperty(name));
        TC05RegisterUserExistingEmailPage.emailKutusu.sendKeys(ConfigReader.getProperty(email));


    }

    @Given("Click Signup button")
    public void click_button() {
        TC05RegisterUserExistingEmailPage.singUpButonu.click();
    }

    @Then("Verify error Email Address already exist! is visible")
    public void verify_error_is_visible() {
        Assert.assertTrue(TC05RegisterUserExistingEmailPage.emailAdressAlreadyExistText.isDisplayed());
    }


}



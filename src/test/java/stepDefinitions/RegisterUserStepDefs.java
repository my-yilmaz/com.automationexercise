package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }

    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
    }

    @Then("anasayfanin gorunur oldugunu test eder")
    public void anasayfanin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.logoElementi.isDisplayed());
    }

    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {
        loginPage.loginSignUP.click();
    }

    @Then("kullanici,New User Signup! in gorunur oldugunu test eder")
    public void kullanici_new_user_signup_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.newUserSignUpText.isDisplayed());
    }
}

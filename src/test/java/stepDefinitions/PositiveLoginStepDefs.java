package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Login2Page;
import utilities.ConfigReader;

public class PositiveLoginStepDefs {
    Login2Page login2Page = new Login2Page();

    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicinin_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(login2Page.logintoYourAcoountText.isDisplayed());
    }

    @Then("kullanici dogru email ve sifreyi girer")
    public void kullanici_dogru_email_ve_sifreyi_girer() {
        login2Page.emailBox.sendKeys(ConfigReader.getProperty("e-mail"));
        login2Page.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        login2Page.loginButonu.click();
    }

    @Then("kullanici oturum actigini test eder\\(Logged in as username)")
    public void kullanici_oturum_actigini_test_eder_logged_in_as_username() {
        Assert.assertTrue(login2Page.userProfil.isDisplayed());
    }
}

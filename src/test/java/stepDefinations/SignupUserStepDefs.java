package stepDefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SignupUserStepDefs {
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici olarak isim ve maili girer")
    public void kullanici_olarak_isim_ve_maili_girer() {
        loginPage.nameKutusu.sendKeys(ConfigReader.getProperty("username"));
        loginPage.emailKutusu.sendKeys(faker.internet().emailAddress());
    }

    @Then("signup butonuna tiklar")
    public void signup_butonuna_tiklar() {
        loginPage.singUpButonu.click();
    }

    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilan_sayfada_enter_account_ınformatıon_yazisinn_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.enterAccountInformationText.isDisplayed());
    }

    @Then("kullanici ayrintilari \\(birinci bolum) doldurur")
    public void kullanici_ayrintilari_birinci_bolum_doldurur() {
        loginPage.genderButon.click();
        loginPage.sifreKutusu.sendKeys(ConfigReader.getProperty("password"));
        Driver.selectByIndex(loginPage.days, 7);
        Driver.selectByIndex(loginPage.months, 11);
        Driver.selectByIndex(loginPage.years, 40);

    }


    @Then("kullanici Sign up for our newsletter! checkbox ini secer")
    public void kullanici_sign_up_for_our_newsletter_checkbox_ini_secer() {
        loginPage.signUpForOurNewsletterTik.click();
    }

    @Then("kullanici Receive special offers from our partners! checkbox ini secer")
    public void kullanici_receive_special_offers_from_our_partners_checkbox_ini_secer() {
        loginPage.receiveSpecialTik.click();
    }

    @Then("kullanici ayrintilari \\(ikinci bolum) doldurur")
    public void kullanici_ayrintilari_ikinci_bolum_doldurur() {
        actions.click(loginPage.firstNameKutusu).sendKeys("muhammed" + Keys.TAB)
                .sendKeys(faker.name().lastName() + Keys.TAB)
                .sendKeys(faker.company().name() + Keys.TAB)
                .sendKeys(faker.address().fullAddress() + Keys.TAB)
                .sendKeys(faker.address().secondaryAddress() + Keys.TAB).perform();
        Driver.selectByIndex(loginPage.country, 2);
        actions.click(loginPage.stateKutusu).sendKeys(faker.address().state() + Keys.TAB)
                .sendKeys(faker.address().city() + Keys.TAB)
                .sendKeys(faker.address().zipCode() + Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).perform();

    }

    @Then("kullanici Create Account butonuna tiklar")
    public void kullanici_create_account_butonuna_tiklar() {
        loginPage.createAccountButonu.click();
    }

    @Then("kullanici hesabin olustugunu dogrular")
    public void kullanici_hesabin_olustugunu_dogrular() {
        Assert.assertTrue(loginPage.accountCreatedText.isDisplayed());
    }
}

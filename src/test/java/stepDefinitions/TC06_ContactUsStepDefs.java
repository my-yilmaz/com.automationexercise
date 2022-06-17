package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC06_ContactUsPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06_ContactUsStepDefs {

    Actions actions = new Actions(Driver.getDriver());

    TC06_ContactUsPages TC06ContactUsPages = new TC06_ContactUsPages();
    Faker faker = new Faker();
    String name = faker.name().fullName();
    String email = faker.internet().emailAddress();



    @When("Click on Contact Us button")
    public void click_on_button() {
        TC06ContactUsPages.contactUsButton.click();

    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue( TC06ContactUsPages.getInTouchText.isDisplayed());

    }


    @When("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {

        ReusableMethods.waitFor(1);
        TC06ContactUsPages.contactNameBox.sendKeys(name);
        ReusableMethods.waitFor(1);
        TC06ContactUsPages.contactEmailBox.sendKeys(ConfigReader.getProperty("e-mail"));
        ReusableMethods.waitFor(1);
        TC06ContactUsPages.contactSubjectBox.sendKeys("QA1 Team 1 best of the world ...");
        ReusableMethods.waitFor(1);
        TC06ContactUsPages.contactYourMessageBox.sendKeys(faker.howIMetYourMother().catchPhrase());
        ReusableMethods.waitFor(1);



    }
    @When("Upload file")
    public void upload_file() {


        actions.click(TC06ContactUsPages.contactYourMessageBox).sendKeys(Keys.TAB).click().perform();

        ReusableMethods.waitForClickablility(TC06ContactUsPages.contactChooseFileButton,3);
       // contactUsPages.contactChooseFileButton.click();
// 2.adim yuklenecek doyanin dosya yolunu olusturalim
//   biz masaustundeki text.txt dosyasini yukleyelim

        String farkliKisim=System.getProperty("user.home");
        String ortakKisim= "/Downloads/Proje Takvimi.png";
        String yuklenecekDosya= farkliKisim+ortakKisim;
//C:\Users\Lenovo\Downloads\dummy.txt
// 3. adim sendKeys ile dosya yolunu, secme butonuna yollayalim
        System.out.println(yuklenecekDosya);
        TC06ContactUsPages.contactChooseFileButton.sendKeys(yuklenecekDosya);


        ReusableMethods.waitFor(1);



    }
    @Then("Click Submit button")
    public void clickSubmitButton() {

        actions.click(TC06ContactUsPages.contactYourMessageBox).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .click().perform();

        // contactUsPages.contactSubmitButton.click();
    }
    @Then("Click OK button")
    public void click_ok_button() {
       // contactUsPages.contactSubmitButton.click();
       // ReusableMethods.waitFor(3);
       Driver.getDriver().switchTo().alert().accept();


    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_is_visible() {
        Assert.assertTrue(TC06ContactUsPages.successMessageText.isDisplayed());





    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully() {

        TC06ContactUsPages.homeButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise" , actualTitle);
    }



}

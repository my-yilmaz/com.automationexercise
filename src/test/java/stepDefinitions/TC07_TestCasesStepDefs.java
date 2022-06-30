package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TC07_TestCasesPage;
import utilities.Driver;

public class TC07_TestCasesStepDefs {

    TC07_TestCasesPage testCasesPage=new TC07_TestCasesPage();


    @Given("Click on Test Cases button")
    public void click_on_button() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", testCasesPage.testCasesButton);


    }

    @Given("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(testCasesPage.navigatedToTestCases.isDisplayed());

    }

}

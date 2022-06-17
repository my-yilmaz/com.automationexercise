package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TC07_TestCasesPage;

public class TC07_TestCasesStepDefs {

    TC07_TestCasesPage testCasesPage=new TC07_TestCasesPage();

    @Given("Click on Test Cases button")
    public void click_on_button() {
        testCasesPage.testCasesButton.click();

    }

    @Given("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(testCasesPage.navigatedToTestCases.isDisplayed());

    }

}

package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TC04_LogoutUserPage;

public class TC04_LogoutUserStepDefs {
  TC04_LogoutUserPage TC04LogoutUserPage =new TC04_LogoutUserPage();


  @Given("Verify that Logged in as username is visible")
  public void verify_that_logged_in_as_username_is_visible() {

    Assert.assertTrue(TC04LogoutUserPage.LoggedInUserName.isDisplayed());

  }
  @Given("Click Logout button")
  public void click_logout_button() {
    TC04LogoutUserPage.LogOutButton.click();

  }
  @Given("Verify that user is navigated to login page")
  public void verify_that_user_is_navigated_to_login_page() {
  Assert.assertTrue(TC04LogoutUserPage.logintoYourAcoountText.isDisplayed());

  }


}

package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Login2Page;
import pages.LogoutUserPage;

public class LogoutUserStepDefs {
  LogoutUserPage logoutUserPage=new LogoutUserPage();


  @Given("Verify that Logged in as username is visible")
  public void verify_that_logged_in_as_username_is_visible() {

    Assert.assertTrue(logoutUserPage.LoggedInUserName.isDisplayed());

  }
  @Given("Click Logout button")
  public void click_logout_button() {
    logoutUserPage.LogOutButton.click();

  }
  @Given("Verify that user is navigated to login page")
  public void verify_that_user_is_navigated_to_login_page() {
  Assert.assertTrue(logoutUserPage.logintoYourAcoountText.isDisplayed());

  }


}

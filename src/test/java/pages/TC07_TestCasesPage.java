package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC07_TestCasesPage {

    public TC07_TestCasesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i=[@class='fa fa-list']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement navigatedToTestCases;
}

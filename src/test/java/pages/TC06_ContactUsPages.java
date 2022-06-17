package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC06_ContactUsPages {
    public TC06_ContactUsPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactNameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactEmailBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactSubjectBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement contactYourMessageBox;

    @FindBy(xpath = "//input[@type='file']")
    public  WebElement contactChooseFileButton;

    @FindBy(xpath = "/input[@class='btn btn-primary pull-left submit_form']")
    public  WebElement contactSubmitButton;

    @FindBy(xpath = "(//*[text()='Success! Your details have been submitted successfully.'])[1]")
    public  WebElement successMessageText;

    @FindBy(xpath = "(//*[text()=' Home'])[2]")
    public  WebElement homeButton;





}

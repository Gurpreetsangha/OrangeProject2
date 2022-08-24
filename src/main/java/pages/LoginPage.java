package pages;

import browser.Browser;
import browser.info;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "input[name='username']") private WebElement username;
    @FindBy(xpath = "//input[@name='password']") private WebElement password;// coustom xpath
    @FindBy(className = "orangehrm-login-button") private WebElement LoginButton;

    public PIMPage loginToPIMPage(){
        username.sendKeys(info.USER_NAME);
        password.sendKeys(info.PASSWORD);
        LoginButton.click();
        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }

}

import browser.Browser;
import browser.info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class FirstTest extends TestBase {
    //WebDriver driver;


    @Test
    public void test01(){
        startLoginpage().loginToPIMPage();
       // PageFactory.initElements(driver, LoginPage.class).loginToPIMPage();//we dont write this test every time so we can
        // make a method inside the TestBase

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test02(){

    }
}

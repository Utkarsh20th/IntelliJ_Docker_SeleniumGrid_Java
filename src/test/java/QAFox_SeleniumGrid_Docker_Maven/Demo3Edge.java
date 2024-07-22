package QAFox_SeleniumGrid_Docker_Maven;

import Base.InitializeBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Demo3Edge extends InitializeBrowser {
    WebDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = initBrowser("edge");
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        System.out.println("Title is: " + driver.getTitle() + " is from Edge node");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

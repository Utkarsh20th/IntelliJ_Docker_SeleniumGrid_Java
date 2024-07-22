package QAFox_SeleniumGrid_Docker_Maven;

import Base.InitializeBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Demo1Chrome extends InitializeBrowser {
    WebDriver driver;

//    @Test              //// W I T H O U T ----- E X T E N D S
//    public void test1() throws Exception {
//
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setBrowserName("chrome");
//
//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), dc);
//
//        driver.get("https://the-internet.herokuapp.com/");
//        Thread.sleep(5000);
//        System.out.println("Title is: " + driver.getTitle());
//
//    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = initBrowser("chrome");
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        System.out.println("Title is: " + driver.getTitle() + " is from Chrome node");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

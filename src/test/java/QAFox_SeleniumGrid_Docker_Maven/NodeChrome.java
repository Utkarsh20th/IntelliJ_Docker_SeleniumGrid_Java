package QAFox_SeleniumGrid_Docker_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class NodeChrome {
    WebDriver driver;

    @Test
    public void test1() throws Exception {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), dc);

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        System.out.println("Title is: " + driver.getTitle());

    }
}

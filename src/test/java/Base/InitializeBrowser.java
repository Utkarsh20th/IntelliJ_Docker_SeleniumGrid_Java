package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class InitializeBrowser {

    public WebDriver initBrowser(String browserName) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        if(browserName.equals("chrome")){
            dc.setBrowserName("chrome");
        } else if(browserName.equals("firefox")){
            dc.setBrowserName("firefox");
        } else if(browserName.equals("edge")){
            dc.setBrowserName("MicrosoftEdge");
        }

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);

        return driver;

    }

}


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class SetUpAppium {
    public RemoteWebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Mac");
        capabilities.setCapability("implicitTimeout", "61.0");
        capabilities.setCapability("commandDelay", "50");
        capabilities.setCapability("loopDelay", "1000");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4622/wd/hub"), capabilities);
        driver.get("MacKeeper.app");

        initDriver();
    }

    @AfterMethod
    public void setDown() throws IOException {
//        Runtime.getRuntime().exec("killall MacKeeper");
//        driver.quit();
    }

    public abstract void initDriver();
}

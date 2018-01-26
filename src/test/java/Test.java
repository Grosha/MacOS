import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    @org.testng.annotations.Test
    public void runTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Mac");
        capabilities.setCapability("implicitTimeout", "61.0");
        capabilities.setCapability("commandDelay", "50");
        capabilities.setCapability("loopDelay", "1000");

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4622/wd/hub"), capabilities);
        driver.get("MacKeeper.app");

        FindFixHelper findFixHelper = new FindFixHelper(driver);

        findFixHelper.findFindFixImage();
        findFixHelper.findButton().click();

        LoginItemsHelper loginItemsHelper = new LoginItemsHelper(driver);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginItemsHelper.findLoginItemCategory()).perform();
        actions.click().perform();

        loginItemsHelper.findLoginItemStartScanButton().click();

        //loginItemsHelper.findLoginItemCategory().click();
    }
}

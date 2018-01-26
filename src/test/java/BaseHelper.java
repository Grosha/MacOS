import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseHelper {
    public WebDriver driver;

    public BaseHelper(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public WebElement $(By by) {
        //waitElement(by, 10);
        return driver.findElement(by);
    }

    public void actionClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().perform();
    }

//    public void waitElement(By element, long time) {
//
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(30, SECONDS)
//                .pollingEvery(2, SECONDS)
//                .ignoring(NoSuchElementException.class);
//
//        try {
//            wait.until(new Function<WebDriver, WebElement>() {
//                public WebElement apply(WebDriver driver) {
//                    return $(element);
//                }
//            });
//        } catch (TimeoutException exception) {
//            System.out.println(element + " does not apear");
//        } catch (NoSuchElementException e) {
//            System.out.println(element + " not found");
//        }
//    }
}

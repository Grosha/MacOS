import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindFixHelper extends BaseHelper {

    private By locatorFindFixImage = By.xpath("/AXApplication[@AXTitle='MacKeeper']/AXWindow[@AXTitle='MacKeeper' and @AXIdentifier='_NS:203' and @AXSubrole='AXDialog']/AXGroup[@AXIdentifier='_NS:72']/AXGroup[@AXIdentifier='_NS:81']");

    private By button = By.xpath("/AXApplication[@AXTitle='MacKeeper']/AXWindow[@AXTitle='MacKeeper' and @AXIdentifier='_NS:210' and @AXSubrole='AXDialog']/AXGroup[@AXIdentifier='_NS:68']/AXButton[@AXTitle='START SCAN' and @AXIdentifier='_NS:106']");

    public FindFixHelper(RemoteWebDriver driver) {
        super(driver);
    }

    public WebElement findFindFixImage() {
        return $(locatorFindFixImage);
    }

    public WebElement findButton() {
        return $(button);
    }
}

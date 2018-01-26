import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginItemsHelper extends BaseHelper {
    private By locatorLoginItemsCategory = By.xpath("/AXApplication[@AXTitle='MacKeeper']/AXWindow[@AXTitle='MacKeeper' and @AXIdentifier='_NS:203' and @AXSubrole='AXDialog']/AXGroup[@AXIdentifier='_NS:101']/AXGroup[@AXIdentifier='_NS:122']/AXScrollArea[@AXIdentifier='_NS:50']/AXOutline[@AXIdentifier='_NS:9']/AXRow[@AXSubrole='AXOutlineRow']/AXCell[0]/AXStaticText[@AXValue='Login Items']");

    public By locatorLoginItemsImage = By.xpath("/AXApplication[@AXTitle='MacKeeper']/AXWindow[@AXTitle='MacKeeper' and @AXIdentifier='_NS:203' and @AXSubrole='AXDialog']/AXGroup[@AXIdentifier='_NS:72']/AXImage[@AXIdentifier='_NS:84']");

    private By locatorLoginItemsStartScanButton = By.xpath("/AXApplication[@AXTitle='MacKeeper']/AXWindow[@AXTitle='MacKeeper' and @AXIdentifier='_NS:203' and @AXSubrole='AXDialog']/AXGroup[@AXIdentifier='_NS:72']/AXButton[@AXTitle='START SCAN' and @AXIdentifier='_NS:19']");

    private By locatorCancelButton = By.xpath("/AXApplication[@AXTitle='SecurityAgent']/AXWindow[@AXIdentifier='_NS:64' and @AXSubrole='AXStandardWindow']/AXButton[@AXTitle='Cancel' and @AXIdentifier='_NS:9']");

    public LoginItemsHelper(RemoteWebDriver driver) {
        super(driver);
    }

    public WebElement findLoginItemCategory() {
        return $(locatorLoginItemsCategory);
    }

    public WebElement findLoginItemItemsImage() {
        return $(locatorLoginItemsImage);
    }

    public WebElement findCancelButton() {
        return $(locatorCancelButton);
    }

    public WebElement findLoginItemStartScanButton() {
        return $(locatorLoginItemsStartScanButton);
    }
}

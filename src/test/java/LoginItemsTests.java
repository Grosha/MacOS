
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginItemsTests extends SetUpAppium {
    private LoginItemsHelper loginItemsHelper;
    private FindFixHelper findFixHelper;

    public void initDriver() {
        loginItemsHelper = new LoginItemsHelper(driver);
        findFixHelper = new FindFixHelper(driver);
    }


    @Test
    public void startScanTest() throws InterruptedException, IOException {
        Thread.sleep(500);
        findFixHelper.findFindFixImage();
        loginItemsHelper.actionClick(loginItemsHelper.findLoginItemCategory());
        Thread.sleep(1000);
        loginItemsHelper.findLoginItemItemsImage();
        assertTrue(loginItemsHelper.findLoginItemItemsImage().isDisplayed(), "Login Items Image doesn't show");
        assertTrue(loginItemsHelper.findLoginItemStartScanButton().isDisplayed(), "Login Items Image doesn't show");
        assertTrue(loginItemsHelper.findLoginItemStartScanButton().isEnabled(), "Login Items Image doesn't show");


        loginItemsHelper.findLoginItemStartScanButton().click();

        Thread.sleep(2000);
    //    driver.findElement(By.xpath("/AXApplication[@AXTitle='SecurityAgent']/AXWindow[@AXIdentifier='_NS:64' and @AXSubrole='AXStandardWindow']/AXButton[@AXTitle='Cancel' and @AXIdentifier='_NS:9']")).click();
//       loginItemsHelper.findCancelButton().click();
        try {
//            click(764, 368);
            click_(734, 310);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void click(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void click_(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        String text = "Hello World";
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_CONTROL);
    }


}

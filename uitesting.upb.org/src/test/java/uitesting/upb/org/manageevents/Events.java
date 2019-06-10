package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class Events {
    public static void click(WebElement webElement){
        webElement.click();
    }
    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }

    public static boolean isVisible (WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String getValue(WebElement webElement) {
        return webElement.getAttribute("value");
    }

    public static String getText(WebElement webElement) {
        return webElement.getText();
    }
}

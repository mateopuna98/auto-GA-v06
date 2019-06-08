package uitesting.upb.org.learningselenium;


import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {


    public static WebDriver getWebDriver(BrowserType browserType) {

        Map<BrowserType, Browser> browserPickUp = new HashMap<>();
        browserPickUp.put(BrowserType.CHROME, new Chrome());
        browserPickUp.put(BrowserType.FIREFOX, new Firefox());
        return browserPickUp.get(browserType).initializeDriver();
    }
}

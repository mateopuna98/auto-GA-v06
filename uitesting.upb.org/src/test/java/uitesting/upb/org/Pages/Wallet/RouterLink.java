package uitesting.upb.org.Pages.Wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.Pages.BasePage;
import uitesting.upb.org.manageevents.Events;

public class RouterLink extends BasePage {

    @FindBy(xpath = "")
    private WebElement routerLinktoReport;


    @FindBy(xpath = "")
    private WebElement routerLinktoHome;



    public void clickReportRouter(){
        Events.click(routerLinktoReport);
    }

    public void clickHomeRouter(){
        Events.click(routerLinktoHome);
    }



}

package uitesting.upb.org.Pages.Wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.Pages.BasePage;

public class WalletHome extends BasePage {


    @FindBy(xpath = "//*[@id=\"Transferir\"]")
    private WebElement transferButton;

   /* public WalletHome searchText(String text){
        Events.fillField(searchTextField, text);
        return this;
    }

    public void clickSearchButton(){
        Events.click(searchButton);
    }*/

    public boolean transferButtonIsVisible(){
        return Events.isVisible(transferButton);
    }

    public String getTransferButtonTitle(){
        return Events.getText(transferButton);
    }

}

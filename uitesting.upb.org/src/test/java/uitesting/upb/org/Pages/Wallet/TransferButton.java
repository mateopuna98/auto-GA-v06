package uitesting.upb.org.Pages.Wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.Pages.BasePage;
import uitesting.upb.org.manageevents.Events;

public class TransferButton extends BasePage {

    @FindBy(xpath = "//*[@id=\"Transferir\"]/div")
    private WebElement transferButton;

    public void clickTransferButton(){
        Events.click(transferButton);
    }
}

package uitesting.upb.org.Pages.Wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.Pages.BasePage;
import uitesting.upb.org.manageevents.Events;

public class TransferWindow extends BasePage {

    @FindBy(xpath = "//*[@id=\"popupTransferir\"]/div/div/div[1]/span")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"popupTransferir\"]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div")
    private WebElement amount;

    @FindBy(xpath = "//*[@id=\"Monto\"]")
    private  WebElement amounTitle;

    @FindBy(xpath = "//*[@id=\"popupTransferir\"]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[1]")
    private WebElement account;

    @FindBy(xpath = "//*[@id=\"Cerrar\"]")
    private WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"Cerrar\"]/div")
    private WebElement closeButtonTitle;

    @FindBy(xpath = "//*[@id=\"Transferir\"]/div")
    private WebElement transferButtonTitle;

    @FindBy(xpath = "//*[@id=\"Transferir\"]/div")
    private WebElement transferButton;


    @FindBy(xpath = "//*[@id=\"popupTransferir\"]/div/div")
    private WebElement transferWindow;


    public boolean windowIsVisible(){
        return Events.isVisible(transferWindow);
    }

    public boolean titleIsVisible(){
        return Events.isVisible(title);
    }

    public String getTitle(){
        return title.getText();
    }

    public boolean accountFieldExists(){
        return Events.isVisible(account);
    }

    public boolean amountIsVisible(){
        return Events.isVisible(amount);
    }

    public boolean closeButtonIsVisible(){
        return Events.isVisible(closeButton);
    }

    public String closeButtonTitle(){
        return Events.getText(closeButtonTitle);
    }

    public boolean transferButtonIsVisible(){
        return Events.isVisible(transferButton);
    }

    public String transferButtonTitle(){
        return transferButton.getText();
    }
}

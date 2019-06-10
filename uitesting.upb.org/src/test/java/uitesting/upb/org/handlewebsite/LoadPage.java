package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.Pages.Wallet.TransferButton;
import uitesting.upb.org.Pages.Wallet.TransferWindow;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.Pages.Wallet.WalletHome;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static WalletHome loadWalletHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new WalletHome();
    }

    public static TransferButton loadTransferButton(){
        return new TransferButton();
    }

    public static TransferWindow loadTransferWindow(){
        return new TransferWindow();
    }



    public static void main(String[] args) {
        loadWalletHome();
    }
}

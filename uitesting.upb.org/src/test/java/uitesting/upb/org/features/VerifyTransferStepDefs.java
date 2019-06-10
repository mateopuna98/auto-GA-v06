package uitesting.upb.org.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import uitesting.upb.org.Pages.Wallet.TransferButton;
import uitesting.upb.org.Pages.Wallet.TransferWindow;
import uitesting.upb.org.Pages.Wallet.WalletHome;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

import static java.lang.Thread.sleep;

public class VerifyTransferStepDefs {

    WalletHome walletHome;
    TransferButton transferButton;
    TransferWindow transferWindow;
    @Given("^Browser is loaded$")
    public void browserIsLoaded() {
        walletHome = LoadPage.loadWalletHome();
    }

    @And("^Window is maximized$")
    public void windowIsMaximized() {
        DriverManager.getInstance().maximizar();
    }

    @And("^Link is \"([^\"]*)\"$")
    public void linkIs(String link)  {
        Assert.assertEquals(link,DriverManager.getInstance().getURL());
    }

    @Then("^Search Transfer button$")
    public void searchTransferButton() {
        Assert.assertTrue(walletHome.transferButtonIsVisible());
    }

    @And("^Title is \"([^\"]*)\"$")
    public void titleIs(String title) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(title,walletHome.getTransferButtonTitle());
    }

    @Then("^Click Transfer button$")
    public void clickTransferButton() throws InterruptedException {
      transferButton = LoadPage.loadTransferButton();
      transferButton.clickTransferButton();
      Thread.sleep(1000);
    }

  /*  @Then("^Search Transfer window$")
    public void searchTransferWindow() throws InterruptedException {
        transferWindow = new TransferWindow();

        Assert.assertTrue(transferWindow.windowIsVisible());
    }*/

    @And("^Title is visible$")
    public void titleIsVisible() {
        transferWindow = new TransferWindow();
        Assert.assertTrue(transferWindow.titleIsVisible());
    }

    @And("^Window Title is \"([^\"]*)\"$")
    public void windowTitleIs(String link)  {
            Assert.assertEquals(link,transferWindow.getTitle());
    }

    @Then("^Search Account field$")
    public void searchAccountField() {
        Assert.assertTrue(transferWindow.accountFieldExists());
    }

    @Then("^Search Amount Field$")
    public void searchAmountField() {
        Assert.assertTrue(transferWindow.amountIsVisible());
    }

    @Then("^Search Close Button$")
    public void searchCloseButton() {
        boolean tree = transferWindow.closeButtonIsVisible();
        Assert.assertTrue(tree);
    }

    @And("^Button Title is \"([^\"]*)\"$")
    public void buttonTitleIs(String name)  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(name,transferWindow.closeButtonTitle());
    }

    @Then("^Search Button \"([^\"]*)\"$")
    public void searchButton(String name) {

        Assert.assertTrue(transferWindow.transferButtonIsVisible());
    }


    @And("^The Title is \"([^\"]*)\"$")
    public void theTitleIs(String title)  {

        String titulo = transferWindow.transferButtonTitle();
        Assert.assertEquals(title,transferWindow.transferButtonTitle());
    }
}

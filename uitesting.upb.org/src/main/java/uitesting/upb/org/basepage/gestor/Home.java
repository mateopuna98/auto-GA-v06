package uitesting.upb.org.basepage.gestor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.basepage.BasePage;


public class Home extends BasePage {

  @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaApiListing;

  @FindBy(xpath = "//*[@id=\"tocify-header2\"]/li/a")
    private  WebElement authentication;

  @FindBy(xpath = "//*[@id=\"tocify-header2\"]/ul/li[2]/a")
    private  WebElement demoKey;

  @FindBy(xpath = "/html/body/div[2]/div[2]/ul[2]")
  private WebElement unorderedList;

  public void clickDemoKey(){
      Events.click(demoKey);
  }

  public void clickNasaApiListing(){
      Events.click(nasaApiListing);
  }

  public void clickAuthentication(){
      Events.click(authentication);
  }

  public String obtenerTexto(){
     return  unorderedList.getText();

  }
}

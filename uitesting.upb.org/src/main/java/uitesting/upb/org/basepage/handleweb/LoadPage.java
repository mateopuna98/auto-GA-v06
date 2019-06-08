package uitesting.upb.org.basepage.handleweb;

import uitesting.upb.org.basepage.gestor.Home;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.learningselenium.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static Home loadGoogleHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        Home home = new Home();
        home.clickNasaApiListing();//Click Nasa Api Listing
        home.clickNasaApiListing();
        home.clickAuthentication();//CLick Authentication
        home.clickDemoKey();// Click DemoKey
        String resultado =  home.obtenerTexto();

        System.out.println("");
        System.out.println("TEXTO OBTENIDO:");
        System.out.println("-----------------------");
        System.out.println(resultado);
        System.out.println("-----------------------");

        return new Home();
    }

    public static void main(String[] args) {
        loadGoogleHome();
    }
}
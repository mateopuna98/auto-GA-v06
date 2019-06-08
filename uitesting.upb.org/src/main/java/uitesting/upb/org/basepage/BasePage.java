package uitesting.upb.org.basepage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uitesting.upb.org.learningselenium.DriverManager;


public class BasePage {
    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}



//Test Suite: Conjunto de casos de prueba para verificar el comportamiento de una especificacion

//Test Suite ====== Feature
//1 test suite puede tener 1 o mas test cases

/*
* Palabras reservadas":
* Given When Then And
* */
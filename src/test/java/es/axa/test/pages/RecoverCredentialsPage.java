package es.axa.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MedicalDirectoryPage")
public class RecoverCredentialsPage extends BasePage {

    /* constructor */
    @Autowired
    public RecoverCredentialsPage(WebDriver driver) {
        super(driver);
    }

    /*********Page Variables********* */
        String url = "https://loc3.caixabank.es/GPeticiones?PN=RPL&PE=21&IDIOMA=02&CANAL=I&DEMO=0&ENTORNO=1";

    /* web elements */
    private By nationalIdentityCardNumberInput = By.id("numeroDocumento");
    private By cardNumerInput = By.id("numeroTarjeta");
    private By submit = By.cssSelector(".boton_31continuar");
    private By alert = By.id("erroresV2");

    /* page methods */
    //Go to Homepage
    public RecoverCredentialsPage goTo (){
        navigateTo(this.url);
        return this;
    }

    public RecoverCredentialsPage performLogin (String idCardNumer, String cardDigits) throws Throwable {
        click(nationalIdentityCardNumberInput);
        writeText(nationalIdentityCardNumberInput, idCardNumer);
        click(cardNumerInput);
        writeText(cardNumerInput, cardDigits);
        click(submit);
        return this;
    }

    public WebElement getAlert() {
        return driver.findElement(alert);
    }
}

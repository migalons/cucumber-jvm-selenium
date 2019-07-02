package es.axa.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MedicalDirectoryPage")
public class LoginPage extends BasePage {

    /* constructor */
    @Autowired
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /*********Page Variables********* */
        String url = "https://www.caixabank.es/particular/home/particulares_es.html?loce=sh-part-Segmentos-1-terrat-NA-Particulares-NA";

    /* web elements */
    private By usernameInput = By.id("lineaabierta-login");
    private By passwordInput = By.id("lineaabierta-pin");
    private By submit = By.cssSelector("input[name=\"login\"]");
    private By acceptCookie = By.id("cookies-accept-full");
    private By alert = By.cssSelector(".alert");

    /* page methods */
    //Go to Homepage
    public LoginPage goTo (){
        navigateTo(this.url);
        click(acceptCookie);
        return this;
    }

    public LoginPage performLogin (String username, String password) throws Throwable {
        Thread.sleep(1000);
        click(usernameInput);
        writeText(usernameInput, password);
        click(passwordInput);
        writeText(passwordInput, password);
        click(submit);
        return this;
    }

    public WebElement getAlert() {
        return driver.findElement(alert);
    }
}

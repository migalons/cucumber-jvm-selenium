package es.axa.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    //Constructor
    public BasePage (WebDriver driver) {
        this.driver = driver;
//        wait = new WebDriverWait(driver,15);
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Navigate Method
    public void navigateTo(String url) {
        driver.get(url);
    }

    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        assertEquals(elementBy, expectedText);

    }
}

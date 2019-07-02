package es.axa.test.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import es.axa.test.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps implements En {

    private final LoginPage loginPage;

    @Autowired
    public LoginSteps(LoginPage loginPage) {

        this.loginPage = loginPage;

        Given("^a user at public page$", () -> {
            loginPage.goTo();
        });

        When("^he introduces wrong credentials$", () -> {
            loginPage.performLogin("1111111X", "1234");
        });

        Then("^he gets an alert message$", () -> {
            assert (loginPage.getAlert() != null);
        });


    }

}

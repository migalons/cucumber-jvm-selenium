package es.axa.test.support;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import es.axa.test.framework.Config;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Config.class)
public class Hooks implements En {

    public Hooks() {


        Before((Scenario scenario) -> {
            //todo
        });

        After((Scenario scenario) -> {
            //todo
        });

    }

}

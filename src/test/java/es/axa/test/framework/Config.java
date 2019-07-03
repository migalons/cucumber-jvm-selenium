package es.axa.test.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.net.URL;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("es.axa.test")
public class Config {

    @Value("${browser.name:chrome}")
    private String browserName;

    @Value("${selenium.host:localhost}")
    private String seleniumHost;

    @Value("${selenium.port:4444}")
    private String seleniumPort;

    @Value("${selenium.protocol:http}")
    private String seleniumProtocol;

    @Value("${selenium.path:/wd/hub}")
    private String seleniumPath;

    @Bean(destroyMethod = "quit")
    public WebDriver webDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browserName);
        return new RemoteWebDriver(new URL(seleniumProtocol + "://" + seleniumHost + ":" + seleniumPort +
                seleniumPath), capabilities);
    }

    @Bean
    public Logger logger() {
        return LogManager.getLogger("es.axa.test");
    }

}
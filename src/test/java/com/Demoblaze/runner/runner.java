package com.Demoblaze.runner;

import com.Demoblaze.utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        tags = "@wip",
        glue = "/com/Demoblaze/stepDefs",
        dryRun = false
)
public class runner {


        @Before()
        public void setUp() {
                Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
        @AfterClass()
        public static void tearDown() {
                Driver.getDriver().quit();}
}
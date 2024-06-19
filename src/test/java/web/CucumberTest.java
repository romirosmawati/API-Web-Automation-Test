package web;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"src/test/java/api/StepDef", "src/test/java/web/StepDef"},
        features = {"src/test/resources/features"},
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)

public class CucumberTest {
}
package stepDefs;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/FeatureFiles",glue= "stepDefs", tags="@testClearTrip"
		)
public class TestRunner {

}
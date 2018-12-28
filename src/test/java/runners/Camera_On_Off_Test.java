package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Camera_On_Off.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
        , tags = {"@desktop"}
)


@Test
public class Camera_On_Off_Test extends AbstractTestNGCucumberTests {

	
	}




package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Send_Receive_Message_A_B.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
        , tags = {"@desktop","@UserA","@UserB"}
)


@Test
public class Send_Receive_Message_Test extends AbstractTestNGCucumberTests {

	
	}




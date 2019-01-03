package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Login_1_UC_Skype_correct_crdentials.feature",
		"src/test/resources/features/Login_2_UC_only_correct_crdentials.feature",
		"src/test/resources/features/Login_3_UC_only_Incorrect_crdentials.feature",
		"src/test/resources/features/Login_4_Correct_UC_Incorrect_Skype_.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
        , tags = {"@desktop"}

)


@Test

public class Login_Scenarios_Test extends AbstractTestNGCucumberTests {

	
	}




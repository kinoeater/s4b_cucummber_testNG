package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Call_TCs_1_Basic_Call.feature","src/test/resources/features/Call_TCs_2_Mic_Off_On.feature",
		"src/test/resources/features/Call_TCs_3_Camera_On_Off.feature","src/test/resources/features/Call_TCs_4_Screen_Share.feature","src/test/resources/features/Call_TCs_5_Hold_Unhold.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
        , tags = {"@desktop"}

)


@Test

public class Test_Test extends AbstractTestNGCucumberTests {

	
	}




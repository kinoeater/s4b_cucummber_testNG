package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resources/features/Contacts_TCs_1_Search_Contact.feature","src/test/resources/features/Contacts_TCs_2_view_contact_details.feature",
		"src/test/resources/features/Contacts_TCs_3_add_contact_favorites.feature", "src/test/resources/features/Contacts_TCs_4_create_remove_contact_group.feature"
		
		}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumberextent-reports"}
        , tags = {"@desktop","@UserA"}
)


public class Contacts_Related__report_Test extends AbstractTestNGCucumberTests {

	
	}




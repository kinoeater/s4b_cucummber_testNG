package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Contacts_TCs_1_Search_Contact.feature","src/test/resources/features/Contacts_TCs_2_view_contact_details.feature",
		"src/test/resources/features/Contacts_TCs_3_add_contact_favorites.feature", "src/test/resources/features/Contacts_TCs_4_create_remove_contact_group.feature"
		
		}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
        , tags = {"@desktop","@UserA"}
)


@Test
public class Contacts_Related_Test extends AbstractTestNGCucumberTests {

	
	}




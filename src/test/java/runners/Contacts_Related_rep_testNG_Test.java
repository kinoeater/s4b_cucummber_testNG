package runners;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;

import cucumber.api.CucumberOptions;

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
     //   excludeCoverageTags = {"@flaky" },
      //  includeCoverageTags = {"@passed" },
        outputFolder = "target")

@CucumberOptions(features = {"src/test/resources/features/Contacts_TCs_1_Search_Contact.feature","src/test/resources/features/Contacts_TCs_2_view_contact_details.feature",
		"src/test/resources/features/Contacts_TCs_3_add_contact_favorites.feature", "src/test/resources/features/Contacts_TCs_4_create_remove_contact_group.feature"
		
		}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty","html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" }
        , tags = {"@desktop","@UserA"}
)

public class Contacts_Related_rep_testNG_Test extends ExtendedTestNGRunner {
}
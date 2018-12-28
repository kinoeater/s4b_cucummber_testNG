package stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import static utility.HookC.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class mystepdefinitions_C {

	
	static RemoteWebDriver Cdriver;
	static Properties selectors = new Properties();
	
    static {
        try {
            selectors.load(mystepdefinitions_C.class.getResourceAsStream("selector.properties"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	
	
	
    
    @SuppressWarnings("static-access")
	public mystepdefinitions_C() {
        this.Cdriver = getCdriver();
    }
    
  /*  @After()
    
        public void Backup_old_report_folder() throws IOException {
    
    	Take_TestOutput_Backup();
            
    
        }  */
    
           
    @Given("^UserC is launched and logs in \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userc_is_launched_and_logs_in_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {
    	RemoteLaunch_Client_C();
    	
    }
       
    @Given("^UserC is launched$")
    public void userc_is_launched() throws Throwable {
    	  RemoteLaunch_Client_C();
    	  System.out.println("Application C is started!");
          Reporter.log("Application C is started!");
    }
   
    @When("^UserC clicks \"([^\"]*)\"$")
    public void userc_clicks_something(String strArg1) throws Throwable {
    	clickC(selectors.getProperty(strArg1));
    }

    @Then("^UserC can see \"([^\"]*)\" on \"([^\"]*)\" location$")
    public void userc_can_see_something_on_something_location(String strArg1, String strArg2) throws Throwable {
    	verifyC(strArg1,selectors.getProperty(strArg2));
    }

    @And("^UserC enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userc_enters_something_to_something(String strArg1, String strArg2) throws Throwable {
    	typeC(selectors.getProperty(strArg2), strArg1);
    }


    @And("^UserC exits client$")
    public void userb_exits_client() throws Throwable {
    	System.out.println("Exiting the Application C!");
        Reporter.log("Exiting the Application C!"); 
    	teardownC();
    	Thread.sleep(5000);
     	
    }
    
}

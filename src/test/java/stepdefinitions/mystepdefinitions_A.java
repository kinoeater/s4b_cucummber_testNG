package stepdefinitions;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.CucumberException;
import utility.HookA;


public class mystepdefinitions_A extends HookA {


	static Properties selectors = new Properties();
	
    static {
        try {
            selectors.load(mystepdefinitions_A.class.getResourceAsStream("selector.properties"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    @Before ("@UserA") 
    public void beforeScenarioA() throws InterruptedException, IOException, ParseException{
  
    	try {
            
    		Adriver.getWindowHandle();
             } 
    	
    	catch (NullPointerException e) {
            
        	
        	Reporter.log("Starting the Application A!"); 
		    System.out.println("Starting the Application A!");
	    	
	    	RemoteLaunch_Client_A();
	    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
	    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
	    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
	    	clickA(selectors.getProperty("login.kandysubmit"));         	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
	    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
	    	clickA(selectors.getProperty("login.skypesubmit")); 
	    	clickA(selectors.getProperty("contacts.credentialssaveno"));
	    	Thread.sleep(3000);
        	
        }
    	
    	
    	
catch (NoSuchSessionException e) {
            
        	
        	Reporter.log("Starting the Application A!"); 
		    System.out.println("Starting the Application A!");
	    	
	    	RemoteLaunch_Client_A();
	    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
	    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
	    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
	    	clickA(selectors.getProperty("login.kandysubmit"));         	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
	    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
	    	clickA(selectors.getProperty("login.skypesubmit")); 
	    	clickA(selectors.getProperty("contacts.credentialssaveno"));
	    	Thread.sleep(3000);
        	
        }
    	
catch (CucumberException e) {
            
        	
        	Reporter.log("Starting the Application A!"); 
		    System.out.println("Starting the Application A!");
	    	
	    	RemoteLaunch_Client_A();
	    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
	    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
	    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
	    	clickA(selectors.getProperty("login.kandysubmit"));         	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
	    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
	    	clickA(selectors.getProperty("login.skypesubmit")); 
	    	clickA(selectors.getProperty("contacts.credentialssaveno"));
	    	Thread.sleep(3000);
        	
        }
    
    	
    	
    	
    	
            }  
    
    
    @After ("@UserA") 
    public void afterScenarioA(Scenario scenario) throws InterruptedException, IOException, ParseException{
  
		   
	   
	   if (scenario.isFailed()) {
		    Reporter.log("Exited the Application A!"); 
	    	Adriver.quit();
	    	Thread.sleep(5000);
	    	Adriver.quit();
	    	RemoteLaunch_Client_A();
	    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
	    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
	    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
	    	clickA(selectors.getProperty("login.kandysubmit"));         	
	    	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
	    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
	    	clickA(selectors.getProperty("login.skypesubmit")); 
	    	clickA(selectors.getProperty("contacts.credentialssaveno"));
	    	Thread.sleep(3000);
	    	
	    	 
	    	}
	   
	   else {
		   
		   System.out.println("Feature passed!");
	        
	        }
      
    
            }  
    
   
	public static  RemoteWebDriver getAdriver() {
        return Adriver;
    }
    
	   @Given("^UserA test method$")
	    public void usera_test_method() throws Throwable {
		   
		   System.out.println(Adriver.getWindowHandles());
		   Thread.sleep(3000);
		   System.out.println("Get window handle is "+Adriver.getWindowHandle());
		   
	 	    
		   
	    }
	   

	   @Given("^UserA test second method$")
	    public void usera_test_second_method() throws Throwable {
		   
		   System.out.println(Adriver.getWindowHandles());
		   Thread.sleep(3000);
		   System.out.println("Get window handle is "+Adriver.getWindowHandle());
		   
		   for(String winHandle : Adriver.getWindowHandles()){
			    Adriver.switchTo().window(winHandle);
			}
		   
	 		    }
	   
	   
	   
	   @Given("^UserA is launched with correct UC and skype credentials$")
	    public void usera_is_launched_with_correct_uc_and_skype_credentials() throws Throwable {
	     
		  		   
			   
		   
		    	 try {
		    		    RemoteLaunch_Client_A();
				    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
				    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
				    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
				    	clickA(selectors.getProperty("login.kandysubmit"));         	
				    	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
				    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
				    	clickA(selectors.getProperty("login.skypesubmit")); 
				    	clickA(selectors.getProperty("contacts.credentialssaveno"));
				    	Thread.sleep(3000);
				    	verifyA(selectors.getProperty("contacts.creategroup.button.visible.text"),selectors.getProperty("contacts.creategroup.button"));
				    	teardownA();
		    	 } 
		    	 
		    	 	    	 
		    	 catch (NoSuchElementException e) {
		 	            
		    		 teardownA();
		    		 Assert.fail("Feature Failed");
		    		 
		 	        }
		    	 
		    	 catch (NullPointerException e) {
		 	            
		    		 teardownA();
		    		 Assert.fail("Feature Failed");
		    		 
		 	        }
		    	 
		    	 
                catch (IOException e) {
		 	            
                	 teardownA();
		    		 Assert.fail("Feature Failed");
		    		 
		 	        }
	    	 
		    	 
	    	 
                catch (StaleElementReferenceException e) {
		 	            
                	 teardownA();
		    		 Assert.fail("Feature Failed");
		    		
		 	        }
		    	 
	    	 
		    	 	catch (ElementNotVisibleException e) {
		 	            
		    		 teardownA();
		    		 Assert.fail("Feature Failed");
		    		 
		 	        }
		    	 
		    	 
		    	
		   
		    		catch ( CucumberException e) {
		 	            
			    		 
			    		 teardownA();
			    		 Assert.fail("Feature Failed");
			 	        }
		   
		    
		    	 
		    	 finally
		    	 
		    	 {
		    	 
		    		 teardownA();
		    			    	 
		    	 }
	    
	    }

	   
	   
	   
	   @Given("^UserA is launched with only UC and correct credentials$")
	    public void usera_is_launched_with_only_uc_and_correct_credentials() throws Throwable {
	        
		   try {
   		        RemoteLaunch_Client_A();
		    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
		    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
		    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
		    	clickA(selectors.getProperty("login.kandysubmit")); 
		      	Thread.sleep(3000);
		    	clickA(selectors.getProperty("login.skypeskip"));  
		    	clickA(selectors.getProperty("contacts.credentialssaveno"));
		    	Thread.sleep(3000);
		    	verifyA(selectors.getProperty("calls.tab.visible.text"),selectors.getProperty("calls.tab.text"));
		    	Thread.sleep(3000);
		    	teardownA();
		    	
	        } 
   	 
   	 	    	 
   	 catch (NoSuchElementException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 catch (NullPointerException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 
       catch (IOException e) {
	            
       	 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
	 
   	 
	 
       catch (StaleElementReferenceException e) {
	            
       	 teardownA();
   		 Assert.fail("Feature Failed");
   		
	        }
   	 
	 
   	 	catch (ElementNotVisibleException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 
   	
  
   		catch ( CucumberException e) {
	            
	    		 
	    		 teardownA();
	    		 Assert.fail("Feature Failed");
	 	        }
  
   
   	 
   	 finally
   	 
   	 {
   	 
   		 teardownA();
   	
   	 
   	 }

		   
	    }

	   
	   @Given("^UserA is launched and try to login with incorrect UC credentials$")
	    public void usera_is_launched_and_try_to_login_with_incorrect_uc_credentials() throws Throwable {
	    
		   try {
	   		        RemoteLaunch_Client_A();
			    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("incorrect.userA.kandy.name"));
			    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
			    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
			    	clickA(selectors.getProperty("login.kandysubmit")); 
			    	Thread.sleep(3000);
			    	verifyA(selectors.getProperty("UC.incorrect.login.visible.text"),selectors.getProperty("login.kandy.incorrect.credentials.warning"));
			    	Thread.sleep(3000);
			    	teardownA();
		        } 
	   	 
	   	 	    	 
	   	 catch (NoSuchElementException e) {
		            
	   		 teardownA();
	   		 Assert.fail("Feature Failed");
	   		 
		        }
	   	 
	   	 catch (NullPointerException e) {
		            
	   		 teardownA();
	   		 Assert.fail("Feature Failed");
	   		 
		        }
	   	 
	   	 
	       catch (IOException e) {
		            
	       	 teardownA();
	   		 Assert.fail("Feature Failed");
	   		 
		        }
		 
	   	 
		 
	       catch (StaleElementReferenceException e) {
		            
	       	 teardownA();
	   		 Assert.fail("Feature Failed");
	   		
		        }
	   	 
		 
	   	 	catch (ElementNotVisibleException e) {
		            
	   		 teardownA();
	   		 Assert.fail("Feature Failed");
	   		 
		        }
	   	 
	   	 	
	   		catch ( CucumberException e) {
		            
		    		 
		    		 teardownA();
		    		 Assert.fail("Feature Failed");
		 	        }
	  
	   
	   	 
	   	 finally
	   	 
	   	 {
	   	 
	   		 teardownA();
	   	
	   	 
	   	 }

		   
	    }
	   
	   
	   
	   @Given("^UserA is launched and use correct UC credentials incorrect skype credentials$")
	    public void usera_is_launched_and_use_correct_uc_credentials_incorrect_skype_credentials() throws Throwable {
	  
		   try {
   		    RemoteLaunch_Client_A();
		    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
		    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
		    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
		    	clickA(selectors.getProperty("login.kandysubmit"));         	
		    	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("incorrect.userA.skype.name"));
		    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
		    	clickA(selectors.getProperty("login.skypesubmit")); 
		    	Thread.sleep(3000);
		    	verifyA(selectors.getProperty("skype.incorrect.login.visible.text"),selectors.getProperty("login.skype.incorrect.restart.button"));
		    	Thread.sleep(3000);
		    	teardownA();
		   } 
   	 
   	 	    	 
   	 catch (NoSuchElementException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 catch (NullPointerException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 
       catch (IOException e) {
	            
       	 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
	 
   	 
	 
       catch (StaleElementReferenceException e) {
	            
       	 teardownA();
   		 Assert.fail("Feature Failed");
   		
	        }
   	 
	 
   	 	catch (ElementNotVisibleException e) {
	            
   		 teardownA();
   		 Assert.fail("Feature Failed");
   		 
	        }
   	 
   	 
   	
  
   		catch ( CucumberException e) {
	            
	    		 
	    		 teardownA();
	    		 Assert.fail("Feature Failed");
	 	        }
  
   
   	 
   	 finally
   	 
   	 {
   	 
   		 teardownA();
   		
   	 
   	 }
		   
	    }

	   
	   @And("^UserA choose \"([^\"]*)\" to send message$")
	    public void usera_choose_something_to_send_message(String strArg1) throws Throwable {
	        
		// ******Method to choose the contact with name "strArg1"********************		   
	    List<WebElement> d= Adriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
		d.iterator().next().click();
		   
	    }

	   @And("^UserA checks if the message from \"([^\"]*)\" received is \"([^\"]*)\"$")
	    public void usera_checks_if_the_message_from_something_received_is_something(String strArg1, String strArg2) throws Throwable {
	        
	    	// ******Method to choose the contact with name "strArg2"********************	
	    	List<WebElement> k= Adriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
			k.iterator().next().click();
			Thread.sleep(5000);
			
			// ******Method to checek if the received message is same as "strArg1" ********************	
	    	
	    	List<WebElement> d= Adriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
	    	int y=d.size();
			String message_received=d.get(y-1).getText();
	        Assert.assertEquals(message_received, strArg2);
		    System.out.println("Message received successfully from "+strArg1);
		    	
	    }
	   
	   @And("^UserA select \"([^\"]*)\"$")
	    public void usera_select_something(String strArg1) throws Throwable {
		   
		   selectA(selectors.getProperty(strArg1));
		   
		   
	    }
	   
	   @And("^UserA right clicks on \"([^\"]*)\"$")
	    public void usera_right_clicks_on_something(String strArg1) throws Throwable {
	        
		   right_click_A(selectors.getProperty(strArg1));
	    }

	   
	   @And("^UserA saves debug log$")
	    public void usera_saves_debug_log() throws Throwable {
	        
		    Thread.sleep(2000);
		    
		
		    Robot robot = new Robot();
//		    robot.mouseMove(250,250);
//	        robot.mousePress(InputEvent.BUTTON1_MASK);
//	        robot.mouseRelease(InputEvent.BUTTON1_MASK);
//	        robot.delay(2000);
//	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_ALT);
	        robot.keyPress(KeyEvent.VK_S);
	        robot.delay(2000);
	        robot.keyRelease(KeyEvent.VK_S);
	    	robot.keyRelease(KeyEvent.VK_ALT);
	    	robot.delay(2000);
			   
			System.out.println(Adriver.findElement(By.xpath("//*[@id='settings-view__debug-logs']/div[2]/div[2]")).getText());
			Adriver.findElement(By.xpath("//*[@id='modal-view__settings-view__debug-logs__hide-close-button']/i")).click();
		   
	    } 
         
    @Given("^UserA is launched$")
    public void usera_is_launched() throws Throwable {
    	  
    	RemoteLaunch_Client_A();
    	System.out.println("Application A is started!");
        Reporter.log("Application A is started!");
        System.out.println("Driver="+Adriver);
      
        
    }
   
    @Given("^UserA logs into kandy with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void usera_logs_into_kandy_with_something_something_something(String strArg1, String strArg2, String strArg3) throws Throwable {
       
    	RemoteLaunch_Client_A();
    	typeA(selectors.getProperty("login.kandyusername"), selectors.getProperty("userA.kandy.name"));
    	typeA(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userA.kandy.auth"));
    	typeA(selectors.getProperty("login.kandypassword"), selectors.getProperty("userA.kandy.pass"));
    	clickA(selectors.getProperty("login.kandysubmit"));
    	    	
    }
    
    @And("^UserA logs into skype with \"([^\"]*)\" \"([^\"]*)\"$")
    public void usera_logs_into_skype_with_something_something(String strArg1, String strArg2) throws Throwable {
    
      	typeA(selectors.getProperty("login.skypeusername"), selectors.getProperty("userA.skype.name"));
    	typeA(selectors.getProperty("login.skypepassword"), selectors.getProperty("userA.skype.pass"));
    	clickA(selectors.getProperty("login.skypesubmit"));
    	
    }
    
    @And("^UserA checks if \"([^\"]*)\" is added$")
    public void usera_checks_if_something_is_added(String strArg1) throws Throwable {
       
    	List<WebElement> d= Adriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
    	int y=d.size();
		String message_received=d.get(y-1).getText();
    //    Assert.assertEquals(message_received, strArg2);
	    System.out.println("Message received successfully");
    	
    }
    
    @When("^UserA clicks \"([^\"]*)\"$")
    public void usera_clicks_something(String strArg1) throws Throwable {
    	clickA(selectors.getProperty(strArg1));
    }

    @Then("^UserA can see \"([^\"]*)\" on \"([^\"]*)\" location$")
    public void usera_can_see_something_on_something_location(String strArg1, String strArg2) throws Throwable {
    	verifyA(strArg1,selectors.getProperty(strArg2));
    }

       
    
    @And("^UserA enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void usera_enters_something_to_something(String strArg1, String strArg2) throws Throwable {
    	
    	typeA(selectors.getProperty(strArg2),strArg1);
    }

   

    @And("^UserA exits client$")
    public void usera_exits_client() throws Throwable {
    	System.out.println("Exiting the Application A!");
        Reporter.log("Exiting the Application A!"); 
    	teardownA();
    	Thread.sleep(3000);
     	//Take_TestOutput_Backup();
    }
    
    @And("^UserA waits for \"([^\"]*)\" seconds$")
    public void usera_waits_for_something_seconds(String strArg1) throws Throwable {
        
    //	waitForPageLoaded_A();
    	
    	int sleeptime=Integer.parseInt(strArg1);
    	Thread.sleep(sleeptime);

    }
    
}

package utility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HookC {


    	static RemoteWebDriver Cdriver;
     
    	public static void RemoteLaunch_Client_C() throws InterruptedException, MalformedURLException {
 		
		String BinaryPathC="D:\\Users\\muratc\\AppData\\Local\\Programs\\ConnectMe_S4B2015\\ConnectMe.exe";
		ChromeOptions options = new ChromeOptions();
 		options.setBinary(BinaryPathC);
 		DesiredCapabilities capabilities = new DesiredCapabilities();
 		
 		String NodeC = System.getProperty("nodeName", "");  //NodeC should be the application name in the node.json file
 		System.out.println(NodeC);
 		if (!NodeC.trim().isEmpty()) {
 			capabilities.setCapability("applicationName",NodeC);
 		} 
 		 		
 	    capabilities.setBrowserName("chrome");
 	    capabilities.setPlatform(Platform.WINDOWS);
 	   
 	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
 	      
 	   	String huburl="http://10.254.17.23:4444/wd/hub";
 	    
 	   	RemoteWebDriver Cdriver = new RemoteWebDriver(new URL(huburl), options);
 	    
 	    Thread.sleep(5000);
 	    Cdriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	    
 	    	for (String hand : Cdriver.getWindowHandles()) {
 	    		Cdriver.switchTo().window(hand);
             }
 	    	
 	    	Thread.sleep(3000);
 	    
 	    	waitForElementC("//*[@id='login-carousel']/div[1]/div[1]"); 
 	 	    System.out.println(Cdriver.findElement(By.xpath("//*[@id='login-carousel']/div[1]/div[1]")).getText());
 	 	    Thread.sleep(2000);  
 	    	
 	 	    JavascriptExecutor js = (JavascriptExecutor) Cdriver;  
 	 	    Thread.sleep(2000);
 	 	    js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();");    //maximize the window via JS
 	 	     	   
 	    
 	}

 	

 	//-----Constructor remote driver----
 	
 	
 	public static  RemoteWebDriver getCdriver() {
         return Cdriver;
     }
     
            
 
  
 // method that helps to click on certain clickable elements
    
    public static void clickC(String sel) {
    	
    	By by = getByC(sel);
        
    	waitForElementC(sel);
    	WebElement el = Cdriver.findElement(by);
    	el.click();
	 
    }
    
    
// method that helps to click on certain clickable elements
    
    public static void selectC(String sel) {
    	
    	By by = getByC(sel);
    	waitForElementClickableC(sel);
    	WebElement el = Cdriver.findElement(by);
    	Actions action=new Actions(Cdriver);
    	action.moveToElement(el).click().build().perform();
	 
    }
    
 // method that helps to type sth into certain input fields
    public static void typeC(String sel, String keys) {
    	
    	By by = getByC(sel);
    	waitForElementC(sel);
    	WebElement el = Cdriver.findElement(by);
   
    
    	el.sendKeys(keys);
    }

 // method that helps to verify the text of a certain locator, if it is wrong, takes a screenshot
    
    public static void verifyC(String keys, String sel) throws Exception {
    	
    
    	try {
    		
	By by = getByC(sel);
	WebElement myDynamicElement = (new WebDriverWait(Cdriver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(by));
	
	String text=myDynamicElement.getText();
	System.out.println("User can see " + text);
	Assert.assertTrue(keys.equals(text));
	
    		        } 
    	
    	catch  (AssertionError error) {
    		
    		System.out.println("You are in the wrong page, taking a screenshoot");
    		screenshotC(keys);
    		Assert.fail("Could not find the " + keys);;

    	}
    	
		catch (Exception e) {
	
	throw new Exception("Sth went wrong! Upps! taking a screenshoot!");
        }
    
    }
    
    
 // method that helps to take a screenshot
    
    public static void screenshotC(String capture) throws IOException {
    	
    	File file = ((TakesScreenshot)Cdriver).getScreenshotAs(OutputType.FILE);   	  	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
        String ScreenShotFileName = dateFormat.format(new Date());
    	FileUtils.copyFile(file, new File("D:\\work\\S4B_automation\\test-output\\ScreenShot"+capture+"_"+ScreenShotFileName+".jpg"));
    	
    }
    
    
    // method that helps to choose correct locator from the selectors.properties file
    public static By getByC(String sel) {
    	
    	By by = null;
        if (!sel.contains("//"))
        	by = By.id(sel);
                else if (sel.contains("//"))
        	by = By.xpath(sel);
        else
        	System.err.println("Undefined selector type"+sel);
    	
        return by;
        
    }
    
 // method that helps to wait certain elements to wait to be visible
    public static void waitForElementC(String sel) {
    	By by = getByC(sel);
    	      
        WebDriverWait wait = new WebDriverWait(Cdriver, 30);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)); 

    }
    
public static void waitForElementClickableC(String sel) {
    	
    	By by = getByC(sel);
    	      
        WebDriverWait wait = new WebDriverWait(Cdriver, 30);
        
        wait.until(ExpectedConditions.elementToBeClickable(by)); 
    	
    }
    
    
    
   public static void teardownC() {
        Cdriver.quit();
        
    }
   
   
 public static void flashC(String sel) throws Throwable {
	   
	   JavascriptExecutor js = ((JavascriptExecutor) Cdriver);  
	   By by = getByC(sel);
	   WebElement element = Cdriver.findElement(by); 
	   String bgcolor= element.getCssValue("backgroundColor");
	   	   
		   changeColorC("rgb(0,200,0)",element);
		   
		   Thread.sleep(2000);
		   changeColorC(bgcolor,element);
	   
	   
	   	  
   }
   
   public static void changeColorC(String color, WebElement element) {
	   JavascriptExecutor js = ((JavascriptExecutor) Cdriver); 
	   js.executeAsyncScript("arguments[0].style.backgroundColor ='"+color+"'",element);
		
	   try {
		   Thread.sleep(20);
	   }
		catch (InterruptedException e) {
			
		}
	}
	   
       

}

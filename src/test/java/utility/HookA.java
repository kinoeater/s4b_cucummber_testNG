package utility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HookA {


	    public static RemoteWebDriver Adriver;
    	
	    
	    	    
	    public static void RemoteLaunch_Client_A() throws InterruptedException, FileNotFoundException, IOException, org.json.simple.parser.ParseException {
	    
	    String BinaryPathA="D:\\ConnectMe_Desktop_forSVAutomation\\ConnectMe Desktop - forSVAutomation.exe";
	    String huburl="http://217.78.102.224:4444/wd/hub";
	
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary(BinaryPathA);
		
 		DesiredCapabilities capabilities = new DesiredCapabilities();
 		

 		
 		capabilities.setBrowserName("chrome");
 	    capabilities.setPlatform(Platform.ANDROID);
 	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
 
 	     	   	 	    
 	    Adriver = new RemoteWebDriver(new URL(huburl), options);
 	    
 	    Thread.sleep(10000);
 	
 	    
 	    for (String hand : Adriver.getWindowHandles()) {
 	    	Adriver.switchTo().window(hand);
             }
 	    	
 	    	    	
 	    WebDriverWait wait = new WebDriverWait(Adriver, 30);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-carousel']/div[1]/div[1]")));
 	    
 	     	 	     	    	
 	 	JavascriptExecutor js = (JavascriptExecutor) Adriver;  
 	 	Thread.sleep(1000);
 	 	js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();");    //maximize the window via JS
 	 	    
 	 	 	    
 	}
	    
	    
	    
	    public static void teardownA() {
	         Adriver.quit();
	         
	     }

	    
	    
	  
    //-----Constructor remote driver----
 	
 		public static  WebDriver getAdriver() {
      return Adriver;
   }


 		//---read JSON file---
 		
 		
 		public static String readjsonfile (String path,String key) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
 			
 		JSONParser parser=new JSONParser();
		Object obj =parser.parse(new FileReader(path));
		JSONObject jo = (JSONObject) obj; 
		String value=(String) jo.get(key);
		
		System.out.println(value);
		return value;
		
 		}
 		
 		  
 // method that helps to click on certain clickable elements
    
    public static void clickA(String sel) {
    	
    	By by = getByA(sel);
    	waitForElementA(sel);
    	WebElement el = Adriver.findElement(by);
    	el.click();
	 
    }
    
    
// method that helps to select on certain clickable elements
    
    public static void selectA(String sel) {
    	
    	By by = getByA(sel);
    	waitForElementClickableA(sel);
    	WebElement el = Adriver.findElement(by);
    	Actions action=new Actions(Adriver);
    	action.moveToElement(el).click().build().perform();
	 
    }
    
    // method that helps to right click on certain elements    
    	public static void right_click_A(String sel) {
    	
    	By by = getByA(sel);
    	waitForElementClickableA(sel);
    	WebElement el = Adriver.findElement(by);
    	Actions action=new Actions(Adriver);
    	action.moveToElement(el).contextClick().build().perform();
	 
    }
    
    
    
    
    
 // method that helps to type sth into certain input fields
    public static void typeA(String sel, String keys) {
    	
    	By by = getByA(sel);
    	waitForElementA(sel);
    	WebElement el = Adriver.findElement(by);
       	el.sendKeys(keys);
    }

 // method that helps to verify the text of a certain locator, if it is wrong, takes a screenshot
    
    public static void verifyA(String keys, String sel) throws Exception {
    	
    
    	try {
    		
	By by = getByA(sel);
	WebElement myDynamicElement = (new WebDriverWait(Adriver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(by));
	
	String text=myDynamicElement.getText();
	
	Assert.assertTrue(keys.equals(text));
	System.out.println("User can see " + text);
//	Assert.assertEquals(keys, text);
	
	
    		        } 
    	
    	catch  (AssertionError error) {
    		
    		System.out.println("You are in the wrong page, taking a screenshoot");
    		screenshotA(keys);
    		Assert.fail("Could not find the " + keys);;

    	}
    	
		catch (Exception e) {
	
	throw new Exception("Sth went wrong! Upps! taking a screenshoot!");
        }
    
    }
    
    
 // method that helps to take a screenshot
    
    public static void screenshotA(String capture) throws IOException {
    	
    	File file = ((TakesScreenshot)Adriver).getScreenshotAs(OutputType.FILE);   	  	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
        String ScreenShotFileName = dateFormat.format(new Date());
    	FileUtils.copyFile(file, new File("D:\\work\\S4B_automation\\test-output\\ScreenShot"+capture+"_"+ScreenShotFileName+".jpg"));
    	
    }
    
    
    // method that helps to choose correct locator from the selectors.properties file
    public static By getByA(String sel) {
    	
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
    public static void waitForElementA(String sel) {
    	
    	By by = getByA(sel);
    	      
        WebDriverWait wait = new WebDriverWait(Adriver, 30);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)); 
    	
    }
    
public static void waitForElementClickableA(String sel) {
    	
    	By by = getByA(sel);
    	      
        WebDriverWait wait = new WebDriverWait(Adriver, 30);
        
        wait.until(ExpectedConditions.elementToBeClickable(by)); 
    	
    }
    
    
  
   
   
 public static void flashA(String sel) throws Throwable {
	   
	   JavascriptExecutor js = ((JavascriptExecutor) Adriver);  
	   By by = getByA(sel);
	   WebElement element = Adriver.findElement(by); 
	   String bgcolor= element.getCssValue("backgroundColor");
	   	   
		   changeColorA("rgb(0,200,0)",element);
		   
		   Thread.sleep(2000);
		   changeColorA(bgcolor,element);
	   
	   
	   	  
   }
   
   public static void changeColorA(String color, WebElement element) {
	   JavascriptExecutor js = ((JavascriptExecutor) Adriver); 
	   js.executeAsyncScript("arguments[0].style.backgroundColor ='"+color+"'",element);
		
	   try {
		   Thread.sleep(20);
	   }
		catch (InterruptedException e) {
			
		}
	}
	   
       
// This method moves the files and sub-folders of previous test output under test-output folder
   
   public static void Take_TestOutput_Backup() throws IOException
   {

   SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
   String destFilename = dateFormat.format(new Date());
   File srcFolder = new File("./test-output");
   File destFolder = new File("D:\\"+"Execution_Archive_"+destFilename);
   System.out.println("This test is done at "+destFilename+" test output is being moved to "+ "D:\\"+"Execution_Archive_"+destFilename  );

   //make sure source exists
   if(!srcFolder.exists())
   {
   System.out.println("Directory does not exist at mentioned location.");
   //just exit
   System.exit(0);
   }
   else
   {

   try
   {
   copy_Folder(srcFolder,destFolder);
   FileUtils.cleanDirectory(srcFolder);
           }
   catch(IOException e){
   e.printStackTrace();
   //error, just exit
   System.exit(0);
   }
   }
   }
   
   
   //This method copies one folder to another
   
   public static void copy_Folder(File src, File dest)
   throws IOException{

   if(src.isDirectory()){
   //if directory not exists, create it
   if(!dest.exists()){
   dest.mkdir();
   System.out.println("Directory copied from "
   + src + " to " + dest);
   }
   //list all the directory contents
   String files[] = src.list();

   for (String file : files)
   {
   //construct the src and dest file structure
   File srcFile = new File(src, file);
   File destFile = new File(dest, file);
   //recursive copy
   copy_Folder(srcFile,destFile);
   }

   }else
   {
   //if file, then copy it.
   //Use bytes stream to support all file types
   InputStream in = new FileInputStream(src);
   OutputStream out = new FileOutputStream(dest);

   byte[] buffer = new byte[1024];

   int length;
   //copy the file content in bytes
   while ((length = in.read(buffer)) > 0){
   out.write(buffer, 0, length);
   }

   in.close();
   out.close();
   System.out.println("File copied from " + src + " to " + dest);
   
   }
   }
   
   


   
    

}

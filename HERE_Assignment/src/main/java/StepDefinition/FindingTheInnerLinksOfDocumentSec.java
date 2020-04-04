package StepDefinition;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingTheInnerLinksOfDocumentSec {
	
	static List<WebElement> listOflIst = null;
	static String parentWindow = "";
	static WebDriver driver;
	
	@Given("Application is launched in the Chrome browser")
	public void browserAndApplicationLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://developer.here.com/");
		Thread.sleep(2000);
		 
	}
	
	//Navigating to document section and collecting all internal links
	@When("Home page of HERE application is opened and click on document menu")
	public void navigateToDocumentPage() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement documentTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='block-navigationblock']/div/div/div/div/div[2]/div[1]/ul/li[2]")));
		documentTab.click();
		Thread.sleep(4000);
		parentWindow = driver.getWindowHandle();
		listOflIst = driver.findElements(By.xpath("//*[@class='uk-container uk-margin-large-bottom']//a"));
		Thread.sleep(4000);
	}
	
	
	//Code for testing each links
	public static void testEachLinkURL(String URLLinks) throws IOException {
		URL linkURL = new URL(URLLinks);
		HttpURLConnection con = (HttpURLConnection)linkURL.openConnection();
		con.setConnectTimeout(3000);
		con.connect();
		if(con.getResponseCode() ==200) {
			System.out.println(URLLinks+": "+"Pass");
		}
		else {
			System.out.println(URLLinks+": "+"Fail");
		}
	}
	
	//Code for navigating to all the pages and check for the angilar load
	public static void testAngularLoad() {
		Set<String> allWindows = driver.getWindowHandles();
		for(String window : allWindows) {
			driver.switchTo().window(window);
			if(!(window==parentWindow)) {
				angularHasFinishedProcessing();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
	}
		 public static ExpectedCondition<Boolean> angularHasFinishedProcessing() {
		        return new ExpectedCondition<Boolean>() {
		            @Override
		            public Boolean apply(WebDriver driver) {
		                return Boolean.valueOf(((JavascriptExecutor) driver).executeScript("return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)").toString());
		            }
		        };
		    }

  //Final code for checking all the links and angular load
   @Then("Validate the valid links and validate the AngularJs load of the pages")
   public static void navigateAndCheckLinks(WebDriver driver) throws IOException {
	   for(int i =0; i<listOflIst.size();i++) {
		   WebElement ele = listOflIst.get(i);
			String url=ele.getAttribute("href");
		   testEachLinkURL(url);
		   ele.click();
		   testAngularLoad();
			
		   
	   }
   }
   

}

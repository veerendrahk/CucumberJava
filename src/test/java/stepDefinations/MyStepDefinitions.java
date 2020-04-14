package stepDefinations;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Cucumber.VeeruTestngapplicationname.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;
	CheckOutPage cp;
	ProductPage pp;
	
    @Given("^User is on greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    
    //1)*Inject Selenium into StepDefinitions file
/*org.openqa.selenium.WebDriver      CTRL+SHIFT+/
The main interface to use for testing, which represents an idealised web browser. The methods in this interface fall into three categories: 
•Control of the browser itself
•Selection of WebElements
•Debugging aids
Key methods are WebDriver.get(String), which is used to load a new web page, and the various methods similar to WebDriver.findElement(By), which is used to find WebElements. 
Currently, you will need to instantiate implementations of this interface directly. It is hoped that you write your tests against this interface so that you may "swap in" a more fully featured browser when there is a requirement for one.*/
//https://www.w3.org/TR/webdriver/#endpoints
    	//System.setProperty("webdriver.chrome.driver", "D:\\VeeruCucumberTestng\\VeeruTestngapplicationname\\Library\\Driver\\chromedriver_win32\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "D:\\VeeruCucumberTestng\\VeeruTestngapplicationname\\Library\\Driver\\chromedriver_win32\\chromedriver.exe");   //key,value
    	//driver=new ChromeDriver();    //Here, WebDriver is an interface, driver is a reference variable, ChromeDriver() is a Constructor, new is a keyword, and new ChromeDriver() is an Object.
    	//Why not WebDriver driver = new WebDriver(); ChromeDriver driver=new ChromeDriver(); What is RemoteWebDriver and where we use it  https://www.softwaretestingmaterial.com/webdriver-driver-new-firefoxdriver/
    	//WebDriver is an Interface. This is imported here from:import org.openqa.selenium.WebDriver;(This is present in our jar files)
    	//As we know Interface only contains signature of methods(no implementation of methods defined).The implementation are created in class ChromeDriver(). Ex:driver=new ChromeDriver(); Here WebDriver is an interface and all the methods which are declared in Webdriver interface are implemented by respective driver class. But if we do upcasting, we can run the scripts in any browser . i.e running the same automation scripts in different browsers to achieve Runtime Polymorphism.
    	//As Class ChromeDriver() is not created inside our class(MystepDifinitions) to get that methods and variables in our class we need to create object for class ChromeDriver().
    	//In above line we have created an object for class ChromeDriver().
    	//A WebDriver implementation(nothing but a class-ChromeDriver) that controls a Chrome browser running on the local machine. This class is provided as a convenience for easily testing the Chrome browser. The control server which each instance communicates with will live and die with the instance https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-chrome-driver/3.141.59/org/openqa/selenium/chrome/ChromeDriver.html
    	//https://www.softwaretestingmaterial.com/polymorphism-in-java/
     //make generic to our framework by optimizing global variables  
    	driver=Base.getdriver(); //(one way of bringing driver here)  //until this line(45) driver is just a local variable(does not have knowledge of chromebrowser) but after executing this line now driver will get its existence. Hence it passes to rest of the drivers in this class as we have initialized it globally
    	//driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
//2nd Method -There should be a mechanism to pass this driver into Homepage.java
    	Thread.sleep(1000);
        driver.manage().window().maximize();
    }

    @When("^User serached for \"([^\"]*)\" Vegitables$")
    public void user_serached_for_something_vegitables(String strArg1) throws Throwable {
    	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	h=new HomePage(driver);
    	h.getSearchfromSearchtextbox().sendKeys(strArg1);
    	System.out.println(strArg1);
    	 Thread.sleep(1000);
      
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	//Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(strArg1));
    	Assert.assertTrue(h.verifyResult().getText().contains(strArg1));

    	//System.out.println(driver.findElement(By.xpath("//h4[@class='product-name']")).getText());
    	System.out.println(h.verifyResult().getText().contains(strArg1));
    	System.out.println(strArg1);
    	Thread.sleep(1000);
    }
    
    @And("^added items to cart$")        //clicked on add to cart button on home page
    public void added_items_to_cart() throws Throwable {
    	//driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    	h.addToCart().click();
    	//System.out.println(driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).getText());  
    }

    @And("^user processeded to checkout page for purchase$")     
    public void user_processeded_to_checkout_page_for_purchase() throws Throwable {
    	//driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();    //clicked on cart (bag symbol) different window proceed to check out page is displayed
    	h.clichOnCart().click();
    	//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();      //click on "Proceed to check out" button -Navigated to Product page
    	cp=new CheckOutPage();
    	cp.clickProceedToCheckout().click();
    }

    @And("^verify selected \"([^\"]*)\" items are displayed on Check out page$")
    public void verify_selected_something_items_are_displayed_on_check_out_page(String strArg1) throws Throwable {
    	//Assert.assertTrue(driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains(strArg1));    //User is on Product Page and we are verifying the Product name 
    	pp=new ProductPage();
    	Assert.assertTrue(pp.verifyproductName().getText().contains(strArg1));
    	System.out.println(driver.findElement(By.xpath("//p[@class='product-name']")).getText());
    	System.out.println(strArg1);
    }

}

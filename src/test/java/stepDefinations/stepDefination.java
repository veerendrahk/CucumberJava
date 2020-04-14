package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Netbanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Validated User is on Netbanking Landing page \r\n ");
    }

    @When("^User login into application with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_user_name_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Validated User login into application with user name  and password \r\n");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	System.out.println();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated Home page is populated");
    	System.out.println();
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	
    	System.out.println(strArg1);
    	System.out.println("Validated Cards are displayed");
    	System.out.println();
    }
    
    //background
    
    @Given("validate the browser")
    public void validate_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("browser is triggered")
    public void browser_is_triggered() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("check if browser is started")
    public void check_if_browser_is_started() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    
    
    //end background

    //How in cucumber you write and maintain reusable code across the framework?
    //With the help of step definitions and its regular expression context
    
    @When("^User sign up into application with folowing details$")
    public void user_sign_up_into_application_with_folowing_details(DataTable data) throws Throwable {
    	
    	//List<List<String>> obj1= data.raw();
    	List<String> obj1= data.asList();
    	System.out.println(obj1.get(0));
    	System.out.println(obj1.get(1));
    	System.out.println(obj1.get(2));
    	System.out.println(obj1.get(3));
    	System.out.println(obj1.get(4));
    	System.out.println(" ---TESTCASE 5---- ---------------------------------");
    }

    
    @When("^User login in to application with user name (.+) and password (.+)$")
    public void user_login_in_to_application_with_user_name_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    	System.out.println(" ---TESTCASE 6--------------------------------- ");
    }
    
   

    @When("^Click on Savings$")
    public void click_on_savings() throws Throwable {
    	System.out.println("Clicked on Savings");
    	System.out.println();
        
    }

    @Then("^Savings page is populated$")
    public void savings_page_is_populated() throws Throwable {
    	System.out.println("Savings page is populated successfully");
    	System.out.println();
       
    }

    @And("^Cards displayed on saving account are$")
    public void cards_displayed_on_saving_account_are() throws Throwable {
    	System.out.println("Cards displayed on saving account successfully");
    	System.out.println();
        
    }


    @When("^Click on Checking$")
    public void click_on_checking() throws Throwable {
    	System.out.println("Click on Checking successfully");
    	System.out.println();
    }

    @Then("^Checkings page is populated$")
    public void checkings_page_is_populated() throws Throwable {
    	System.out.println("Checkings page is populated successfully");
    	System.out.println();
    }

   

}

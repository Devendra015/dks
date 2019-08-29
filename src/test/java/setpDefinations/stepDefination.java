package setpDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
  
    	System.out.println("Landing page");

    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
    	System.out.println("User Name :" + arg1);
    	System.out.println("Password : "+ arg2);
    }

    @When("^User login into application with username: (.+) and password: (.+)$")
    public void user_login_into_application_with_username_and_password1(String username, String password) throws Throwable {
        //throw new PendingException();
    	System.out.println("User : "+ username + "   Password : "+ password);
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
   
    	System.out.println("test Ok");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        
    	System.out.println("Passed");
    }

}

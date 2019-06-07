package LeanFTCucumber;

import java.io.IOException;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeanFtStepDefinitions {

    public LeanFtStepDefinitions() {}

    //Implementation of feature’s steps
    
    @Given("user opens testme application")
    public void user_opens_testme_application() throws Throwable {
    	System.out.println("user opens application");
    }

    @When("user enter valid username")
    public void user_enter_valid_username() throws Throwable {
    	System.out.println("enter valid username");

    }

    @When("user enter valid password")
    public void user_enter_valid_password() throws Throwable {
    	System.out.println("enter valid password");

    }

    @When("user clicks login")
    public void user_clicks_login() throws Throwable {
    	System.out.println("click login");

    }

    @Then("verify login success")
    public void verify_login_success() throws Throwable {
    	System.out.println("verify login success");

      
    }

}
package stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class StepDefs {

    @Given("^that I open the home screen$")
    public void that_i_open_the_home_screen() {
        System.out.println("=> @Given --> that_i_open_the_home_screen");
        Reporter.addStepLog("=> @Given --> that_i_open_the_home_screen");
        Assert.assertTrue(true);
    }

    @When("^I type valid credentials to LogIn Screen$")
    public void i_type_valid_credentials_to_login_screen(DataTable usercredentials) {
        List<List<String>> data = usercredentials.raw();
        String email=data.get(0).get(0);
        String password=data.get(0).get(1);
        System.out.println("=> @When 1 --> i_type_valid_credentials_to_login_screen : ("+email+" | "+password+")");
        Reporter.addStepLog("=> @When 1 --> i_type_valid_credentials_to_login_screen : ("+email+" | "+password+")");
        Assert.assertTrue(true);
    }

    @When("^I login with invalid (.+) and (.+) credentials$")
    public void i_login_with_invalid_and_credentials(String email, String password) {
        System.out.println("=> @When 2 --> i_login_with_invalid_and_credentials : ("+email+" | "+password+")");
        Reporter.addStepLog("=> @When 2 --> i_login_with_invalid_and_credentials : ("+email+" | "+password+")");
        if(password.contentEquals("DoesntworkInt2")) {
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

    }

    @Then("^I should be redirected to home screen$")
    public void i_should_be_redirected_to_home_screen() {
        System.out.println("=> @Then 1 --> i_should_be_redirected_to_home_screen");
        Reporter.addStepLog("=> @Then 1 --> i_should_be_redirected_to_home_screen");
        Assert.assertTrue(true);
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void i_should_see_the_error_message_something(String errMsg) {
        System.out.println("=> @Then 2 --> i_should_see_the_error_message_something "+errMsg);
        Reporter.addStepLog("=> @Then 2 --> i_should_see_the_error_message_something "+errMsg);
        Assert.assertTrue(true);
    }

}

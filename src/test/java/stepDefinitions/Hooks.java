package stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void beforeScenario(Scenario scenario)
    {
        System.out.println("=> @Before --> Starting execution of scenario : "+scenario.getName());
      //  Reporter.assignAuthor("Executing Scenario : "+scenario.getName()+" | Author : Himanshu Pandey");
        Reporter.assignAuthor("Himanshu Pandey");
    }

    @After
    public void afterScenario(Scenario scenario) {

        if(scenario.isFailed()) {
            System.out.println("=> @After fail --> "+scenario.getName()+" : Failed :-(");
        } else {
            System.out.println("=> @After pass --> "+scenario.getName()+" : Passed :-(");
        }

        Reporter.addScenarioLog("Scenario : ("+scenario.getName()+") Status = "+scenario.getStatus());

    }
}

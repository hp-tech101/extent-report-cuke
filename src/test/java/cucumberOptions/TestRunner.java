package cucumberOptions;


import cucumber.api.CucumberOptions;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import com.cucumber.listener.Reporter;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = "stepDefinitions",
        tags = {"@regression"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/report.html"}
)
public class TestRunner {

        @AfterClass
        public static void teardown() {

                Reporter.loadXMLConfig(new File("target/extent-config.xml"));
                Reporter.setSystemInfo("user", "Himanshu Pandey");
                Reporter.setSystemInfo("os", "Windows 10");
                Reporter.setTestRunnerOutput("TestRunner@HP");
        }
}

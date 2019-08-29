package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
// convert junit runner file into test ng 
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features/",
		glue= "setpDefinations")
public class TestRunner extends AbstractTestNGCucumberTests {

}

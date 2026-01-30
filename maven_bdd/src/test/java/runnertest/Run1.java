package runnertest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/feature1" , glue = {"runnertest"} , monochrome = true,
			plugin = {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
			)
	public class Run1 extends AbstractTestNGCucumberTests {
}

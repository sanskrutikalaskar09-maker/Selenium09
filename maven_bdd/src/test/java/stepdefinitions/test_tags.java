package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/feature/test_tags" , glue = {"stepdefinations"} , tags= "@run"
			)
public class test_tags {
	

}


	package stepdefinitions;

	import io.cucumber.java.en.*;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class test {

	    WebDriver driver;

	    @Given("browser is open")
	    public void browser_is_open(){
	      driver = new ChromeDriver();
	    }

	    @Given("user is on google search page")
	    public void user_is_on_google_search_page() {
	        driver.get("https://www.google.com");
	    }

	    @When("user enters a text in search box")
	    public void user_enters_text() {
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    }

	    @Then("user is navigated to search result")
	    public void user_is_navigated_to_search_result() {
	        System.out.println("Title: " + driver.getTitle());
	        driver.quit();
	    }
	}
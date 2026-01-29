package stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.*;

	public class tEst {
	    WebDriver driver;

	    @Given("chrome browser is open")
	    public void chrome_browser_is_open() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @And("user is on login page")
	    public void user_is_on_login_page() {
	        driver.navigate().to("https://www.saucedemo.com/");
	    }

	    @When("^user enters (.*) and (.*)$")
	    public void user_enters_username_and_password(String username, String password) {
	        driver.findElement(By.id("user-name")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	    }

	    @And("user clicks on login")
	    public void user_clicks_on_login() {
	        driver.findElement(By.id("login-button")).click();
	    }

	    @Then("user is navigated to home page")
	    public void user_is_navigated_to_home_page() {
	        String currentUrl = driver.getCurrentUrl();
	        System.out.println(currentUrl);
		    driver.quit(); 
	    }

	}
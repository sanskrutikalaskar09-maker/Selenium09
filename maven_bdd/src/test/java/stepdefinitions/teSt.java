package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class teSt {
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
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
            System.out.println("Test Case Completed: Valid login successful");
            System.out.println("Test Case Failed: Did not navigate to home page");
        }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
        String error = driver.findElement(By.id("login_button_container")).getText();
        System.out.println("Test Case Completed: Error displayed -> " + error);
        
        driver.quit();
    }

}
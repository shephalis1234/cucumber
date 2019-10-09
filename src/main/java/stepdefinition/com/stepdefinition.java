package stepdefinition.com;

import static org.junit.Assert.assertEquals;


import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition {
	 WebDriver driver;
	@Before
	public void setUP(){
		
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After// import it from cucumber api
	public void tearDown(){
		System.out.println("close the browser");
	}
	@Given("^user is already on Page$")
	public void user_is_already_on_Page() throws Throwable {
		WebDriverManager.chromedriver().setup();
//		 System.setProperty("WebDriver.chrome.driver", "‪D:/chromedriver.exe");
        //Create driver object for Chrome
         driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
	}

	@When("^title form page is free form$")
	public void title_form_page_is_free_form() throws Throwable {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Demo Form for practicing Selenium Automation");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("good");
	   driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("good");
	}

	@Then("^user clicks on simple button$")
	public void user_clicks_on_simple_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//button[@id='buttonwithclass']")).click();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}

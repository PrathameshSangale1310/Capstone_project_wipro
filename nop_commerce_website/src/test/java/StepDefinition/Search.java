package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page should be open in the default browser")
	public void home_page_should_be_open_in_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();

	}

	@When("^click on searchbox and type (.*)$")
	public void click_on_searchbox_and_type_text(String text) {
	    pg.search_in(text);
	}

	@When("click on search button")
	public void click_on_search_button() {
	    pg.search_button_click();
	}

	@Then("User should be able to search")
	public void user_should_be_able_to_search() {
	    driver.close();
	}
}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Computers {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page open in the default browser")
	public void home_page_open_in_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on compuetrs tab")
	public void user_clicks_on_compuetrs_tab() {
		pg.comp_tab_click();
	}

	@When("user clicks on any category")
	public void user_clicks_on_any_category() {
		pg.desktop_cat_click();
	}

	@Then("user able to open particular computers category")
	public void user_able_to_open_particular_computers_category() {
	    driver.quit();
	}
}

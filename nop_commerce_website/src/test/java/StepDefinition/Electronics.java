package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Electronics {
	WebDriver driver;
	PageClass pg;
	
	@Given("user opens home page default browser")
	public void user_opens_home_page_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on electronics tab")
	public void user_clicks_on_electronics_tab() {
		pg.electronics_tab_click();
	}

	@When("user clicks on any electronics category")
	public void user_clicks_on_any_electronics_category() {
		pg.cam_and_photo_cat_click();
	}

	@Then("user able to open particular electronics category")
	public void user_able_to_open_particular_electronics_category() {
	    driver.quit();
	}
}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digitaldownloads {
	WebDriver driver;
	PageClass pg;

	@Given("user opens the home page in default browser")
	public void user_opens_the_home_page_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on digital downloads tab")
	public void user_clicks_on_digital_downloads_tab() {
	    pg.digi_down_tab_click();
	}

	@And("user clicks on sort by filter and apply it")
	public void user_clicks_on_sort_by_filter_and_apply_it() {
		pg.sort_by_filter();
	}

	@And("user clicks on display filter and apply it")
	public void user_clicks_on_display_filter_and_apply_it() {
	    pg.display_filter_click();
	}

	@And("user clicks on list view icon")
	public void user_clicks_on_list_view_icon() throws InterruptedException {
	    pg.list_view();
	    Thread.sleep(2000);
	}

	@And("user clicks on any digital downloads category")
	public void user_clicks_on_any_digital_downloads_category() {
		pg.digidown_cat_click();
	}

	@And("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	    pg.digidown_atc_click();
	}

	@Then("user able to open particular digital downloads category")
	public void user_able_to_open_particular_digital_downloads_category() {
	    driver.quit();
	}
}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jewelry {
	WebDriver driver;
	PageClass pg;
	
	@Given("user opens the home page on the default browser")
	public void user_opens_the_home_page_on_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on jewelry tab")
	public void user_clicks_on_jewelry_tab() {
	    pg.jewelry_tab_click();
	}

	@And("user clicks on the sort by filter and then apply it")
	public void user_clicks_on_the_sort_by_filter_and_then_apply_it() {
		pg.sort_by_filter();
	}

	@And("user clicks on the display filter and then apply it")
	public void user_clicks_on_the_display_filter_and_then_apply_it() {
		pg.display_filter_click();
	}

	@And("user clicks on the price by filter and then apply it")
	public void user_clicks_on_the_price_by_filter_and_then_apply_it() {
		pg.price_by_filter_click();
	}

	@And("user clicks on the list view icons")
	public void user_clicks_on_the_list_view_icons() throws InterruptedException {
		pg.list_view();
	    Thread.sleep(2000);
	}

	@And("user clicks on any jewelry category")
	public void user_clicks_on_any_jewelry_category() {
	    pg.jewelry_cat_click();
	}

	@And("user clicked on the add to cart button")
	public void user_clicked_on_the_add_to_cart_button() {
	    pg.jewelry_wishlist_click();
	}

	@Then("user able to open view jewelry tab")
	public void user_able_to_open_view_jewelry_tab() {
	    driver.quit();
	}


}

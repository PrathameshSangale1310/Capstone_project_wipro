package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removecart {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page is opened in default the browser")
	public void home_page_is_opened_in_default_the_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on searchbox and type itemname in the searchbox")
	public void user_clicks_on_searchbox_and_type_itemname_in_the_searchbox() {
		pg.wishlist_item_search();
	}

	@When("user clicked search button")
	public void user_clicked_search_button() {
	    pg.search_button_click();
	}

	@When("user click on the add to cart icon")
	public void user_click_on_the_add_to_cart_icon() throws InterruptedException {
		pg.atc_icon_click();
	    Thread.sleep(2000);
	    pg.close_alert_click();
	}

	@When("user click on shopping cart icon")
	public void user_click_on_shopping_cart_icon() {
		pg.shop_cart_click();
	}

	@When("user clicks on remove cross icon")
	public void user_clicks_on_remove_cross_icon() {
		pg.remove_cross_click();
	}

	@Then("product is removed from the cart")
	public void product_is_removed_from_the_cart() {
	    driver.quit();
	}

}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page is opens in default the browser")
	public void home_page_is_opens_in_default_the_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}
	
	@When("user clicks on searchbox and type in the searchbox")
	public void user_clicks_on_searchbox_and_type_in_the_searchbox() {
	    pg.wishlist_item_search();
	}
	

	@And("user clicks search button")
	public void user_clicks_search_button() {
	    pg.search_button_click();
	}

	@And("click on the add to cart icon")
	public void click_on_the_add_to_cart_icon() throws InterruptedException {
		pg.atc_icon_click();
	    Thread.sleep(2000);
	    pg.close_alert_click();
	}
	
	@And("user click on shopping carts icon")
	public void user_click_on_shopping_carts_icon() {
	    pg.shop_cart_click();
	}

	@And("user clicks on qty box and enters qty")
	public void user_clicks_on_qty_box_and_enters_qty() {
	    pg.qty_box_in();
	}

	@And("user clicks on gift wrapping dropdown and select no")
	public void user_clicks_on_gift_wrapping_dropdown_and_select_no() {
	    pg.gift_wrap_click();
	}

	@And("user clicks on coupon and enter coupon")
	public void user_clicks_on_coupon_and_enter_coupon() throws InterruptedException {
	    pg.coupon_click();
	    Thread.sleep(1000);
	}

	@And("user clicks on checkbox")
	public void user_clicks_on_checkbox() {
	    pg.atc_checkbox_click();
	}

	@Then("product is added in cart")
	public void product_is_added_in_cart() {
	    driver.quit();
	}

}

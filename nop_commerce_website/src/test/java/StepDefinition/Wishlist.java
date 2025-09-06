package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishlist {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page open in default browser")
	public void home_page_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}
	
	@When("click on serachbox and type something")
	public void click_on_serachbox_and_type_something() {
	    pg.wishlist_item_search();
	}

	@And("click on the search button")
	public void click_on_the_search_button() {
	    pg.search_button_click();
	}

	
	@When("click on wishlist icon")
	public void click_on_wishlist_icon() throws InterruptedException {
	    pg.wishlist_icon_click();
	    Thread.sleep(1000);
	    pg.close_alert_click();
	}
	
	@When("user click on wishlist link")
	public void user_click_on_wishlist_link() {
		pg.wishlist_link_click();
	}
	
	@When("user clicks on qty box and enters the qty")
	public void user_clicks_on_qty_box_and_enters_the_qty() {
	    
	}

	@When("user clicks on update wishlist button")
	public void user_clicks_on_update_wishlist_button() {
		pg.qty_box_in();
	}

	@When("user clicks on add to cart checkbox")
	public void user_clicks_on_add_to_cart_checkbox() {
	    pg.wishlist_atc_checkbox_click();
	}

	@When("user click on an add to cart button")
	public void user_click_on_an_add_to_cart_button() {
	    pg.wishlist_atc_button();
	}


	@Then("product added in wishlist")
	public void product_added_in_wishlist() {
	    driver.quit();
	}
}

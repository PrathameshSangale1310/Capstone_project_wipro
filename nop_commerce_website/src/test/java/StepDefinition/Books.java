package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books {
	WebDriver driver;
	PageClass pg;
	
	@Given("user opens the home page in the default browser")
	public void user_opens_the_home_page_in_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on books tab")
	public void user_clicks_on_books_tab() {
	    pg.books_tab_click();
	}

	@And("user clicks on the sort by filter and apply it")
	public void user_clicks_on_the_sort_by_filter_and_apply_it() {
	    pg.sort_by_filter();
	}

	@And("user clicks on the display filter and apply it")
	public void user_clicks_on_the_display_filter_and_apply_it() {
		pg.display_filter_click();
	}

	@And("user clicks on the price by filter and apply it")
	public void user_clicks_on_the_price_by_filter_and_apply_it() {
	    pg.price_by_filter_click();
	}

	@And("user clicks on the list view icon")
	public void user_clicks_on_the_list_view_icon() throws InterruptedException {
		pg.list_view();
	    Thread.sleep(2000);
	}

	@And("user clicks on any books category")
	public void user_clicks_on_any_books_category() throws InterruptedException {
	    pg.books_cat_click();
	    Thread.sleep(2000);
	}

	@And("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() throws InterruptedException {
	    pg.book_atc_click();
	    Thread.sleep(2000);
	    pg.book_wishlist_click();
	}

	@Then("user able to open view books tab")
	public void user_able_to_open_view_books_tab() {
	    driver.quit();
	}
}

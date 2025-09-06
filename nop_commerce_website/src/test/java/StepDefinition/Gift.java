package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gift {
	WebDriver driver;
	PageClass pg;
	
	@Given("user opens the home page in default browsers")
	public void user_opens_the_home_page_in_default_browsers() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("user clicks on gifts tab")
	public void user_clicks_on_gifts_tab() {
		pg.gift_tab_click();
	}

	@And("user clicks on sort by filter and apply it then")
	public void user_clicks_on_sort_by_filter_and_apply_it_then() {
	    pg.sort_by_filter();
	}

	@And("user clicks on display filter and apply it then")
	public void user_clicks_on_display_filter_and_apply_it_then() {
	    pg.display_filter_click();
	}

	@And("user clicks on list views icon")
	public void user_clicks_on_list_views_icon() throws InterruptedException {
	    pg.list_view();
	    Thread.sleep(2000);
	}

	@And("user clicks on any gifts category")
	public void user_clicks_on_any_gifts_category() {
	    pg.gift_cat_click();
	}
	
	@And("user clicked on add to cart button")
	public void user_clicked_on_add_to_cart_button() {
		pg.gift_atc_click();
	}

	@Then("user able to open particular gifts category")
	public void user_able_to_open_particular_gifts_category() {
	    driver.quit();
	}


}

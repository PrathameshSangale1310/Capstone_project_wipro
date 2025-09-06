package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page is open in the default browser")
	public void home_page_is_open_in_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("click on currency dropdown and user able to change currency")
	public void click_on_currency_dropdown_and_user_able_to_change_currency() {
	    pg.curr_dropdown_click();
	    pg.euro_click();
	}

	@And("click on news link and check redirection")
	public void click_on_news_link_and_check_redirection() throws InterruptedException {
	    pg.news_link_click();
	}

	@And("click on details and check redirection")
	public void click_on_details_and_check_redirection() throws InterruptedException {
	   pg.details_click();
	}

	@And("click on view news archieve and check redirection")
	public void click_on_view_news_archieve_and_check_redirection() throws InterruptedException {
	    pg.news_arc_click();
	}

	@And("click on footer links and check redirection")
	public void click_on_footer_links_and_check_redirection() {
	    pg.footer_new_prod_click();
	}

	@And("click on social media icons and check redirection")
	public void click_on_social_media_icons_and_check_redirection() {
	    pg.social_click();
	}

	@And("click on nopCommerce link and check redirection")
	public void click_on_nop_commerce_link_and_check_redirection() throws InterruptedException {
	    pg.nop_link_click();
	}

	@And("click on newsletter textbox and enter email")
	public void click_on_newsletter_textbox_and_enter_email() throws InterruptedException {
	    pg.newsletter_in();
	}

	@And("click on subscribe button")
	public void click_on_subscribe_button() {
	    pg.subscribe_button_click();
	}

	@Then("all home pages should work properly")
	public void all_home_pages_should_work_properly() {
	    driver.quit();
	}

}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	WebDriver driver;
	PageClass pg;
	
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("^click on email textbox and enter (.*)$")
	public void click_on_email_textbox_and_enter_email(String email) {
	    pg.email_in(email);
	}

	@And("^click on password textbox and enter (.*)$")
	public void click_on_password_textbox_and_enter_password(String password) {
	    pg.pass_in(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	    pg.login_button_click();
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
	    driver.quit();
	}
}

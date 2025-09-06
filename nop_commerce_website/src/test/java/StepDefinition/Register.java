package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	PageClass pg;
	
	@Given("home page should be open in default browser")
	public void home_page_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
	}

	@When("click on register link on the top")
	public void click_on_register_link_on_the_top() {
	    pg.reg_link_click();
	}

	@And("click on gender checkbox")
	public void click_on_gender_checkbox() {
	    pg.gender_click();
	}

	@And("click on first name field and enter first name")
	public void click_on_first_name_field_and_enter_first_name() {
	    pg.fname_in();
	}

	@And("click on last name field and enter last name")
	public void click_on_last_name_field_and_enter_last_name() {
	    pg.lname_in();
	}

	@And("click on email field and enter email")
	public void click_on_email_field_and_enter_email() {
	    pg.reg_email_in();
	}

	@And("click on password field and enter password")
	public void click_on_password_field_and_enter_password() {
	    pg.reg_pass_in();
	}

	@And("click on confirm password field and enter cpassword")
	public void click_on_confirm_password_field_and_enter_cpassword() {
	    pg.reg_cpass_in();
	}
	
	@And("click on register button")
	public void click_on_register_button() {
		pg.reg_button_click();
	}

	@Then("register successfully")
	public void register_successfully() {
	    driver.close();
	}
}

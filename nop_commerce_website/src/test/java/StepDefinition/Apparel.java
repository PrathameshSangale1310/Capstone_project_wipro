package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apparel {
	WebDriver driver;
	PageClass pg;

@Given("user opens home page in default browser")
public void user_opens_home_page_in_default_browser() {
	driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	pg = new PageClass(driver);
	driver.manage().window().maximize();
}

@When("user clicks on apparel tab")
public void user_clicks_on_apparel_tab() {
    pg.apparel_tab_click();
}

@When("user clicks on any apparel category")
public void user_clicks_on_any_apparel_category() {
    pg.shoes_cat_click();
}

@Then("user able to open particular apparel category")
public void user_able_to_open_particular_apparel_category() {
    driver.quit();
}



}

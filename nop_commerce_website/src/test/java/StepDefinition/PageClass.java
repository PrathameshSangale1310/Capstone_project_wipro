package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageClass {
	WebDriver driver;
	By login_link = By.xpath("//a[@class=\"ico-login\"]");
	By reg_link = By.xpath("//a[@class=\"ico-register\"]");
	By demoemeil = By.id("Email");
	By pass = By.id("Password");
	By login_but = By.xpath("//button[@class=\"button-1 login-button\"]");
	By male = By.id("gender-male");
	By fname = By.id("FirstName");
	By lname = By.id("LastName");
	By reg_email = By.id("Email");
	By reg_pass = By.id("Password");
	By reg_cpass = By.id("ConfirmPassword");
	By reg_but = By.id("register-button");
	By searchbox = By.id("small-searchterms");
	By search_but = By.xpath("//*[@id=\"small-search-box-form\"]/button");
	By curr = By.id("customerCurrency");
	By euro = By.xpath("//*[@id=\"customerCurrency\"]");
	By news_link = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[5]/div[2]/div[1]/div[1]/a");	
	By details = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[5]/div[2]/div[1]/div[3]/a");
	By news_arc = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[5]/div[3]/a");
	By footer_new_products = By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[6]/a");
	By fb = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
	By nop_com_link = By.xpath("/html/body/div[6]/div[4]/div[2]/div[2]/a");
	By newsletter = By.id("newsletter-email");
	By subs = By.id("newsletter-subscribe-button");
	By wishlist_icon = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[3]");
	By close_alert = By.xpath("//*[@id=\"bar-notification\"]/div/span");
	By wishlist_link = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]");
	By wishlist_qty_box = By.xpath("//input[@class='qty-input']");
	By upd_wishlist = By.xpath("//*[@id='updatecart']");
	By wishlist_atc_checkbox = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[1]/input");
	By wishlist_atc = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/form/div[2]/button[2]");
	By atc = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]");
	By comp_tab = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
	By qty_box = By.xpath("//input[@class='qty-input']");
	By wrapping = By.id("checkout_attribute_1");
	By wrapping_no = By.xpath("//*[@id=\"checkout_attribute_1\"]/option[1]");
	By discount = By.id("discountcouponcode");
	By apply_coupon = By.id("applydiscountcouponcode");
	By atc_checkbox = By.id("termsofservice");
	By home_link = By.xpath("//*[@id=\"main\"]/div/div[1]/ul/li[1]/a");
	By notebooks_link = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a");
	By desktop_cat = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a");
	By mfg = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/ul/li[1]/a");
	By elect_tab = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");
	By cam_and_photo = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a");
	By apparel = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a");
	By shoes = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a");
	By digi_down = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a");
	By sort_by = By.id("products-orderby");
	By low_to_high = By.cssSelector("option[value='10']");
	By display_filter = By.id("products-pagesize");
	By display_num = By.xpath("//*[@id=\"products-pagesize\"]/option[1]");
	By list = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div[1]/a[2]");
    By picture = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img");
    By picture_atc = By.id("add-to-cart-button-38");
    By book = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
    By book_cat = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img");
    By book_atc = By.xpath("//*[@id=\"add-to-cart-button-39\"]");
    By book_wishlist = By.xpath("//*[@id=\"add-to-wishlist-button-39\"]");
    By price_by_filter = By.xpath("//*[@id=\"price-range-slider\"]/span[2]");
    By price_by_filter_range = By.xpath("//*[@id='price-range-slider']/span[2]");
    By jewelry_tab = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a");
    By jewelry_cat = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img");
    By jewelry_atc = By.id("add-to-cart-button-43");
    By jewelry_wishlist = By.id("add-to-wishlist-button-43");
    By gift_tab = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a");
    By gift_cat = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img");
    By gift_atc = By.id("add-to-cart-button-46");
    By gift_wishlist = By.id("add-to-wishlist-button-46");
    By shopping_cart_icon = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    By remove = By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button");
    
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void email_in() {
		driver.findElement(login_link).click();
		driver.findElement(demoemeil).click();
		driver.findElement(demoemeil).sendKeys("abcdefghij@gmail.com");	
	}
	
	public void pass_in() {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("abc123");	
	}
	
	public void login_button_click() {
		driver.findElement(login_but).click();
	}
	
	public void reg_link_click() {
		driver.findElement(reg_link).click();
	}
	
	public void gender_click() {
		driver.findElement(male).click();
	}
	
	public void fname_in() {
		driver.findElement(fname).click();
		driver.findElement(fname).sendKeys("Prathameshh");
	}
	
	public void lname_in() {
		driver.findElement(lname).click();
		driver.findElement(lname).sendKeys("Sangale");
	}
	
	public void reg_email_in() {
		driver.findElement(reg_email).click();
		driver.findElement(reg_email).sendKeys("zyxcba.com");
	}
	
	public void reg_pass_in() {
		driver.findElement(reg_pass).click();
		driver.findElement(reg_pass).sendKeys("abc123");
	}
	
	public void reg_cpass_in() {
		driver.findElement(reg_cpass).click();
		driver.findElement(reg_cpass).sendKeys("abc123");
	}
	
	public void reg_button_click() {
		driver.findElement(reg_but).click();
	}
	
	public void search_in(String text) {
		driver.findElement(searchbox).click();
		driver.findElement(searchbox).sendKeys(text);
	}
	
	public void search_button_click() {
		driver.findElement(search_but).click();
	}
	
	public void curr_dropdown_click() {
		driver.findElement(curr).click();
	}
	
	public void euro_click() {
		driver.findElement(euro).click();
	}
	
	public void news_link_click() throws InterruptedException {
		driver.findElement(news_link).click();
		Thread.sleep(1000);
	}
	
	public void details_click() throws InterruptedException {
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(1000);
		driver.findElement(details).click();
		Thread.sleep(1000);
	}
	
	public void news_arc_click() throws InterruptedException {
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(1000);
		driver.findElement(news_arc).click();
	}
	
	public void footer_new_prod_click() {
		driver.findElement(footer_new_products).click();
	}
	
	public void social_click() {
		driver.findElement(fb).click();
	}
	
	public void nop_link_click() throws InterruptedException {
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(1000);
		driver.findElement(nop_com_link).click();
	}
	
	public void newsletter_in() throws InterruptedException {
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(1000);
		driver.findElement(newsletter).click();
		driver.findElement(newsletter).sendKeys("abc@gmail.com");
	}
	
	public void subscribe_button_click() {
		driver.findElement(subs).click();
	}
	
	public void wishlist_item_search() {
		driver.findElement(searchbox).click();
		driver.findElement(searchbox).sendKeys("iphone");
	}
	
	public void wishlist_icon_click() {
		driver.findElement(wishlist_icon).click();
	}
	
	public void close_alert_click() {
		driver.findElement(close_alert).click();
	}
	
	public void wishlist_link_click() {
		driver.findElement(wishlist_link).click();
	}
	
	public void wishlist_atc_checkbox_click() {
		driver.findElement(wishlist_atc_checkbox).click();
	}
	
	public void wishlist_atc_button() {
		driver.findElement(wishlist_atc).click();
	}
	
	
	public void atc_icon_click() {
		driver.findElement(atc).click();
	}
	
	public void qty_box_in() {
		driver.findElement(qty_box).click();
		driver.findElement(qty_box).sendKeys("2");
	}
	
	public void gift_wrap_click() {
		driver.findElement(wrapping).click();
		driver.findElement(wrapping_no).click();
	}
	
	public void coupon_click() {
		driver.findElement(discount).click();
		driver.findElement(discount).sendKeys("FLAT100");
		driver.findElement(apply_coupon).click();
	}
	
	public void atc_checkbox_click() {
		driver.findElement(atc_checkbox).click();
	}
	
	public void comp_tab_click() {
		driver.findElement(comp_tab).click();
	}
	
	public void home_link_click() {
		driver.findElement(comp_tab).click();
	}
	
	public void notebooks_link_click() {
		driver.findElement(notebooks_link).click();
	}
	
	public void desktop_cat_click() {
		driver.findElement(desktop_cat).click();
	}
	
	public void manufacturer_link_click() {
		driver.findElement(mfg).click();
	}
	
	public void electronics_tab_click() {
		driver.findElement(elect_tab).click();
	}
	
	public void cam_and_photo_cat_click() {
		driver.findElement(cam_and_photo).click();
	}
	
	public void apparel_tab_click() {
		driver.findElement(apparel).click();
	}
	
	public void shoes_cat_click() {
		driver.findElement(shoes).click();
	}
	
	public void digi_down_tab_click() {
		driver.findElement(digi_down).click();
	}
	
	public void sort_by_filter() {
		driver.findElement(sort_by).click();
		driver.findElement(low_to_high).click();
	}
	
	public void display_filter_click() {
		driver.findElement(display_filter).click();
		driver.findElement(display_num).click();
	}
	
	public void list_view() {
		driver.findElement(list).click();
	}
	
	public void digidown_cat_click() {
		driver.findElement(picture).click();
	}
	
	public void digidown_atc_click() {
		driver.findElement(picture_atc).click();
	}
	
	public void price_by_filter_click() {
		driver.findElement(price_by_filter).click();
		driver.findElement(price_by_filter_range).click();
	}
	
	public void books_tab_click() {
		driver.findElement(book).click();
	}
	
	public void books_cat_click() {
		driver.findElement(book_cat).click();
	}
	
	public void book_atc_click() {
		driver.findElement(book_atc).click();
	}
	
	public void book_wishlist_click() {
		driver.findElement(book_wishlist).click();
	}
	
	public void jewelry_tab_click() {
		driver.findElement(jewelry_tab).click();
	}
	
	public void jewelry_cat_click() {
		driver.findElement(jewelry_cat).click();
	}
	
	public void jewelry_wishlist_click() {
		driver.findElement(jewelry_wishlist).click();
	}
	
	public void gift_tab_click() {
		driver.findElement(gift_tab).click();
	}
	
	public void gift_cat_click() {
		driver.findElement(gift_cat).click();
	}
	
	public void gift_atc_click() {
		driver.findElement(gift_atc).click();
	}
	
	public void shop_cart_click() {
		driver.findElement(shopping_cart_icon).click();
	}
	
	public void remove_cross_click() {
		driver.findElement(remove).click();
	}
}

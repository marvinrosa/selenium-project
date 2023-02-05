package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.utils.BasePage;

public class MainPage extends BasePage{
	
	//Declaraciones
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()=' Your Basket']")
	public WebElement lnkBasket;

	@FindBy(xpath = "//*[@id='mat-menu-panel-0']/div/button[2]/span")
	public WebElement lnkOrdersPayment;

	@FindBy(xpath = "//span[text()=' Order History ']")
	private WebElement lnkHistory;

	@FindBy (xpath = "//*[@id='mat-menu-panel-3']/div/button[3]/span")
	public WebElement lnkAddress;

	@FindBy(xpath = "//span[text()=' My Payment Options ']")
	public WebElement lnkPayment;

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void goToBasketLink() {
		click(lnkBasket);
	}
	
	public void goToOrdersPaymentLink() {
		click(lnkOrdersPayment);
	}
	
	public void goToHistoryLink() {
		click(lnkHistory);
	}
	
	public void goToAdressLink() {
		click(lnkAddress);
	}
	
	public void goToPaymentLink() {
		click(lnkPayment);
	}
	
}

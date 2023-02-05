package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.utils.BasePage;

public class PaymentPage extends BasePage{
	
	@FindBy(xpath = "//*[@id='mat-expansion-panel-header-0']/span[1]/mat-panel-title")
	public WebElement lblNewCard;

	@FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[1]/div/div[1]/div[3]/input")
	public WebElement txtcardName;

	@FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[2]/div/div[1]/div[3]/input")
	public WebElement txtCardNumber;

	@FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[3]/div/div[1]/div[3]/select")
	public WebElement cmbMonth;

	@FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[4]/div/div[1]/div[3]/select")
	public WebElement cmbYear;

	@FindBy(id = "submitButton")
	public WebElement btnSubmit;

	public PaymentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addNewPayment() {
		click(lblNewCard);
	}
	
	public void fillOutPaymentForm(String name,String number, String month, String year) {
		type(txtcardName, name);
		type(txtCardNumber,number);
		type(cmbMonth,month);
		type(cmbYear,year);
		click(btnSubmit);
	}


}

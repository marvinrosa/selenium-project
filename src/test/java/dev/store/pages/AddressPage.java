package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.utils.BasePage;

public class AddressPage extends BasePage {

	//Declaraciones
	WebDriver driver;
	
	@FindBy (xpath = "//span[text()='Add New Address']")
	public WebElement bntAddNewAddress;
	
	@FindBy (xpath = "//*[@id='address-form']//input[1]")
	public WebElement txtCountry;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[2]/div/div[1]/div[3]/input")
	public WebElement txtName;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[3]/div/div[1]/div[3]/input")
	public WebElement txtMobile;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[4]/div/div[1]/div[3]/input")
	public WebElement txtZipCode;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[5]/div/div[1]/div[3]/textarea")
	public WebElement txtAddress;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[6]/div/div[1]/div[3]/input")
	public WebElement txtCity;
	
	@FindBy (xpath = "//*[@id='address-form']/mat-form-field[7]/div/div[1]/div[3]/input")
	public WebElement txtState;
	
	@FindBy (xpath = "//*[@id='submitButton']")
	public WebElement btnSubmit;
	
	public AddressPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addNewForm() {
		click(bntAddNewAddress);
	}
	
	public void fillOutAddressForm(String country, String name,String mobile, String zip,String address, String city,String state){
		//setTimeOutSec(2000);
		type(txtCountry,country);
		type(txtName,name);
		type(txtZipCode,zip);
		type(txtAddress,address);
		type(txtCity,city);
		type(txtState,state);
		sleep(3000); 
		click(btnSubmit);
	}
	
	
	private void sleep(int timeOutSec) {
		try {
			Thread.sleep(timeOutSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

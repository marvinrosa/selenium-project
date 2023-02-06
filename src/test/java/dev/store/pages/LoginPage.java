package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dev.store.utils.BasePage;

public class LoginPage extends BasePage{
	
	//Declaraciones
	WebDriver driver;

	@FindBy(name="email")
	public WebElement txtEmail;
	
	@FindBy(id="password")
	public WebElement txtPassword; 
	
	@FindBy(css="#loginButton > span.mat-button-wrapper")
	public WebElement btnLogin;

	@FindBy(id="newCustomerLink")
	public WebElement lnkRegister;
	
	@FindBy(css=".mat-card.mat-elevation-z6 > .error.ng-star-inserted")
	public WebElement lblErrorMessage;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage(WebDriver driver, int timeOutSec) {
		super(driver);
		PageFactory.initElements(driver, this);
		setTimeOutSec(timeOutSec);
		
	}
	
	public void fillOutLoginForm(String username, String password)  {
		type(txtEmail,username);
		type(txtPassword,password);
		click(btnLogin);
	}
	
	public void verifyIncorrectLogin(String currentMessage,String expectedSuccessMessage) {
		Assert.assertTrue(currentMessage.contains(expectedSuccessMessage), "the login was not successfull");
	}
	
}

package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.log.Log;
import dev.store.utils.BasePage;

public class RegisterPage extends BasePage {
	
	//Declaraciones
	WebDriver driver;
	Log log = new Log();
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div/div[2]/a")
	public WebElement lnkToRegister;
	
	@FindBy(xpath="//*[@id=\"emailControl\"]")
	public WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"passwordControl\"]")
	public WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"repeatPasswordControl\"]")
	public WebElement txtRepeatPassword;
	
	// validate
	//@FindBy(css="#registration-form > div.security-container > mat-form-field.mat-form-field.ng-tns-c118-14.mat-accent.mat-form-field-type-mat-select.mat-form-field-appearance-outline.mat-form-field-can-float.mat-form-field-has-label.mat-form-field-hide-placeholder.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted > div > div.mat-form-field-flex.ng-tns-c118-14 > div.mat-form-field-infix.ng-tns-c118-14")
	@FindBy(xpath="//div[@id='mat-select-value-3']/span")
	public WebElement cmbQuestion;
	//validate
	@FindBy(xpath="//*[@id=\"mat-option-3\"]")
	public WebElement cmbOption;
	
	@FindBy(xpath="//*[@id=\"securityAnswerControl\"]")
	public WebElement txtSecurityQuestion;
	
	@FindBy(xpath="//*[@id=\"registerButton\"]/span[1]")
	public WebElement btnRegister;
	
	//Constructor
	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
   }
	
	public RegisterPage(WebDriver driver, int timeOutSec) {
		super(driver);
		PageFactory.initElements(driver, this);
		setTimeOutSec(timeOutSec);
	}
	
	public void goToRegisterLink() {
		click(lnkToRegister);
	}
	
	public void fillOutRegisterForm(String username, String password,String answerQuestion){
		//setTimeOutSec(2000);
		type(txtEmail,username);
		type(txtPassword,password);
		type(txtRepeatPassword,password);
		sleep(1000); // re validate
		click(cmbQuestion);
		click(cmbOption);
		type(txtSecurityQuestion,answerQuestion);
		click(btnRegister);
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

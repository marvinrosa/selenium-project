package dev.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	//Constantes
	String LOGIN_URL = "https://juice-shop.herokuapp.com/#/login";

	//Declaraciones
	WebDriver driver;
	By popMsg1 = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	By popMsg2 = By.xpath("/html/body/div[1]/div/a");
	By txtEmail = By.xpath("//*[@id=\"emailControl\"]");
	By txtPassword = By.xpath("//*[@id=\"passwordControl\"]");
	By txtRepeatPassword = By.xpath("//*[@id=\"repeatPasswordControl\"]");
	By btnRegister = By.xpath("//*[@id=\"registerButton\"]/span[1]");
	By cmbQuestion = By.xpath("//*[@id=\"mat-select-value-1\"]");
	By txtSecurityQuestion = By.xpath("//*[@id=\"securityAnswerControl\"]");
	
	/*email.sendKeys(EMAIL);
	password.sendKeys(PASSWORD);
	repeatPassword.sendKeys(PASSWORD);
	selectQuestion.sendKeys(SELECT_ELEMENT);
	answerQuestion.sendKeys(SECURITY_ANSWER);
	registerButton.click();
	*/
		
}

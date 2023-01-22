package dev.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//Constantes
	String LOGIN_URL = "https://juice-shop.herokuapp.com/#/login";

	//Declaraciones
	WebDriver driver;
	
	By txtEmail = By.name("email");
	By txtPassword = By.id("password");
	By btnLogin = By.xpath("//*[@id=\"login-form\"]//*[@id=\"loginButton\"]");
	//By lblError = By.xpath("//*[@id=\"loginButton\"]");
	//txtEmail.sendKeys(EMAIL);
	//txtPassword.sendKeys(PASSWORD);
	//btnLogin.click();
	//System.out.print(lblError.equals("Invalid email or password."));
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
		
	//Metodos
	public void getUrl() {
		this.driver.get(LOGIN_URL);
	}
	
	public void fillOutForm(String username, String password) {
		driver.findElement(txtEmail).sendKeys(username);
		driver.findElement(txtPassword).sendKeys(password);
		driver.findElement(btnLogin).submit();
	}
}

package dev.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Constantes
	String LOGIN_URL = "https://juice-shop.herokuapp.com/#/login";

	//Declaraciones
	WebDriver driver;
	By popMsg1 = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	By popMsg2 = By.xpath("/html/body/div[1]/div/a");
	By txtEmail = By.name("email");
	By txtPassword = By.id("password");
	By btnLogin = By.xpath("//*[@id=\"loginButton\"]");

	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
		
	//Metodos
	public void getUrl() {
		this.driver.get(LOGIN_URL);
	}
	
	public void popUpRun()  {
		driver.findElement(popMsg1).click();
		driver.findElement(popMsg2).click();
	}
	
	public void fillOutForm(String username, String password)  {
		driver.findElement(txtEmail).sendKeys(username);
		driver.findElement(txtPassword).sendKeys(password);
		driver.findElement(btnLogin).click();
	}
}

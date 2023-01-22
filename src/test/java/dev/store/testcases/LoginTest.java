package dev.store.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class LoginTest extends BaseTest{

	String EMAIL = "marvin.rosafortin@gmail.com";
	String PASSWORD = "Owasp@1234";
	String URL_LOGIN = "https://juice-shop.herokuapp.com/#/login";
	WebDriver driver;
	
	@Test
	public void login() {
		WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		txtEmail.sendKeys(EMAIL);
		
		WebElement txtPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtPassword.sendKeys(PASSWORD);
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
		btnLogin.click();
		
		WebElement lblError = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div[1]"));
		System.out.print(lblError.equals("Invalid email or password."));
	}
	
}

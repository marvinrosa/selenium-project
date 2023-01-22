package dev.store.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	String EMAIL = "marvin.rosafortin@gmail.com";
	String PASSWORD = "Owasp@1234";
	String URL_LOGIN = "https://juice-shop.herokuapp.com/#/login";
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL_LOGIN);
	}
	
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
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}

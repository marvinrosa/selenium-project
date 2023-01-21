package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Login {

	public static void main(String[] args) {
	
		String EMAIL = "marvin.rosafortin@gmail.com";
		String PASSWORD = "Owasp@1234";
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://juice-shop.herokuapp.com/#/login");
		
		
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

package dev.store.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dev.store.pages.HomePage;
import dev.store.pages.LoginPage;
import dev.store.pages.RegisterPage;

public class BaseTest {

	protected WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected RegisterPage registerPage;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:3000");
		
		//
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		registerPage = new RegisterPage(driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		//TODO	Screenshot
	}
	
	@AfterClass
	public void tearDown() {
		//TODO	
	}
	
}

package dev.store.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dev.store.pages.AddressPage;
import dev.store.pages.HomePage;
import dev.store.pages.LoginPage;
import dev.store.pages.MainPage;
import dev.store.pages.PaymentPage;
import dev.store.pages.RegisterPage;

public class BaseTest {

	protected WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected RegisterPage registerPage;
	protected MainPage mainPage;
	protected AddressPage addressPage;
	protected PaymentPage paymentPage;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:3000");
		
		//
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		registerPage = new RegisterPage(driver);
		mainPage = new MainPage(driver);
		addressPage = new AddressPage(driver);
		paymentPage = new PaymentPage(driver);
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//TODO	Screenshot
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		//TODO	
		//close browser

	}
	
}

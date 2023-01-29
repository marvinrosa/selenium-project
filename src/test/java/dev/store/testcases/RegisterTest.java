package dev.store.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {

	String EMAIL = "marvin.rosafortin@gmail.com";
	String PASSWORD = "Owasp@1234";
	String SELECT_ELEMENT = "\" Your favorite book? \"";
	String SECURITY_ANSWER ="HarryPotter";
	WebDriver driver ;
	
	
	@Test
	public void register() {
		
	}
	

}

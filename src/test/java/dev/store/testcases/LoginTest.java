package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class LoginTest extends BaseTest{

	//Contantes
	String EMAIL = "marvin.rosafortin11@gmail.com";
	String PASSWORD = "Owasp@1234";
	
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		homePage.goToLoginLink();
		loginPage.fillOutLoginForm(EMAIL, PASSWORD);
	}
	

}

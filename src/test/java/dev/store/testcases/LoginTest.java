package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class LoginTest extends BaseTest{

	//Contantes
	String EMAIL = "marvin.rosafortin11@gmail.com";
	String PASSWORD = "Owasp@12341";
	
	
	@Test(priority=1)
	public void correctLogin() throws InterruptedException {
		homePage.goToLoginLink();
		loginPage.fillOutLoginForm(EMAIL, PASSWORD);
	}
	
	@Test(priority=2, enabled = true)
	public void incorrectLogin() throws InterruptedException {
		homePage.goToLoginLink();
		loginPage.fillOutLoginForm(EMAIL, PASSWORD);
		loginPage.verifyIncorrectLogin("Invalid email or password.", "");
	}
}

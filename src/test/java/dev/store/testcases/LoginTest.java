package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class LoginTest extends BaseTest{

	//Contantes
	String EMAIL = "marvin.rosafortin@gmail.com";
	String PASSWORD = "Owasp@1234";
	
	
	@Test
	public void login() {
		homePage.avoidElements();
		homePage.goToLoginLink();
		loginPage.fillOutLoginForm(EMAIL, PASSWORD);
	}
	

}

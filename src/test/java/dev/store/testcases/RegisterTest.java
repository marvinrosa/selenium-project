package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class RegisterTest extends BaseTest{

	String EMAIL = "marvin.rosafortin11@gmail.com";
	String PASSWORD = "Owasp@1234";
	String SECURITY_ANSWER ="HarryPotter";
	
	@Test
	public void register() {
		homePage.avoidElements();
		registerPage.goToRegisterLink();
		registerPage.fillOutRegisterForm(EMAIL, PASSWORD, SECURITY_ANSWER);
	}
	
}

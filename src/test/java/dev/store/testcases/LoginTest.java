package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.pages.LoginPage;
import dev.store.utils.BaseTest;

public class LoginTest extends BaseTest{

	//Contantes
	String EMAIL = "marvin.rosafortin@gmail.com";
	String PASSWORD = "Owasp@1234";
	
	//Instancias
	LoginPage login;
	
	//Testcases
	@Test
	public void login() {
		login = new LoginPage(driver);
		login.getUrl();
		login.fillOutForm(EMAIL, PASSWORD);	
	}

}

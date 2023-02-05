package dev.store.testcases;

import org.testng.annotations.Test;

import dev.store.utils.BaseTest;

public class AddressTest extends BaseTest{

	String COUNTRY="El Sslvador";
	String NAME = "San Salvador";
	String MOBILE ="788975663";
	String ZIP ="503";
	String ADDRESS = "AV";
	String CITY ="San Salvador";
	String STATE ="Soyapango";
	@Test
	public void addNewAddress() throws InterruptedException {
		homePage.avoidElements();
		homePage.goToAccountLink();
		mainPage.goToOrdersPaymentLink();
		Thread.sleep(1000);
		mainPage.goToAdressLink();
		addressPage.addNewForm();
		addressPage.fillOutAddressForm(COUNTRY, NAME, MOBILE, ZIP, ADDRESS, CITY, STATE);
	}
}

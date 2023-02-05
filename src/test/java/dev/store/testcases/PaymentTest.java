package dev.store.testcases;

import org.testng.annotations.Test;

public class PaymentTest extends LoginTest{

	String FULL_NAME = "Marvin Rosa";
	String CARD_NUMBER ="1234567887654321";
	String MONTH = "5";
	String YEAR = "11";
	
	@Test(dependsOnMethods = {"login"})
	public void addNewPaymentMethod() throws InterruptedException {
		homePage.goToAccountLink();
		Thread.sleep(1000);
		mainPage.goToOrdersPaymentLink();
		Thread.sleep(1000);
		mainPage.goToPaymentLink();
		paymentPage.addNewPayment();
		paymentPage.fillOutPaymentForm(FULL_NAME, CARD_NUMBER, MONTH, YEAR);
	}
}

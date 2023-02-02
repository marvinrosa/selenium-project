package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.utils.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]")
	public WebElement popMsg1;
	
	@FindBy(xpath="/html/body/div[1]/div/a")
	public WebElement popMsg2;
	
	@FindBy(css="#navbarAccount > span.mat-button-wrapper > span")
	public WebElement lnkAccount;
	
	@FindBy(css="#navbarLoginButton")
	public WebElement lnkLogin;
	
	@FindBy(css="#searchQuery > span > mat-icon.mat-icon.notranslate.mat-ripple.mat-search_icon-search.ng-tns-c253-1.material-icons.mat-ligature-font.mat-icon-no-color")
	public WebElement btnSearch;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		avoidElements();
	}
	
	//Click on popUps
	public void avoidElements() {
		click(popMsg1);
		click(popMsg2);
	}
	
	public void goToSearchButton() {
		click(lnkAccount);
		click(btnSearch);
	}
	
	public void goToAccountLink() {
		click(lnkAccount);
	}
	
	public void goToLoginLink() {
		click(lnkAccount);
		click(lnkLogin);
	}

}

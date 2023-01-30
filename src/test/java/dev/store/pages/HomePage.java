package dev.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.store.utils.BasePage;

public class HomePage extends BasePage {

	
	//By popMsg1 = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	//By popMsg2 = By.xpath("/html/body/div[1]/div/a");
	
	@FindBy(xpath="//*[@id=\\\"mat-dialog-0\\\"]/app-welcome-banner/div/div[2]/button[2]")
	public WebElement popMsg1;
	
	@FindBy(xpath="/html/body/div[1]/div/a")
	public WebElement popMsg2;
	
	@FindBy(id="navbarAccount")
	public WebElement accountLink;
	
	@FindBy(id="navbarLoginButton")
	public WebElement loginLink;
	
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
		click(accountLink);
		click(btnSearch);
	}
	
	public void goToAccountLink() {
		click(accountLink);
	}
	
	public void goToLoginLink() {
		click(accountLink);
		click(loginLink);
	}

}

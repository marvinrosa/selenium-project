package dev.store.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	// set define time of waiting for an object
	int TIME_OUT_SEC = 3;
	
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIME_OUT_SEC));
	}
	
	// Set time for waiting an object
	public void setTimeOutSec(int timeOutSec) {
		this.TIME_OUT_SEC = timeOutSec;
	}

	//Go to Url
	public void visit(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT_SEC));
		driver.get(url);
	}
	
	// find an element
	public WebElement find(By element) {
		return driver.findElement(element);
	}
	
	// click elements
	public void click(By element) {
			find(element).click();
	}

	// sendkeys elements
	public void type(By element, String text) {
			find(element).sendKeys(text);
	}
	
	public boolean isDisplayed(By element) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (Exception e) {
			return false;
		}
		return true;

	}

}

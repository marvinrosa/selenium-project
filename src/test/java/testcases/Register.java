package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		
		String EMAIL = "marvin.rosafortin@gmail.com";
		String PASSWORD = "Owasp@1234";
		String SELECT_ELEMENT = "\" Your favorite book? \"";
		String SECURITY_ANSWER ="HarryPotter";
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://juice-shop.herokuapp.com/#/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"emailControl\"]"));
		email.sendKeys(EMAIL);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordControl\"]"));
		password.sendKeys(PASSWORD);
		
		WebElement repeatPassword = driver.findElement(By.xpath("//*[@id=\"repeatPasswordControl\"]"));
		repeatPassword.sendKeys(PASSWORD);

		//This element is not selected 
		//Those elements is not working #1
		WebElement selectQuestion = driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]"));
		selectQuestion.sendKeys(SELECT_ELEMENT);
		//#2
		WebElement answerQuestion = driver.findElement(By.xpath("//*[@id=\"securityAnswerControl\"]"));
		answerQuestion.sendKeys(SECURITY_ANSWER);
		//#3 not working
		WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"registerButton\"]/span[1]"));
		registerButton.click();
	}

}

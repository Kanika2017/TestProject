package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends DriverFactory {

	public String submitButton = "//div[@class='form-actions']//a";
	public String forenameError = "forename-err";
	public String emailError = "email-err";
	public String messageError = "message-err";
	public String successAlert = "//div[contains(@class, 'alert-success')]";

	WebDriverWait wait = new WebDriverWait(driver, 40);

	public static String name;

	public void clickOnSubmitButton() {
		driver.findElement(By.xpath(submitButton)).click();
	}

	public Boolean validateForenameError() {
		return isElementDisplayed(By.id(forenameError));
	}

	public Boolean validateEmailError() {
		return isElementDisplayed(By.id(emailError));
	}

	public Boolean validateMessageError() {
		return isElementDisplayed(By.id(messageError));
	}

	public void enterDataIntoField(String fieldName) {
		Random rand = new Random();
		int value = rand.nextInt(999);
		if (fieldName.equals("email")) {
			driver.findElement(By.id(fieldName)).sendKeys("jupiter" + value + "@example.com");
		} else if (fieldName.equals("message")) {
			driver.findElement(By.id(fieldName)).sendKeys("this is for testing");
		} else {
			name = "jupiter" + value;
			driver.findElement(By.id(fieldName)).sendKeys(name);

		}
	}

	public boolean isElementDisplayed(By locKey) {
		try {
			driver.findElement(locKey);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public Boolean validateSuccessMessage() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("« Back")));
		System.out.println(driver.findElement(By.xpath(successAlert)).getText());
		System.out.println(name);

		return driver.findElement(By.xpath(successAlert)).isDisplayed() && driver.findElement(By.xpath(successAlert))
				.getText().contains("Thanks " + name + ", we appreciate your feedback.");

	}
	
	public void enterIncorrectDataIntoEmailField() {
			driver.findElement(By.id("email")).sendKeys("@jupiter");

	}

}

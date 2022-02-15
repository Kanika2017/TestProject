package Pages;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverFactory {

	public String NavigationBarElements = "//ul//li//a";

	public void ClickOnOptionInNavigationBar(String Option) {
		List<WebElement> ele = driver.findElements(By.xpath(NavigationBarElements));
		for (WebElement element : ele) {
			if (element.getText().contains(Option)) {
				element.click();
				break;
			}
		}

	}

	
	public void CloseBroswer() {
		driver.close();
		driver.quit();
	}
}

package Pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverFactory {

		public static Properties config;
		public static WebDriver driver;

		public static void initialization() throws IOException {
			config = new Properties();
			try {
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

			String browser = config.getProperty("browser");
			if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			String web_url=config.getProperty("url");
			driver.get(web_url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

}

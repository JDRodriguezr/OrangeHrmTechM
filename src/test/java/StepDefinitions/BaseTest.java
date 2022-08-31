package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class BaseTest {

	
	protected WebDriver driver;
	protected WebDriverWait wait;
	public final String URL_LOGIN= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public BaseTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\julia\\eclipse-workspace\\SeleniumCuc\\src\\test\\resources\\Webdriver\\geckodriver.exe");

        this.driver = new FirefoxDriver();        
        this.driver.manage().window().maximize();
        this.driver.get(URL_LOGIN);
        
    }
		
	
	@AfterTest
	public void tearDown() {
		this.driver.quit();
	}
		
}

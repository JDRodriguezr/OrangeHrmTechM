package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	public final String URL_LOGIN= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	

	
	public BasePage(WebDriver driver) {		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\julia\\eclipse-workspace\\SeleniumCuc\\src\\test\\resources\\Webdriver\\geckodriver.exe");
		// add conditions to run any desired browser	
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		System.out.println("INICIALICE LOS ELEMENTOS");
	}
	
	public void navigateToOrangeLoginPage() 
	{
		this.driver = new FirefoxDriver();// add conditions to run any desired browser		
		this.driver.manage().window().maximize();
		
		this.driver.get(URL_LOGIN);	
		System.out.println("FUIMOS AL LOGIIIN");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public WebDriver getWebDriver() {
		return this.driver;
	}
	


}

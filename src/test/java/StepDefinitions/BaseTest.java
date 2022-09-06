package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import pages.LoginPage;
import pages.PimPage;
import pages.SidebarPage;

public class BaseTest  {

 
	public static WebDriver driver;
	public static PimPage pimPage;
	public static LoginPage login;
	public static SidebarPage sidebPage;
	
	@BeforeTest
	public WebDriver initializeDriver () throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("BROWSER");
		String URL_LOGIN = prop.getProperty("URL_LOGIN");
		browserName.toLowerCase();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();     
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();     
		}		
		
		else {
			System.out.println("else intializeDriver other browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver; 
    }
		
	public void launchApplication() throws IOException {
		driver = initializeDriver();
		login = new LoginPage(driver);
		login.goTo();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
		
}

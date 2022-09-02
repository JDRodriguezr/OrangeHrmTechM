package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
        
    }
	
	public WebElement waitForElementToBeVisible(WebElement element) {
		this.wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}	
	public WebElement waitForElementToBeInvisible(WebElement element) {
		this.wait.until(ExpectedConditions.invisibilityOfAllElements(element));
		return element;
	}			
	public WebElement waitForElementToBeClickable(WebElement element) {
		this.wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

}

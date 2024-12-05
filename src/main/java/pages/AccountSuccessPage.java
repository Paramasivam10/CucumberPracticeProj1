package pages;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonUtils;
import utils.ElementUtils;

public class AccountSuccessPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public AccountSuccessPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	}
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement pageHeading;
	
	public String getPageHeading() {
//         JavascriptExecutor js=(JavascriptExecutor)driver;
//         js.executeScript("window.scrollBy(0,-50");
//         WebDriverWait driverwait= new WebDriverWait(driver,Duration.ofSeconds(20));
//         WebElement ele= driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.id(getPageHeading())));
		return elementUtils.getTextFromElement(pageHeading,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}

}

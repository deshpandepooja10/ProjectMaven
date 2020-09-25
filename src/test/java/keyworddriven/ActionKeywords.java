package keyworddriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;
public class ActionKeywords {

	private static WebElement getWebElement;

	public static void launch(String browser)
	{
		switch(browser)
		{
		case "Chrome":

            WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","E:\\Library\\chromedriver.exe");
			Constants.driver=new ChromeDriver();
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","E:\\Library\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			Constants.driver=new FirefoxDriver();
			break;
			default:System.out.println("no browser found");
				break;
			
		}
	}
	public static void launchUrl(String url)
	{
		Constants.driver.get(url);
	}
	public static  WebElement getWebElement(String locatorType,String locatorValue)
	{
		switch(locatorType)
		{
		case "Xpath":
			Constants.element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			Constants.element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			Constants.element=Constants.driver.findElement(By.id(locatorValue));
			break;
		case "name":
			Constants.element=Constants.driver.findElement(By.name(locatorValue));
			break;
		case "Tagnm":
			Constants.element=Constants.driver.findElement(By.tagName(locatorValue));
			break;
		}
		return Constants.element;
	}
	public static void clickonElement(String locatorType,String locatorValue)
	{
		getWebElement(locatorType,locatorValue).click();
	}
	public static boolean isElementDisplayed(String locatorType,String locatorValue)
	{
		return getWebElement(locatorType,locatorValue).isDisplayed();
	}
	public static WebElement enterText(String locatorType,String locatorValue,String text)
	{
		 
		getWebElement(locatorType,locatorValue).sendKeys(text);
		return getWebElement;
		 
	}
	
	public static void mouseoverclick()
	{
		Actions act=new Actions(Constants.driver);
		act.click();
		
	}
	public static void Highlightele()
	{
		Actions act=new Actions(Constants.driver);
		act.perform();
	}
	
	public static List<WebElement> getWebElements(String locator,String locatorValue)
	{
		List<WebElement> list=null;
		
		
		switch(locator)
		{
		case "XPATH":
			list=Constants.driver.findElements(By.xpath(locatorValue));
			
			break;
		case "CSS":
			list=Constants.driver.findElements(By.cssSelector(locatorValue));
			break;
	}
	
		Constants.multipletext=Constants.driver.findElements(By.xpath(locatorValue));
		return list;
}
	public static void getControlKeys(WebElement target)
	{
		Actions act=new Actions(Constants.driver);
		act.keyDown(target,Keys.CONTROL).sendKeys(Keys.TAB);
	}
	public static boolean isElementEnabled(String locatorType,String locatorValue)
	{
		return getWebElement(locatorType,locatorValue).isEnabled();
	}
	
}
	
			
		
	






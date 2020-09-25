package Ijmeet_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import keyworddriven.ActionKeywords;
import pages.ContactSalesPom;
import pages.SignInPagePom;
import setUp.OpenCloseBrowser;
import setUp.PropertiesFile;
import utility.Constants;

public class SignInPage extends OpenCloseBrowser{
	@Ignore
	@Test
	public void getTitle()  
	{
		String actualurl="https://ijmeet.com/login";
	    String expectedurl=Constants.url;
		Assert.assertEquals(actualurl,expectedurl);
	}
	@Ignore
	@Test
	public void isDisplayedlogo()
	{
		 ActionKeywords.getWebElement("Xpath",PropertiesFile.getProperty("SignInlogo"));
		 SignInPagePom page=PageFactory.initElements(Constants.driver,SignInPagePom.class);
		 page.isDisplayedlogo();
	}
	@Ignore
	@Test
	public void EmailTc_one()
	{
		 WebElement email=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInEmail"));
		 email.sendKeys("punam10@gmail");
		 WebElement password=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInpassword"));
		 password.sendKeys("adasdd");
		 WebElement sendbutton=ActionKeywords.getWebElement("Xpath",PropertiesFile.getProperty("SignInbutton"));
		 sendbutton.click();
		  WebElement matchrecords=ActionKeywords.getWebElement("Xpath", PropertiesFile.getProperty("matchrec"));
		  String recordstext=matchrecords.getText();
		  System.out.println(recordstext);
		  Assert.assertTrue(ActionKeywords.isElementDisplayed("Xpath", PropertiesFile.getProperty("match")));
			 
				//JavascriptExecutor j=(JavascriptExecutor) Constants.driver;
				//j.executeScript("arguments[0].isDisplayed;", matchrecords);
		  }
	@Ignore
	@Test
	public void EmailTc_two()
	{
		 WebElement email=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInEmail"));
		 email.sendKeys("punam10@");
		 WebElement password=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInpassword"));
		 password.sendKeys("adasdd");
		 WebElement sendbutton=ActionKeywords.getWebElement("Xpath",PropertiesFile.getProperty("SignInbutton"));
		 sendbutton.click();
		 
		 WebElement hiddenele=Constants.driver.findElement(By.xpath("//input[@name=\\\"_token\\\"]"));
		 String s=hiddenele.getText();
		 System.out.println(s);
			JavascriptExecutor j=(JavascriptExecutor) Constants.driver;
			j.executeScript("arguments[0].isDisplayed;", hiddenele);
	}
    @Ignore
	@Test
	public void EmailTc_three()
	{
		 WebElement email=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInEmail"));
		 email.sendKeys("punnisharma20@gmail.com");
		 WebElement password=ActionKeywords.getWebElement("CSS",PropertiesFile.getProperty("SignInpassword"));
		 password.sendKeys("Sweet@20");
		 WebElement sendbutton=ActionKeywords.getWebElement("Xpath",PropertiesFile.getProperty("SignInbutton"));
		 sendbutton.click();
		 WebElement dashboarddispl=ActionKeywords.getWebElement("Xpath",PropertiesFile.getProperty("dashboard"));
		 String Url="https://www.ijmeet.com/dashboard";
		 Assert.assertTrue(Url.contains("https://www.ijmeet.com/dashboard"));
       }
	@Ignore
	@Test 
	 public void emailplaceholder()
     {
    	 WebElement placeholderele=ActionKeywords.getWebElement("Xpath", PropertiesFile.getProperty("emailplaceholder"));
    	
    	 Assert.assertTrue(placeholderele.isDisplayed());
        
     }
	
	@Test
	public void passwordplaceholder()
	{
		 WebElement placeholderele=ActionKeywords.getWebElement("Xpath", PropertiesFile.getProperty("passwordpalce"));
		 Assert.assertTrue(placeholderele.isDisplayed());
		 System.out.println("password");
	}
}
	


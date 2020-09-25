package Ijmeet_pages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import keyworddriven.ActionKeywords;
import pages.ContactSalesPom;
import setUp.OpenCloseBrowser;
import setUp.PropertiesFile;
import utility.Constants;
import keywords.Keywords;
public class ContactSalesPage extends OpenCloseBrowser {
	@Ignore
	@Test
	public void verifyurl()
	{
		String expurl="https://ijmeet.com/contact";
		String actualdurl=Constants.url;
		Assert.assertEquals(expurl, actualdurl);
	}
	@Ignore
	@Test
	public void contactsalesfieldsdisplay()
	{
		List<WebElement> fieldstext=ActionKeywords.getWebElements("XPATH",PropertiesFile.getProperty("Contactsalesfields"));
		int size=fieldstext.size();
		//System.out.println(size);
		for(WebElement eletext:fieldstext)
		{
			String textfields=eletext.getText();
			//System.out.println(textfields);	
			List<String> exptext=new ArrayList();
			exptext  .add("Name");
			exptext.add("Email");
			exptext.add("Message");
			Assert.assertTrue(exptext.contains(textfields));
	}
	}
	    @Ignore
	     @Test
	     public void captchadisplay()
		{
	    	 ActionKeywords.getWebElement("Xpath", PropertiesFile.getProperty("captcha"));
	    	 ContactSalesPom field=PageFactory.initElements(Constants.driver,ContactSalesPom.class);
	    	 Assert.assertTrue(field.IsDisplayedCaptcha());
		}
	    @Ignore
	     @Test
		public void dispcontactsalesfields()
		{
	    	 List<WebElement> exptextfields=ActionKeywords.getWebElements("XPATH", PropertiesFile.getProperty("Contactsalesfield"));
	    	 for(WebElement eletexts:exptextfields)
	    	 {
	    		 String actualtxts=eletexts.getText();
	    		 System.out.println(actualtxts);
			
			  List<String> actualtextfields=new ArrayList();
			  
			  actualtextfields.add("Address");
			  actualtextfields.add("Mobile no");
			  actualtextfields.add("Whatsapp"); 
			  actualtextfields.add("Email Id");
			  Assert.assertEquals(actualtextfields,actualtxts);
	    	 }
		}
	      @Test
	      public void Namefieldtext() throws InterruptedException 
	      {
	    	 
		/*
		 * WebElement eleactualname=Constants.driver.findElement(By.
		 * xpath("//input[@placeholder=\"Enter your name \"]"));
		 * eleactualname.sendKeys("punam20");
		 * 
		 * ActionKeywords.getControlKeys(eleactualname);
		 * 
		 * WebElement eleactualemail=Constants.driver.findElement(By.
		 * xpath("//input[@placeholder=\" Enter your email \"]"));
		 * eleactualemail.sendKeys("punnisharma20@gmail.com");
		 * 
		 * ActionKeywords.getControlKeys(eleactualemail);
		 * 
		 * WebElement eleactualmessage=Constants.driver.findElement(By.
		 * xpath("//textarea[@placeholder=\" Type message \"]"));
		 * eleactualmessage.sendKeys("This is automation Testing");
		 * ActionKeywords.getControlKeys(eleactualmessage);
		 */
	    	   WebElement elecaptcha=Constants.driver.findElement(By.xpath("//iframe[@role=\"presentation\"]"));    	   
	    	   Constants.driver.switchTo().frame(elecaptcha);
	    	   Constants.driver.findElement(By.xpath("//span[@id=\"recaptcha-anchor\"]")).click();
	    	   Thread.sleep(1000);
	    	   WebElement verifycaptcha=Constants.driver.findElement(By.xpath("//iframe[@title=\"recaptcha challenge\"]"));
	    	   Constants.driver.switchTo().frame(verifycaptcha);
	    	   WebElement newchallenge=Constants.driver.findElement(By.xpath("//button[@title=\"Get a new challenge\"]"));
	    	   newchallenge.click();
		/*
		 * newchallenge.click(); Constants.driver.findElement(By.
		 * xpath("//div[text()=\"Select all images with \"]")); Crosswalks=
		 * //strong[text()="crosswalks"] traffic
		 * lights=//strong[text()="traffic lights"] bicycles=//strong[text()="bicycles"]
		 * boats=//strong[text()="boats"]
		 * 
		 * 
		 * new challenge //button[@class="rc-button-default goog-inline-block"] skip
		 */	    	  
	         
	    
	    	  
	    	 
	    	 
	    	
	    	 
	    	 	    	 
	    	  
	      }
		
		
		
		}	
	
	
	

package Ijmeet_pages;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import setUp.Constants;

import setUp.PageModelhome;
import setUp.PropertiesFile;

import setUp.openandclose;
import setUp.openbrowser;
import setUp.useWaits;
public class HomePage extends openandclose {
	
	
		  Logger log=Logger.getLogger(HomePage.class);
		  @Test
		  public static void launchh() {
		  
		  Logger log=Logger.getLogger(HomePage.class);
		  openbrowser.launch("Chrome");
		  
		  log.info("ijmeet homepage open successfully");//PropertiesFile }
		  }
		  @Test
		  public void verifyUrl()
		  {
			  String ExpUrl="https://www.ijmeet.com";
			  String actUrl=Constants.url;
			  Assert.assertEquals(ExpUrl, actUrl);
		  }
		@Test
		public void Ijmeetlogo() {
			
			  
	          Assert.assertTrue(openbrowser.isElementDisplayed("Xpath", PropertiesFile.getProperty("logo")),"logo is displayed");
	         
	          log.info("homepage open successfully");
	          log.info("Ijmeet logo is displayed");
	      }
		@Test(enabled=false)
		public void linksdisplayed()  {
			openbrowser.getWebElements("XPATH",PropertiesFile.getProperty("threelinks"));
			
		   
		
		   // Assert.assertTrue(openbrowser.isElementDisplayed("XPATH",PropertiesFile.getProperty("threelinks")),"The 3 links are displayed");
		       List<WebElement> textlinks=Constants.driver.findElements(By.xpath("//li[@class=\"nav-item\"]/a"));
		       Iterator<WebElement> itr=textlinks.iterator();
		     
		       List<String> explinkstext=new ArrayList();
		       explinkstext.add("Join Meeting");
		       explinkstext.add("Host Meeting");
		       explinkstext.add("Contact sales");
		      List<String> actuallinktext=new ArrayList();
		         while(itr.hasNext())
		         {
		    	   String itemstext=itr.next().getText();
		    	   actuallinktext.add(itemstext);
		    	   }
		       // Assert.assertTrue(explinkstext.containsAll(actuallinktext),"the 3 links are displayed");
		      Thread.sleep(5000);
		      List<WebElement> nextthreelinks=Constants.driver.findElements(By.xpath("//li[@class=\"nav-item m-navitemone mx-1\"]/a"));
		       Iterator<WebElement> itr1=nextthreelinks.iterator();
		       List<String> explinktext=new ArrayList();
		       explinktext.add("Sign In");
		       explinktext.add("Sign Up");
		       explinktext.add(" عربى ");
		      List<String> actuallinkstext=new ArrayList();
		      while(itr1.hasNext())
		      {
		    	  String menustext=itr1.next().getText();
		    	  actuallinkstext.add(menustext);
		      }
		      Assert.assertTrue(explinktext.containsAll(actuallinkstext),"The next 3 links are displayed");
		       

		}

		/*
		 * @Test public void nextthreedis() {
		 * 
		 * List<WebElement> nextthreelinks=Constants.driver.findElements(By.
		 * xpath("//li[@class=\"nav-item m-navitemone mx-1\"]/a")); Iterator<WebElement>
		 * itr1=nextthreelinks.iterator(); List<String> explinktext=new ArrayList();
		 * explinktext.add("Sign In"); explinktext.add("Sign Up");
		 * explinktext.add(" عربى "); List<String> actuallinkstext=new ArrayList();
		 * while(itr1.hasNext()) { String menustext=itr1.next().getText();
		 * actuallinkstext.add(menustext); }
		 * Assert.assertTrue(explinktext.containsAll(actuallinkstext)
		 * ,"The next 3 links are displayed");
		 * 
		 * }
		 */
		@Test(enabled=false)
		public void JoinMeetclickable() {
			openbrowser.getWebElements("XPATH", PropertiesFile.getProperty("JoinMeeting"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			home.joinmeetingclick();
			Assert.assertTrue(true);
			
		}
		@Test(enabled=false)
		public void JoinMeetdis()
		{
			openbrowser.getWebElements("XPATH", PropertiesFile.getProperty("JoinMeeting"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			Assert.assertTrue(home.JoinMeetingDispalyed(),"Join Meeting is displayed");
		}
		@Test(enabled=false)
		public void JoinMeethighlight() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("JoinMeeting"));
			
			openbrowser.Highlightele();
			
		}
		@Test(enabled=false)
		public void Hostmeetmouseover() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("HostMeeting"));
			openbrowser.Highlightele();
		}
		@Test(enabled=false)
		public void Hostmeetdisp() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("HostMeeting"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			Assert.assertTrue(home.hostMeetingdis(), "host meeting is displayed");
		}
		@Test(enabled=false)
		public void Hostmeetclick() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Contactsales"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
		    home.hostMeetingclick();
		    Assert.assertTrue(true);
			}
		@Test(enabled=false)
		public void Contactsalesdsip()
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Contactsales"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			Assert.assertTrue(home.Contactsalesdisplay(), "the contact sales is dispalyed");
			
		}
		@Test(enabled=false)
		public void Contactsalesclick()
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Contactsales"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			home.Contactsalesclick();
			Assert.assertTrue(true);
		}
		@Test(enabled=false)
		public void SignIndisp() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("SignIn"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			Assert.assertTrue(home.SignIndisplay(), "the Sign in  link is displayed");
			
		}
		@Test(enabled=false)
		public void SignInclick() {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("SignIn"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			home.SignInclick();
			Assert.assertTrue(true);
			
		}
		@Test(enabled=false)
		public void SignUpdisp()
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("SignUp"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			home.SignUpdisplay();
			Assert.assertTrue(home.SignUpdisplay(),"The Sign Up link is displayed");
		}
		@Test(enabled=false)
		public void SignUpclick() 
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("SignUp"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);
			home.SignUpclick();
			Assert.assertTrue(true);
		}
		@Test(enabled=false)
		public void imgArabicdis()
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("imgarabic"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);	
			Assert.assertTrue(home.imglangdisplay(),"The imgarabic link is displayed");
		}
		@Test(enabled=false)
		public void imgArabicclick()
		{
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("imgarabic"));
			PageModelhome home=PageFactory.initElements(Constants.driver,PageModelhome.class);	
			home.imglangclick();
		}
		@Test(enabled=false)
		public void langengimgdisp() throws InterruptedException {
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("imgarabic"));
			openbrowser.clickonElement("Xpath", PropertiesFile.getProperty("imgarabic"));
			Thread.sleep(2000);
			openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("imgenglish"));
			
			openbrowser.clickonElement("Xpath",PropertiesFile.getProperty("imgenglish"));
			
		} 
		@Test(enabled=false)
		public void IfrtCollaborationdisp() throws InterruptedException {
			String Expectedtext="Ijmeet for remote team\r\n" + 
					"Collaboration.";
			System.out.println(Expectedtext);

			WebElement ele=openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Collaboration"));
			String ele1=ele.getText();
		 	//System.out.println(ele1);
		 	if(Expectedtext.contains(ele1))
		 	{
	               Assert.assertTrue(true);
			       
		      }
		  }
		@Test(enabled=false)
		public void Trustedbiatwdisp() {
			String Expectedtext="   Trusted by industry across the  world  ";
			WebElement ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Trusted") );
			String ele1=ele.getText();
			if(Expectedtext.contains(ele1))
			{
				Assert.assertTrue(true);
			}
		}
		@Test(enabled=false)
		public void Trustedslides() {
			List<WebElement> ele=openbrowser.getWebElements("XPATH",PropertiesFile.getProperty("slides"));
			//List<WebElement> ele1=ele.(By.tagName("img"));
		    Iterator<WebElement> itr=ele.iterator();
		    while(itr.hasNext())
		    {
		        WebElement e=itr.next();
		        if(e.isDisplayed())
		        {
		        	Assert.assertTrue(true);
		        }
		    }
		}    
		@Test(enabled=false)
		public void Chatmsgdisp() {
			String Expectedtext="Chat Message";
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("chatmsg"));
			String s=Constants.ele.getText();
			//System.out.println(s);
			if(Expectedtext.contains(s))
			{
				Assert.assertTrue(true);
			}
			
		}
		@Test(enabled=false)
		public void videocondisp()  {
			String Exptext="Video Conferencing";
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("videoconference"));
			String s=Constants.ele.getText();
			
			if(Exptext.contains(s))
			{
				Assert.assertTrue(true);
			   
			}
		}
		@Test(enabled=false)
		public void addressdisp() throws InterruptedException
		{
			String Exptext="Address";
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Address"));
			String actualtext=Constants.ele.getText();
			if(Exptext.contains(actualtext))
			{
				Assert.assertTrue(true);
			}
			Thread.sleep(1000);
			String Expaddress="United security Building, 3rd floor.\r\n" + 
					"Gala Muscat, Oman";
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Addressdet"));
			String actuatext=Constants.ele.getText();
			if(Expaddress.contains(actuatext))
			{
				Assert.assertTrue(true);
			}
			
		}
		@Test(enabled=false)
		public void androidicondisp()
		{
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Androidicon"));
			Assert.assertTrue(openbrowser.isElementDisplayed("Xpath", PropertiesFile.getProperty("Androidicon")));
			
		}
		@Test(enabled=false)
		public void androidiconclick() {
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Androidicon"));
			openbrowser.mouseoverclick();
			Assert.assertTrue(true);
			
		}
		@Test(enabled=false)
		public void iosdisplay()
		{
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("iosicon"));
			Assert.assertTrue(openbrowser.isElementDisplayed("Xpath",PropertiesFile.getProperty("iosicon")));
			
		}
		@Test(enabled=false)
		public void iosclick()
		{
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("iosicon"));
			openbrowser.mouseoverclick();
		}
		@Test(enabled=false)
		public void windowsdisp()
		{
			Constants.ele=openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Windowsicon"));
			Assert.assertTrue(openbrowser.isElementDisplayed("Xpath", PropertiesFile.getProperty("Windowsicon")));
		}
		@Test(enabled=false)
		public void windowsclick()
		{
			Constants.ele=openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Windowsicon"));
			openbrowser.mouseoverclick();
		
	    }
		@Test(enabled=false)
		public void helpandsupportDisp()
		{
			String Exptext="Help & Support";
			Constants.ele=openbrowser.getWebElement("Xpath", PropertiesFile.getProperty("Helpandsupport"));
			String actualtext=Constants.ele.getText();
			//System.out.println(actualtext);
			Assert.assertTrue(openbrowser.isElementDisplayed("Xpath", PropertiesFile.getProperty("Helpandsupport")));
		}
		@Test(enabled=false)
		public void helpsupportlinksDisp() throws InterruptedException {
			String expText="Support";
			Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Support"));
		    String actualtext=Constants.ele.getText();
		   // System.out.println(actualtext);
		    if(expText.contains(actualtext))
		    {
			     Assert.assertTrue(true);
			}
		    Thread.sleep(1000);
		    String expecText="Contact Us";
		    Constants.ele=openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Contactus"));
		    String actualText=Constants.ele.getText();
		    if(expecText.contains(actualText))
		    {
		    	Assert.assertTrue(true);
		    }
		    
		 }
		@Test
		public void helpsupportlinksclick() throws InterruptedException
		{
			
			openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Supplink"));
			openbrowser.clickonElement("Xpath",PropertiesFile.getProperty("Supplink"));
			//Assert.assertTrue(true);
			
			  String parent=Constants.driver.getWindowHandle(); for(String
			  handle:Constants.driver.getWindowHandles()) {
			  Constants.driver.switchTo().window(handle); }
			  
			  Constants.driver.get(Constants.url);
			 Thread.sleep(2000);
		
			openbrowser.getWebElement("Xpath",PropertiesFile.getProperty("Contactuslink"));
			
			openbrowser.mouseoverclick();
			Assert.assertTrue(true);
			
		}
		
	}

		    	  


		







}

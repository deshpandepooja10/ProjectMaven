package setUp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import keyworddriven.ActionKeywords;
import utility.Constants;

public class OpenCloseBrowser {
	@BeforeMethod
	public void open() throws InterruptedException {

		ActionKeywords.launch("Chrome");
		ActionKeywords.launchUrl(Constants.url);
		Constants.driver.manage().window().maximize();
		//Constants.wait=new FluentWait(Constants.driver);
		Thread.sleep(5000);
	    		
	}
	@AfterMethod
	public void close() throws InterruptedException {
	
		Constants.driver.close();
	}

}



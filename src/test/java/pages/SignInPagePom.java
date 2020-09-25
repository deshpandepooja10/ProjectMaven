package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPagePom {
	@FindBy(xpath="//form[@action=\"https://ijmeet.com/login\"]")
	private WebElement Url;
	@FindBy(xpath="//h4[text()=\" Sign In \"]")
	private WebElement logo;
	@FindBy(xpath="//strong[text()=\"These credentials do not match our records.\"]")
	private WebElement dontmatchrecords;
	
	public boolean isDisplayedurl()
	{
		return Url.isDisplayed();
	}
	public boolean isDisplayedlogo()
	{
		return logo.isDisplayed();
	}
	public boolean isDisplayedrecordsmsg()
	{
		return  dontmatchrecords.isDisplayed();
	}
	

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Constants;
public class HomePagePom {
	HomePagePom home=PageFactory.initElements(Constants.driver,HomePagePom.class);
	@FindBy(xpath="//a[@href=\"https://ijmeet.com/app\"] ")
	private WebElement JoinMeeting;
	
	@FindBy(xpath="//a[@href=\"https://ijmeet.com/host_meeting\"]")   
	private WebElement hostmeet;
	
	@FindBy(xpath="//a[text()=\"  Contact sales \" ]")
	private WebElement Contactsales;
	
	@FindBy(xpath="//a[@href=\"https://ijmeet.com/login\"]")
	private WebElement Signin;
	
	@FindBy(xpath="//*[@id=\"navbarContent\"]/ul/li[5]/a")
	private WebElement Signup;
	
	@FindBy(xpath="//span[@class=\"language-trance-arabic\"]")
	private WebElement imgarabic;
	
	private WebElement engimg;
	public void joinmeetingclick()
	{
		JoinMeeting.click();
	}
	public  boolean JoinMeetingDispalyed() {
		 return JoinMeeting.isDisplayed();
	}
	public boolean hostMeetingdis() {
		return hostmeet.isDisplayed();
		
	}
	public void hostMeetingclick() {
		hostmeet.click();
	}
	public boolean Contactsalesdisplay() {
		return Contactsales.isDisplayed();
	}
	public void Contactsalesclick() {
		Contactsales.click();
		
	}
	public boolean SignIndisplay()
	{
		return Signin.isDisplayed();
	}
	public void SignInclick()
	{
		Signin.click();
	}
	public boolean SignUpdisplay()
	{
		return Signup.isDisplayed();
	}
	public void SignUpclick()
	{
		Signup.click();
	}
	public boolean imglangdisplay()
	{
		return imgarabic.isDisplayed();
	}
	public void imglangclick()
	{
		imgarabic.click();
	}
	/*
	 * public boolean engimgdisp() { return engimg.isDisplayed();
	 * 
	 * } public void imgenglangclick() { engimg.click(); }
	 */

}



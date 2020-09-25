package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Constants;

public class ContactSalesPom {
	
	//ContactSalesPom Page=PageFactory.initElements(Constants.driver,ContactSalesPom.class);
	@FindBy(xpath="//div[@class=\"form-group\"]")
	private WebElement fields;
	@FindBy(xpath="//input[@name=\"user_name\"]")
	private WebElement name;
	@FindBy(xpath="//input[@name=\"user_email\"]")
	private WebElement Email;
	@FindBy(xpath="//textarea[@name=\"user_message\"]")
	private WebElement Msg;
	@FindBy(xpath="//label[text()=\"  Captcha \"]")
	private WebElement captcha; 
	@FindBy(xpath="//div[@class=\"media-body\"]/h4")
	private  WebElement contactsalesfield;
	
	public boolean IsDisplayedfields()
	{
		return fields.isDisplayed();
	}
	public boolean IsDisplayedname()
	{
		return name.isDisplayed();
	}
	public boolean IsDisplayedEmail()
	{
		return Email.isDisplayed();
	}
	public boolean IsDisplayedMsg()
	{
		return Msg.isDisplayed();
	}
	public boolean IsDisplayedCaptcha()
	{
		return captcha.isDisplayed();
	}
	public boolean IsDisplayedContactfields()
	{
		return contactsalesfield.isDisplayed();
	}
	
	
	

}

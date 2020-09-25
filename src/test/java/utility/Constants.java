package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class Constants {
    public static final String url="https://ijmeet.com/login";
	public static  WebDriver driver;
	public static FluentWait wait;//used in Waits class
	public static WebElement element=null;//used in locators
	public static  WebElement ele;//used in waits
	public static List<WebElement>  multipletext;
	
}



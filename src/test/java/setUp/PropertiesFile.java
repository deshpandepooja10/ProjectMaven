package setUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args)
	{
		getProperty("logo");                                          
	}
	public static String getProperty(String key)
	{
		String value=null;
		String path=System.getProperty("user.dir");
		//System.out.println(path);
		try {
			FileInputStream file=new FileInputStream(path+"/src//test//resources//IJmeet.properties");
		
			Properties prop=new Properties();
			prop.load(file);
			value=prop.getProperty(key);
			
			} 
			
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return value;

}
}

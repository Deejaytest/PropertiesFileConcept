package TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import objectsRepository.apidemosHome;

public class apidemoHomePageTC01 extends Baseclass {
	
	
	public static void main(String[] args) throws IOException
	{
		AndroidDriver driver = capabilities();
		apidemosHome obj1 = new apidemosHome(driver);
		obj1.Home_preference.click();
		
		
	}
}

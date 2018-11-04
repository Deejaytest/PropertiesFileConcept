package TestCases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass {

	public static AndroidDriver capabilities() throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\c-deepak.jindal\\eclipse-workspace\\ReusableComponent\\src\\apidemosParams.properties");
		prop.load(fis);

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, prop.getProperty("platform"));
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("device_name"));
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		return driver;
	}

}

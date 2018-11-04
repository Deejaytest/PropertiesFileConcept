package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apidemosHome {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Home_preference ;

	public apidemosHome(AndroidDriver driver) {
//		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		
	
}

package elementslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginlocators {
	
	
	
	@FindBy(id="userName")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(name="submitBtn")
	public static WebElement login_button;
	

	
	

}

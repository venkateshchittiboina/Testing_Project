package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attributes {
	
	
	@FindBy(id="ap_email")
	public static WebElement emailid;
	
	@FindBy(id="continue")
	public static WebElement login_button;
	
	
	/*public static WebElement emailid(WebDriver d1) {
		return d1.findElement(By.id("ap_email"));
	}
	
	
	public static WebElement login_button(WebDriver d1) {
		return d1.findElement(By.id("continue"));
	}*/

}

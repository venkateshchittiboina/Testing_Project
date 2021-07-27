package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elementslocator.Loginlocators;

public class Login {
	
	
	@Test
	
	public void test() {
		System.setProperty("webdriver.chrome.driver","E:\\HCL\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		
		d1=new ChromeDriver();
		
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		
	   PageFactory.initElements(d1,Loginlocators.class);
	   
	   Loginlocators.username.sendKeys("k");
	   Loginlocators.password.sendKeys("h");
	   Loginlocators.login_button.click();
	   
	   
		
		
		
		
		
		
		

	}

}

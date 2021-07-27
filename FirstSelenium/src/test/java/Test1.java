

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Test1 {
	
	@Test
	public void test() throws InterruptedException, IOException, AWTException {
		WebDriver d1;
		
		FileInputStream f1=new FileInputStream("src//test//java//com/sample/Config.properties");
		
		
		Properties prop=new Properties();
		
		prop.load(f1);
		
		String browser=prop.getProperty("browser");
		
		String driver=prop.getProperty("driverlocation");
		
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		
	System.setProperty("webdriver.chrome.driver",driver);
	d1=new ChromeDriver();
	
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver",driver);
			
			d1=new FirefoxDriver();
			
		}
		
		else {
			
System.setProperty("webdriver.ie.driver",driver);
			
			d1=new InternetExplorerDriver();
			
			
			
		}
		
		   d1.get("https://www.amazon.com/ap/signin?ie=UTF8&ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3Dfrankincense%2Bessential%2Boil%26gclid%3DCj0KCQiAqo3-BRDoARIsAE5vnaIQn6uWd93Ko3Zk7nq2gp5n-YCj8ZbTQv_hlZX6UQJtP6IOp7U3LYIaAv5-EALw_wcB%26hvadid%3D410040907420%26hvdev%3Dc%26hvlocint%3D9014226%26hvlocphy%3D9061892%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D6462609788526845593%26hvtargid%3Dkwd-13819312%26hydadcr%3D21883_11242022%26tag%3Dgooghydr-20%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&fromAuthPrompt=1&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");

	
    d1.manage().window().maximize();
	
		
   
   
d1.findElement(By.id("ap_email")).sendKeys("karthikaa20@gmail.com");

d1.findElement(By.id("continue")).click();


File f=new File("C:\\Users\\visit\\Desktop\\cookies.data");

try {
	
	
	f.createNewFile();
	
	FileWriter fw=new FileWriter(f);
	
	BufferedWriter Bw=new BufferedWriter(fw);
	
	for (Cookie ck:d1.manage().getCookies()) {
		
		
		Bw.write((ck.getDomain()+";"+ck.getName()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry()));
		
		Bw.newLine();
		
	}
	
	Bw.close();
	
	fw.close();			
	}
	
	
	
	
	catch(Exception e) {
		
		
		System.out.println(e);

}

		
	}}
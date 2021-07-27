package com.webdivers;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 {


	@Test

	public void script1() throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\HCL\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1=new ChromeDriver();

		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d1.manage().window().maximize();

		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		WebElement ele1=d1.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		

		jse.executeScript("arguments[0].scrollIntoView(true);",ele1);
	 
	 ele1.sendKeys("karthika");

		
		
		
		
	}

}

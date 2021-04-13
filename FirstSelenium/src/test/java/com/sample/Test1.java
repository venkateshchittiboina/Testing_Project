package com.sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver","E:\\HCL\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d1;
	
	d1=new ChromeDriver();
	
	d1.get("http://www.leafground.com/pages/Alert.html");
	
	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	
	d1.switchTo().alert().accept();
	
	d1.close();
	
	}

}

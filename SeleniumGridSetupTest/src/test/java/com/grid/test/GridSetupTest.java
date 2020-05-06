package com.grid.test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridSetupTest {
	WebDriver driver;
	String huburl,baseurl;
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		baseurl="https://www.toolsqa.com/";
		
		URL url = new URL("http://localhost:5656/wd/hub");
		Thread.sleep(3000);
		//1.Defini desired capability
		DesiredCapabilities cap = new DesiredCapabilities().firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(url,cap);
		
	}
	
	@Test
	public void lunch() throws InterruptedException {
		driver.get(baseurl);
		String title = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("Title of page >> " + title);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}

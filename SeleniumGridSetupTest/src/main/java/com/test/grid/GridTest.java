package com.test.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
 String baseurl="https://www.toolsqa.com/";
	
	URL url = new URL("http://192.168.43.245:4444/wd/hub");
	Thread.sleep(3000);
	//1.Defini desired capability
	DesiredCapabilities cap = new DesiredCapabilities().firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.WIN10);
	cap.setVersion("10.0");
	WebDriver driver = new RemoteWebDriver(url,cap);
	driver.get(baseurl);
	String title = driver.getTitle();
	Thread.sleep(3000);
	System.out.println("Title of page >> " + title);
}
}

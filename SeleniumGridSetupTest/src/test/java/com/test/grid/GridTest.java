package com.test.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		
		FirefoxOptions options = new FirefoxOptions();//above 3.6v we have to use options class
		String huburl = "http://192.168.43.245:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(huburl),options);
		
		driver.get("https://www.guru99.com/");
		
		System.out.println(driver.getTitle());
	}
}

//cap.setBrowserName("chrome");
//ChromeOptions options = new ChromeOptions();
		
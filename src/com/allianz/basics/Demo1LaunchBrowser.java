package com.allianz.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}

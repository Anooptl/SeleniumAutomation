package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
	String Actualtitle=	driver.getTitle();
	System.out.println(Actualtitle);
	String ExpectedTitle = ("Facebook – log in or sign up");
	
	driver.findElement(By.id("email")).sendKeys("anoopop");
	driver.findElement(By.id("pass")).sendKeys("lalala");
	driver.findElement(By.name("login")).click();

	}

}

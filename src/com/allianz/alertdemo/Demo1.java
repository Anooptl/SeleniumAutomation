package com.allianz.alertdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		driver.findElement(By.xpath("//img[@src='gif/go.gif']")).click();
		String ActualText = driver.switchTo().alert().getText();
		System.out.println(ActualText);
		driver.switchTo().alert().accept();
	}

}

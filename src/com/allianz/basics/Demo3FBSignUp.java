package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.name("firstname")).sendKeys("Anoop");
driver.findElement(By.name("lastname")).sendKeys("Thulaseedharan");
driver.findElement(By.name("reg_email__")).sendKeys("abcd.an@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd.an@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("test123");

//driver.findElement(By.xpath("//input[@value='2']")).click();

Select selectDay= new Select(driver.findElement(By.id("day")));
selectDay.selectByVisibleText("14");

Select selectMonth= new Select(driver.findElement(By.id("month")));
selectMonth.selectByIndex(3);

Select selectYear=new Select(driver.findElement(By.id("year")));
selectYear.selectByVisibleText("1970");

	}

}

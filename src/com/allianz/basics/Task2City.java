package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2City {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		driver.findElement(By.xpath("//a[@class='sbSelector']")).click();
		driver.findElement(By.partialLinkText("Credit Card")).click();
		driver.findElement(By.name("citiCard1")).sendKeys("4545");
		driver.findElement(By.name("citiCard2")).sendKeys("5656");
		driver.findElement(By.name("citiCard3")).sendKeys("8887");
		driver.findElement(By.name("citiCard4")).sendKeys("9998");
		driver.findElement(By.name("CCVNO")).sendKeys("334");
		driver.findElement(By.id("bill-date-long")).click();
		Select selectYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
		selectYear.selectByVisibleText("2022");
		Select selectMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
		selectMonth.selectByVisibleText("Apr");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[5]/a")).click();
		
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='PROCEED']"));
		WebElement e = driver.findElement(By.className("ui-dialog-content ui-widget-content"));
		System.out.println(e.getText());
		
		
		
		
		
		//driver.findElement(By.xpath(""))
		
		

	}

}

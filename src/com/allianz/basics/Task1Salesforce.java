package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Salesforce {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select selectJob =new Select(driver.findElement(By.name("UserTitle")));
		selectJob.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		
		Select selectEmployees =new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmployees.selectByVisibleText("201 - 500 employees");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		
		Select selectCountry =new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		
		
		
		
		
		
		driver.findElement(By.name("start my free trial")).click();	
		
		

	}

}

package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
public void projectName() {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmipathy\\eclipse-workspace\\EmployeeInformation\\ChromeDriver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
WebElement click1 = driver.findElement(By.id("pass"));

click1.sendKeys("iphone");

click1.click();

click1.getText();
}
}

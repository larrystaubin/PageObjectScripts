package com.larrystaubin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WordpressAdminLoginPage {
	
	WebDriver driver;
	WebElement email;
	WebElement password;
	WebElement submit;
	
	public WordpressAdminLoginPage(WebDriver driver){
		this.driver = driver;
		
		driver.get("https://larrystaubin.wordpress.com/wp-admin/edit.php");
		email = driver.findElement(By.id("user_login"));
		password = driver.findElement(By.id("user_pass"));
		submit = driver.findElement(By.id("wp-submit"));
	}

		public void login(){
			email.sendKeys("larry.staubin@gmail.com");
			password.sendKeys("Passw0rd");
			submit.click();
			
		}
}

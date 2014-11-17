package com.larrystaubin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressTestAddNewPost {
	public static void main (String...args){
		
		WebDriver driver = new FirefoxDriver();
		
		//Login to Admin portal
		WordpressAdminLoginPage admLoginPage = new WordpressAdminLoginPage(driver);
		admLoginPage.login();

		
		//Go to New Posts page
		driver.get("https://larrystaubin.wordpress.com/wp-admin/edit.php");
		WebElement addNewPost = driver.findElement(By.linkText("Add New"));
		addNewPost.click();
		
		//Add New Post
		driver.switchTo().frame("content_ifr");
		WebElement postBody = driver.findElement(By.id("tinymce"));
		postBody.sendKeys("This, in part, was what Griswell had dreamed.");
		
		driver.switchTo().defaultContent();
		
		WebElement title = driver.findElement(By.id("title"));
		title.click();
		title.sendKeys("Blog Post 8");
		
		//Publish the post
		WebElement publish = driver.findElement(By.id("publish"));
		publish.click();
		
		//Close Browser
		driver.close();
		
		
	}

}

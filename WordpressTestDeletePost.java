package com.larrystaubin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressTestDeletePost {
	public static void main(String...args){
		
		WebDriver driver = new FirefoxDriver();

		//Login to Admin portal
		WordpressAdminLoginPage admLoginPage = new WordpressAdminLoginPage(driver);
		admLoginPage.login();
				
		//Go to AllPosts page
		
		driver.get("https://larrystaubin.wordpress.com/wp-admin/edit.php");
		
		//Click on the post to be deleted
		
		WebElement post = driver.findElement(By.linkText("Blog Post 7"));
		post.click();
		
		//Delete Post
		
		WebElement publish = driver.findElement(By.linkText("Move to Trash"));
		publish.click();
		
		//Close Browser
		driver.close();
				
	}

}

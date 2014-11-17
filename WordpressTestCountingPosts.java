package com.larrystaubin.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressTestCountingPosts {
	
public static void main(String...args){
		
		WebDriver driver = new FirefoxDriver();

		//Login to Admin portal
		WordpressAdminLoginPage admLoginPage = new WordpressAdminLoginPage(driver);
		admLoginPage.login();

		
		//Count the number of posts
		
		driver.get("https://larrystaubin.wordpress.com/wp-admin/edit.php");	
		WebElement postsContainer = driver.findElement(By.id("the-list"));
		List postsList = postsContainer.findElements(By.tagName("tr"));
        System.out.println(postsList.size()); 
		
        //Close Browser
        driver.close();
		
	}

}

package com.LeranTools.GmailLinkChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLink {
	@Test
	public void linkTest()

	{
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail"));
		System.out.println("Link is open");
		driver.close();

	}

}

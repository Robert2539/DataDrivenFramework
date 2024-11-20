package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("Inside Login Test");
		click("bmlBtn_CSS");

		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed");
		// log.info("This is information log");
		//log.fail("this failed log");..............333333333333333333333.........................
		
		
		//Assert.fail("Login not successful");
		
		
		
	
	
	}
	
}

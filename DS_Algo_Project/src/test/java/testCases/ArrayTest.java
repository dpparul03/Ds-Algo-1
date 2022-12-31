package testCases;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.ArrayPage;
import utilities.ReadConfig;

public class ArrayTest extends BaseClass {

	


	@Test(priority=1)
	public void Arrayslogin () throws InterruptedException, IOException {

		ArrayPage arp = new  ArrayPage (driver);
		ReadConfig readconfig = new ReadConfig();
		

		
		arp.signInBtn();
		
		arp.getUsername(username);
		 logger.info("Entered username" );
		arp.getPassword(password);
		 logger.info("Entered password" );
		arp.LoginBtn();
		
		arp.ArGetStartedBtn();
		
	if (username.equals("Parul"))
{
		Assert.assertTrue(true);
		logger.info("VerifyLogin-Passed");
	}
	else
	logger.info("VerifyLogin-Failed");
	captureScreenShot(driver, "ArrayTest");
	Assert.assertTrue(false);
	
	}

	@Test(priority=2)	
	public void ArraysPython () throws InterruptedException {	
		Actions act = new Actions (driver);
		ArrayPage arp = new  ArrayPage (driver);

		arp.ClickArraysPython();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		
		arp.ClickArraysTryHere();
		
		act.sendKeys("print('Hello word')").perform();
		 logger.info("Message sent succesfully" );
		Thread.sleep(500);
		arp.ClickArraysRunBtn();
		
		driver.navigate().back();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2000)");
		
	}


	@Test(priority=3)	
	public void ArraysList () throws InterruptedException {	
		Actions act = new Actions (driver);
		ArrayPage arp = new  ArrayPage (driver);

		arp.ClickArraysTryList();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		
		arp.ClickArraysTryHere();
		
		act.sendKeys("print('Hello word')").perform();
		logger.info("Message sent succesfully" );
		
		arp.ClickArraysRunBtn();
		
		driver.navigate().back();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2000)");	
		

	}

	@Test(priority=4)	
	public void BasicOperation () throws InterruptedException {	
		Actions act = new Actions (driver);
		ArrayPage arp = new  ArrayPage (driver);

		arp.ClickBasicOperationList();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		
		arp.ClickArraysTryHere();
		
		act.sendKeys("print('Hello word')").perform();
		
		arp.ClickArraysRunBtn();
		
		driver.navigate().back();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2000)");	
		
	}
		@Test(priority=5)	
		public void ApplicationOfArrays () throws InterruptedException {	
			Actions act = new Actions (driver);
			ArrayPage arp = new  ArrayPage (driver);

           arp.ClickArraysApplication();
           
           arp.ClickArraysTryHere();
           
   		  act.sendKeys("print('Hello word')").perform();
   		logger.info("Message sent succesfully" );
   		
		arp.ClickArraysRunBtn();
		
		driver.navigate().back();
		
		}
	

		@Test(priority=6)	
		public void PracticeQuestion () throws InterruptedException {	
			Actions act = new Actions (driver);
			ArrayPage arp = new  ArrayPage (driver);
			

			
		arp.ClickPracticeQuestion();
		arp.ClickSearchArrays();
		
	act	.keyDown(Keys.CONTROL);
	 act .sendKeys("a");
	 act.keyUp(Keys.CONTROL);
	act.sendKeys(Keys.BACK_SPACE);
	 
		act.sendKeys("print('Hello word')").perform();
		
		arp.ClickArraysRunBtn();
		
		arp.ClickSubmitBtn();
		driver.navigate().back();
		
		}
	

	@Test(priority=7)	
		public void MaxConsecutive  () throws InterruptedException {	
			Actions act = new Actions (driver);
			ArrayPage arp = new  ArrayPage (driver);
				
		arp.ClickMaxConsecutive();
		
		act	.keyDown(Keys.CONTROL);
		 act .sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.BACK_SPACE);
		 
		act.sendKeys("print('Hello word')").perform();
		
		arp.ClickArraysRunBtn();
		arp.ClickSubmitBtn();
		driver.navigate().back();
		
			
		}
		

		@Test(priority=8)	
		public void FindNumber () throws InterruptedException {	
			Actions act = new Actions (driver);
			ArrayPage arp = new  ArrayPage (driver);
		
		arp.ClickFindNumber();
		
		act	.keyDown(Keys.CONTROL);
		 act .sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.BACK_SPACE);
		act.sendKeys("print('Hello word')").perform();
		
		arp.ClickArraysRunBtn();
		arp.ClickSubmitBtn();
		driver.navigate().back();
		
		}

		@Test(priority=9)	
		public void ShortedArrays () throws InterruptedException {	
			Actions act = new Actions (driver);
			ArrayPage arp = new  ArrayPage (driver);
			
			
		arp.ClickShortedArrays();
		
		act	.keyDown(Keys.CONTROL);
		 act .sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.BACK_SPACE);
	act.sendKeys("print('Hello word')").perform();
		
		arp.ClickArraysRunBtn();
		arp.ClickSubmitBtn();
		driver.navigate().back();
	
		
		arp.ClickSignOut();
		
		
		
		
		}	
		
		
		
		
}
package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.LinkedListPage;
import utilities.ReadConfig;

public class LinkedListTest extends BaseClass{
	
	@Test(priority=0)
	public void LinledSignIn () throws InterruptedException {
	
		LinkedListPage lnkPage = new LinkedListPage(driver);
		ReadConfig readconfig=new ReadConfig();
		
		
		 lnkPage.signInBtn();
		
		 lnkPage.getUsername(username);
		
		 lnkPage.getPassword(password);
		
		 lnkPage.LoginBtn();
		
		 lnkPage.LinkedListGetStartedBtn();
	
	}
	@Test(priority=1)
	public void introductionLinkListed () throws InterruptedException {
		
		Actions act = new Actions (driver);
		LinkedListPage lnkPage = new LinkedListPage(driver);
		
		lnkPage.CliCkLinkIntroduction();
		
		lnkPage.ClickLinkTryHere();
	   
		act.sendKeys("print('Hello word')").perform();
		
	   lnkPage.ClickRunBtn();
	   
	   driver.navigate().back();
	}
	

	@Test(priority=2)
	public void CreatedLinkedListedPage () throws InterruptedException {
		Actions act = new Actions (driver);
		
		LinkedListPage lnkPage = new LinkedListPage (driver);
		
		lnkPage.ClickCreatedLinkList();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		 
		lnkPage.ClickLinkTryHere();
	    
		act.sendKeys("print('Hello word')").perform();
		
	   lnkPage.ClickRunBtn();
	   driver.navigate().back();
	  
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
		
	}
	
	@Test(priority=3)
	public void TypeOfLinkedListedPage () throws InterruptedException {
	
		Actions act = new Actions (driver);
		LinkedListPage lnkPage = new LinkedListPage (driver);
		
		lnkPage.ClickTypeLinkListed();
		
		lnkPage.ClickLinkTryHere();
	    
		act.sendKeys("print('Hello word')").perform();
		
	   lnkPage.ClickRunBtn();
	  
	   driver.navigate().back();
		
	}
		

	@Test(priority=4)
	public void ImplementLinkedListedPython () throws InterruptedException {
	
		Actions act = new Actions (driver);
		LinkedListPage lnkPage = new LinkedListPage (driver);
			
		lnkPage.ClickImplementLinkPython();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
		 
		lnkPage.ClickLinkTryHere();
	    
		act.sendKeys("print('Hello word')").perform();
		
	   lnkPage.ClickRunBtn();
	   driver.navigate().back();
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		
	}

		@Test(priority=5)
		public void TraversalLinkedListedPython () throws InterruptedException {
		
			Actions act = new Actions (driver);
			LinkedListPage lnkPage = new LinkedListPage (driver);
		
			lnkPage.ClickTraversalLinkListed();
			
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
			
			lnkPage.ClickLinkTryHere();
		   
			act.sendKeys("print('Hello word')").perform();
			
		   lnkPage.ClickRunBtn();
		  
		   driver.navigate().back();
		  
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
			
		}
		

			@Test(priority=6)
			public void InsertaionLinkedListedPython () throws InterruptedException {
			
				Actions act = new Actions (driver);
				LinkedListPage lnkPage = new LinkedListPage (driver);
			
				lnkPage.ClickInsertionLinkListed();
				
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");
				
				lnkPage.ClickLinkTryHere();
			   
				act.sendKeys("print('Hello word')").perform();
				
			   lnkPage.ClickRunBtn();
			  
			   driver.navigate().back();
			  
			   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-3000)");
				
			}
			

			@Test(priority=7)
			public void DeletionLinkedListedPython () throws InterruptedException {
			
				Actions act = new Actions (driver);
				LinkedListPage lnkPage = new LinkedListPage (driver);
		
				lnkPage.ClickDeletionLinkList();
				
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2500)");
				 
				lnkPage.ClickLinkTryHere();
			    
				act.sendKeys("print('Hello word')").perform();
				
			   lnkPage.ClickRunBtn();
			  
			   driver.navigate().back();
			   
			   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2500)");
			   
			}
			

			@Test(priority=8)
			public void PracticeQuastionLinkedListedPython () throws InterruptedException {
			
				
				LinkedListPage lnkPage = new LinkedListPage (driver);
		
				lnkPage.ClickPracticeQuestionsLinkList();
				
				
				
				lnkPage.ClickNumpyNinja();
				
		
		
		
		
		
}
}
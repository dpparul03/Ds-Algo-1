package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.QueuePage;


public class QueueTest extends BaseClass{
	

	@Test(priority=1)
	public void QueueInPython () throws InterruptedException {
	
		QueuePage que = new QueuePage(driver);
		Actions act=new Actions(driver);
		
    que.clickHomeGetStartedPage();
    Thread.sleep(500);
	
	que.ClickQueueGetStartedBtn();
	que.ClickQueueInPython();
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)");
	que.ClickQueueTryHere();
	que.ClickPresentationTextBox();
	act.sendKeys("print('Hello word')").perform();
	que.ClickQueueRunBtn();
	driver.navigate().back();
	
	}
	

	@Test(priority=2)
	public void QueueCollection () throws InterruptedException {
	
		QueuePage que = new QueuePage(driver);
		Actions act=new Actions(driver);
	
	
	que.ClickQueueCollection();
	que.ClickQueueTryHere();
	que.ClickPresentationTextBox();
	act.sendKeys("print('Hello word')").perform();
	que.ClickQueueRunBtn();
	driver.navigate().back();
	
	}
	

	@Test(priority=3)
	public void  QueueImplementation () throws InterruptedException {
	
		QueuePage que = new QueuePage(driver);
		Actions act=new Actions(driver);
	
	
	que.ClickQueueImplementation();
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)");
	que.ClickQueueTryHere();
	que.ClickPresentationTextBox();
	act.sendKeys("print('Hello word')").perform();
	que.ClickQueueRunBtn();
	driver.navigate().back();
	
	}
	

	@Test(priority=3)
	public void QueueOperations() throws InterruptedException {
	
		QueuePage que = new QueuePage(driver);
		Actions act=new Actions(driver);
	
	
	que.ClickQueueOperations();
	que.ClickQueueTryHere();
	que.ClickPresentationTextBox();
	act.sendKeys("print('Hello word')").perform();
	que.ClickQueueRunBtn();
	driver.navigate().back();
	
	}
	

	@Test(priority=3)
	public void QueuePracticeQuestions() throws InterruptedException {
	
	QueuePage que = new QueuePage(driver);
		
	
	 que.ClickQueuePracticeQuestions();
	 que.ClickNumpyNinja();
	
	
	
	
	
	
	
	}	
}
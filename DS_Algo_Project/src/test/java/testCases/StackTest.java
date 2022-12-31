package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.StackPage;

public class StackTest extends BaseClass {
	
	
	@Test(priority=1)
	public  void StackOperations () throws InterruptedException {
	StackPage stp = new StackPage(driver);
	Actions act=new Actions(driver);
	
	stp.clickGetStartedPage();
	Thread.sleep(500);
	stp.ClickStackGetStartedBtn();
	stp.ClickOperationsStack();
	Thread.sleep(500);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	Thread.sleep(500);
	stp.ClickStackTryHere();
	Thread.sleep(500);
	act.sendKeys("print('Hello word')").perform();
	stp.ClickStackRunBtn();
	driver.navigate().back();
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	
	}
	
	
	@Test(priority=2)
	public  void StackImplementation () throws InterruptedException {
	StackPage stp = new StackPage(driver);
	Actions act=new Actions(driver);
	
	stp.ClickStackImplementation();
	stp.ClickStackTryHere();
	Thread.sleep(500);
	act.sendKeys("print('Hello word')").perform();
	stp.ClickStackRunBtn();
	driver.navigate().back();
	
	}
	
	@Test(priority=2)
	public  void StackApplications () throws InterruptedException {
	StackPage stp = new StackPage(driver);
	Actions act=new Actions(driver);
	
	stp.ClickStackApplications();
	stp.ClickStackTryHere();
	Thread.sleep(500);
	act.sendKeys("print('Hello word')").perform();
	stp.ClickStackRunBtn();
	driver.navigate().back();
	
	}

	@Test(priority=3)
	public  void StackPracticeQuestion () throws InterruptedException {
	StackPage stp = new StackPage(driver);
	
	
	stp.ClickStackPracticeQuestions();
	stp.ClickNumpyNinja();
	
	
	
	}	
	
}

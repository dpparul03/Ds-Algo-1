package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.GraphPage;

public class GraphTest extends BaseClass{
	


	@Test(priority=1)
	public void GraphPage () throws InterruptedException {

		GraphPage grp = new GraphPage (driver);
		Actions act=new Actions(driver);

		grp.clickHomeGetStartedPage();
       grp.clickGraphGetStartbtn();
		grp.clickGraphBtn();
		grp.clickTryHere();
		grp.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		grp.clickRunBtn();
		driver.navigate().back();
	}

	@Test(priority=2)
	public void GraphRepresentations () throws InterruptedException {

		GraphPage grp = new GraphPage (driver);
		Actions act=new Actions(driver);
		
		grp.clickGraphRepresentations();
		grp.clickTryHere();
		grp.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		grp.clickRunBtn();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void Graph () throws InterruptedException {

		GraphPage grp = new GraphPage (driver);

		
		grp.clickGraphQuestion();
        grp.clickSignOut();
}
}
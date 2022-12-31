package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.TreePage;


public class TreeTest extends BaseClass{


	@Test(priority=1)
	public void OverviewTree () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);

		tre.clickHomeGetStartedPage();
        tre.clickTreeGetStartedBtn();
		tre.clickOverviewOfTree();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=2)
	public void Terminology () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);

		tre.clickTerminologies();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}

	@Test(priority=3)
	public void TypesofTree () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickTypesOfTree();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}

	@Test(priority=4)
	public void TreeTraversals () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickTreeTraversals();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=5)
	public void TraversalsIllustration () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickTraversalsIllustration();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=6)
	public void BinaryTree () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickBinaryTrees();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=7)
	public void TypesBinaryTree () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickTypesofBinaryTrees();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=8)
	public void ImplementationinPython () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickImplementationinPython();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}
	@Test(priority=9)
	public void BinaryTreeTraversals () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickBinaryTreeTraversals();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}



	@Test(priority=10)
	public void ImplementationBinaryTrees () throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickImplementationBinaryTrees();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}

	@Test(priority=11)
	public void ApplicationsBinaryTree() throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickApplicationsBinaryTree();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}


	@Test(priority=12)
	public void BinarySearchTrees() throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickBinarySearchTrees();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}

	@Test(priority=13)
	public void ImplementationOfBST() throws InterruptedException {

		TreePage tre = new TreePage (driver);
		Actions act=new Actions(driver);


		tre.clickImplementationOfBST();
		tre.clickTryHere();
		tre.clickPresentationTextBox();
		act.sendKeys("print('Hello word')").perform();
		tre.clickRunBtn();
		driver.navigate().back();

	}

	@Test(priority=14)
	public void PracticeQuestion() throws InterruptedException {

		TreePage tre = new TreePage (driver);

		tre.clickPracticeQuestions();
		tre.ClickNumpyNinja();


	}
}	




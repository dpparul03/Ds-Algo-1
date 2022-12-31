package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {


WebDriver driver;

public TreePage (WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements( driver, this  );
}

@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/a[1]/button[1]") WebElement HomeGetStartbtn;

@FindBy (xpath = " //a[@href='tree']")WebElement TreeGetStartedBtn;
@FindBy (xpath = " //a[normalize-space()='Overview of Trees']")WebElement OverviewOfTree;
@FindBy (xpath = " //a[normalize-space()='Try here>>>']")WebElement TryHere;
@FindBy (xpath = "//pre[@role='presentation']")WebElement PresentationTextBox;
@FindBy (xpath = " //button[normalize-space()='Run']")WebElement RunBtn;
@FindBy (xpath = "//a[normalize-space()='Terminologies']")WebElement Terminologies;
@FindBy (xpath = "//a[normalize-space()='Types of Trees']")WebElement TypesOfTree;
@FindBy (xpath = " //a[normalize-space()='Tree Traversals']")WebElement TreeTraversals;
@FindBy (xpath = " //a[normalize-space()='Traversals-Illustration']")WebElement TraversalsIllustration;
@FindBy (xpath = " //a[normalize-space()='Binary Trees']")WebElement BinaryTrees;
@FindBy (xpath = " //a[normalize-space()='Types of Binary Trees']")WebElement TypesofBinaryTrees;
@FindBy (xpath = "//a[normalize-space()='Implementation in Python']")WebElement ImplementationinPython;
@FindBy (xpath = " //a[normalize-space()='Binary Tree Traversals']")WebElement BinaryTreeTraversals;
@FindBy (xpath = "//a[normalize-space()='Implementation of Binary Trees']")WebElement ImplementationBinaryTrees;
@FindBy (xpath = " //a[normalize-space()='Applications of Binary trees']")WebElement ApplicationsBinaryTree;
@FindBy (xpath = " //a[normalize-space()='Binary Search Trees']")WebElement BinarySearchTrees;
@FindBy (xpath = " //a[normalize-space()='Implementation Of BST']")WebElement ImplementationOfBST;
@FindBy (xpath = " //a[normalize-space()='Practice Questions']")WebElement PracticeQuestions;
@FindBy(xpath ="//a[normalize-space()='NumpyNinja']")WebElement NumpyNinja ;




public void clickHomeGetStartedPage () {
 	 HomeGetStartbtn.click();
}

public void clickTreeGetStartedBtn () {
	TreeGetStartedBtn.click();
}


public void clickOverviewOfTree () {
	OverviewOfTree.click();
}


public void clickTryHere () {
	TryHere.click();
}


public void clickPresentationTextBox () {
	PresentationTextBox.click();
}


public void clickRunBtn () {
	RunBtn.click();
}


public void clickTerminologies () {
	Terminologies.click();
}


public void clickTypesOfTree () {
	TypesOfTree.click();
}


public void clickTreeTraversals () {
	TreeTraversals.click();
}


public void clickTraversalsIllustration () {
	TraversalsIllustration.click();
}
public void clickBinaryTrees () {
	BinaryTrees.click();
}

public void clickTypesofBinaryTrees () {
	TypesofBinaryTrees.click();
}

public void clickImplementationinPython () {
	ImplementationinPython.click();
}
public void clickBinaryTreeTraversals () {
	BinaryTrees.click();
}
public void clickImplementationBinaryTrees() {
	ImplementationBinaryTrees.click();
}
public void clickApplicationsBinaryTree () {
	 ApplicationsBinaryTree.click();
}
public void clickBinarySearchTrees () {
	BinarySearchTrees.click();
}

public void clickImplementationOfBST () {
	ImplementationOfBST.click();
}

public void clickPracticeQuestions () {
	PracticeQuestions.click();
}


public void ClickNumpyNinja() {
 NumpyNinja.click();
}
}



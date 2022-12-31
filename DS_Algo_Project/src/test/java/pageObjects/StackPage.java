package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {


	WebDriver driver;

	public StackPage (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements( driver, this  );

	}
@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/a[1]/button[1]") WebElement GetStartbtn; 


	@FindBy (xpath = "//a[@href='stack']")WebElement StackGetStartedBtn;
	@FindBy (xpath = "//a[normalize-space()='Operations in Stack']")WebElement OperationsStack;
	@FindBy (xpath = "//a[normalize-space()='Try here>>>']")WebElement StackTryHere;
	@FindBy (xpath = "//pre[@role='presentation']")WebElement PresentationTextBox;
	@FindBy (xpath = " //button[normalize-space()='Run']")WebElement StackRunBtn;
	@FindBy (xpath = " //a[normalize-space()='Implementation']")WebElement StackImplementation;
	@FindBy (xpath = " //a[normalize-space()='Applications']")WebElement StackApplications;
	@FindBy (xpath = "  //a[normalize-space()='Practice Questions']")WebElement StackPracticeQuestions;
	@FindBy(xpath =" //a[normalize-space()='NumpyNinja']")WebElement NumpyNinja ;

	public void clickGetStartedPage () {
	  	 GetStartbtn.click();
	}
	
	public void ClickStackGetStartedBtn () {
		StackGetStartedBtn.click();
	}
	

	public void ClickOperationsStack () {
		OperationsStack.click();
	}
	

	public void ClickStackTryHere () {
		StackTryHere.click();
	}

	public void ClickPresentationTextBox (String String) {
		PresentationTextBox.sendKeys();
	}
	

	public void ClickStackRunBtn () {
		StackRunBtn.click();
	}
	

	public void ClickStackImplementation () {
		StackImplementation.click();
	}
	

	public void ClickStackApplications () {
		 StackApplications.click();
	}
	

	public void ClickStackPracticeQuestions () {
		StackPracticeQuestions.click();
	}
	
	public void ClickNumpyNinja() {
		NumpyNinja.click();
	
	
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {


	WebDriver driver;

	public QueuePage (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements( driver, this  );
	}
	
	
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/a[1]/button[1]") WebElement HomeGetStartbtn;
	
	@FindBy (xpath = " //a[@href='queue']")WebElement QueueGetStartedBtn;
		@FindBy (xpath = "//a[normalize-space()='Implementation of Queue in Python']")WebElement QueueInPython;
		@FindBy (xpath = " //a[normalize-space()='Try here>>>']")WebElement QueueTryHere;
		@FindBy (xpath = "//pre[@role='presentation']")WebElement PresentationTextBox;
		@FindBy (xpath = " //button[normalize-space()='Run']")WebElement QueueRunBtn;
		@FindBy (xpath = "//a[normalize-space()='Implementation using collections.deque']")WebElement QueueCollection;
		@FindBy (xpath = " //a[normalize-space()='Implementation using array']")WebElement QueueImplementation;
		@FindBy (xpath = "//a[normalize-space()='Queue Operations']")WebElement QueueOperations;
		@FindBy (xpath = " //a[normalize-space()='Practice Questions']")WebElement QueuePracticeQuestions;
		@FindBy(xpath =" //a[normalize-space()='NumpyNinja']")WebElement NumpyNinja ;
		
		
		
		
		

		public void clickHomeGetStartedPage () {
		  	 HomeGetStartbtn.click();
		 }

		public void ClickQueueGetStartedBtn () {
			QueueGetStartedBtn.click();
		
		}
		public void ClickQueueInPython() {
			QueueInPython.click();
	
            }
		
		public void ClickQueueTryHere() {
			QueueTryHere.click();
		
            }
		
		public void ClickPresentationTextBox() {
			PresentationTextBox.click();
		
		}
		
		public void ClickQueueRunBtn() {
			QueueRunBtn.click();
		
		}
		
		public void ClickQueueCollection() {
			QueueCollection.click();
		
		}
		
		public void ClickQueueImplementation() {
			 QueueImplementation.click();
		}
		
		
		
		public void ClickQueueOperations() {
			QueueOperations.click();
		}
		
		

		public void ClickQueuePracticeQuestions() {
			QueuePracticeQuestions.click();
		}

		

            public void ClickNumpyNinja() {
	         NumpyNinja.click();
}
}

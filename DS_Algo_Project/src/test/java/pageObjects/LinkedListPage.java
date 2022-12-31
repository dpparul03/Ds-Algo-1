package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {


	WebDriver driver;

	public LinkedListPage (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements( driver, this  );

	}
	
	
	@FindBy (xpath = "//a[normalize-space()='Sign in'] ")WebElement SignIn;
	@FindBy(id ="id_username")WebElement Username; 
	@FindBy(id ="id_password")WebElement Password;
	@FindBy(xpath ="//input[@value='Login']")WebElement logInBtn;
	@FindBy(xpath =" //a[@href='linked-list']")WebElement LinkedGetStartedBtn;
	@FindBy(xpath ="//a[normalize-space()='Introduction']")WebElement LinkIntro;
	@FindBy (xpath ="//a[normalize-space()='Try here>>>']")WebElement LinkTryHere;
	@FindBy (xpath ="//pre[@role='presentation']")WebElement LinkTextBox;
	@FindBy (xpath ="//button[normalize-space()='Run']")WebElement RunBtn;
	@FindBy (xpath ="//a[normalize-space()='Creating Linked LIst']")WebElement CreatedLinkListed;
	@FindBy (xpath ="//a[normalize-space()='Types of Linked List']")WebElement TypeLinkListed;
	@FindBy (xpath ="//a[normalize-space()='Implement Linked List in Python']")WebElement ImplementLinkPython;
	@FindBy (xpath ="//a[normalize-space()='Traversal']")WebElement TraversalLinkListed;
	@FindBy (xpath ="//a[normalize-space()='Insertion']")WebElement InsertionLinkListed;
	@FindBy (xpath ="//a[normalize-space()='Deletion']")WebElement DeletionLinkList;
	@FindBy (xpath ="//a[normalize-space()='Practice Questions']")WebElement PracticeQuestionsLinkList;
	@FindBy(xpath =" //a[normalize-space()='NumpyNinja']")WebElement NumpyNinja ;
	
	
	
	public void signInBtn() {
		SignIn.click();
	}
	public void getUsername(String uname) {
		Username.clear();
		Username.sendKeys(uname);
	}

	public void getPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}

	public void LoginBtn() {
		logInBtn.click();
	}
	
	
	public void LinkedListGetStartedBtn() {
		LinkedGetStartedBtn.click();
			
	}
	
	public void CliCkLinkIntroduction() {
		LinkIntro.click();
	}
	public void ClickLinkTryHere() {
		LinkTryHere.click();
	}
	public void ClickLinkTextBox() {
		LinkTextBox.click();
	}      

	public void ClickRunBtn() {
		RunBtn.click();     

	}
	public void ClickCreatedLinkList() {
		CreatedLinkListed.click();
	}
	
	public void ClickTypeLinkListed() {
		TypeLinkListed.click();
		
      }	
	public void ClickImplementLinkPython() {
		ImplementLinkPython.click();

	}
	public void ClickTraversalLinkListed() {
		 TraversalLinkListed.click();

	}
	
	public void ClickInsertionLinkListed() {
		 InsertionLinkListed.click();

	}
	
	public void ClickDeletionLinkList() {
		DeletionLinkList.click();

	}
	public void ClickPracticeQuestionsLinkList() {
		PracticeQuestionsLinkList.click();

	}
	public void ClickNumpyNinja() {
		NumpyNinja.click();
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


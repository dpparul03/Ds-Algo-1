package pageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	WebDriver driver;

	public ArrayPage (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements( driver, this  );
		
	}
	
	@FindBy (xpath = "//a[normalize-space()='Sign in'] ")WebElement SignIn;
	@FindBy(id ="id_username")WebElement Username; 
	@FindBy(id ="id_password")WebElement Password;
	@FindBy(xpath ="//input[@value='Login']")WebElement logInBtn;
	@FindBy(xpath =" //a[@href='array']")WebElement ArraysGetStartedBtn;
    @FindBy(xpath =" //a[normalize-space()='Arrays in Python']")WebElement ArraysPython;
	@FindBy(xpath ="//a[normalize-space()='Try here>>>']")WebElement ArraysTryHere;
	@FindBy(xpath ="//pre[@role='presentation']")WebElement ArraysTextBox;
	@FindBy(xpath ="//button[normalize-space()='Run']")WebElement ArraysRunBtn;
	@FindBy(xpath ="//a[normalize-space()='Arrays Using List']")WebElement ArraysTryList;
	@FindBy(xpath ="//a[normalize-space()='Basic Operations in Lists']")WebElement BasicOperationList;
	@FindBy(xpath ="//a[normalize-space()='Applications of Array']")WebElement ArraysApplication;
	@FindBy(xpath =" //a[normalize-space()='Practice Questions']")WebElement PracticeQuestion;
	@FindBy(xpath =" //a[normalize-space()='Search the array']")WebElement SearchArrays;
    @FindBy(xpath ="//input[@value='Submit']")WebElement SubmitBtn;
    @FindBy(xpath =" //a[normalize-space()='Max Consecutive Ones']")WebElement MaxConsecutive ;
    @FindBy(xpath ="//a[normalize-space()='Find Numbers with Even Number of Digits']")WebElement FindNumber ;
    @FindBy(xpath =" //a[contains(text(),'Squares of')]")WebElement ShortedArrays ;
    @FindBy(xpath ="  //a[normalize-space()='Sign out']")WebElement SignOut;
    
    
  
   
    
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
	public void ArGetStartedBtn() {
		ArraysGetStartedBtn.click();
	}

	public void ClickArraysPython() {
		ArraysPython.click();
	}

	public void ClickArraysTryHere() {
		ArraysTryHere.click();
	}
	
	public void TypeArraysTextBox(String  String ){
	
		ArraysTextBox.sendKeys();
		
	}

	public void ClickArraysRunBtn() {
		ArraysRunBtn.click();

	}

	public void ClickArraysTryList() {
		ArraysTryList.click();

	}

	public void ClickBasicOperationList() {
		BasicOperationList.click();
	}	

	public void ClickArraysApplication() {
		ArraysApplication.click();

	}
	
	public void ClickPracticeQuestion() {
		PracticeQuestion.click();
	}	

	public void ClickSearchArrays() {
		SearchArrays.click();
		
	}


	public void ClickSubmitBtn() {
		SubmitBtn.click();
		
	}

	public void ClickMaxConsecutive() {
		MaxConsecutive.click();
	}

	public void ClickFindNumber() {
		FindNumber.click();
	}

	public void ClickShortedArrays() {
		ShortedArrays.click();
	}
		
	 public void ClickSignOut () {
			SignOut.click(); 
					
	 }
}
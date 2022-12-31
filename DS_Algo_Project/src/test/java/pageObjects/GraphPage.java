package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {

	
	WebDriver driver;

public GraphPage (WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements( driver, this  );
}

   @FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/a[1]/button[1]") WebElement HomeGetStartbtn;

   @FindBy(xpath =" //a[@href='graph']") WebElement GraphGetStartbtn;
   @FindBy(xpath ="//a[@class='list-group-item'][normalize-space()='Graph']") WebElement GraphBtn;
   @FindBy (xpath = " //a[normalize-space()='Try here>>>']")WebElement TryHere;
   @FindBy (xpath = "//pre[@role='presentation']")WebElement PresentationTextBox;
   @FindBy (xpath = " //button[normalize-space()='Run']")WebElement RunBtn;
   @FindBy(xpath =" //a[normalize-space()='Graph Representations'] ") WebElement GraphRepresentations;
   @FindBy(xpath ="  //a[normalize-space()='Practice Questions']") WebElement GraphQuestion;
   @FindBy(linkText="Sign out")WebElement SignOutBtn;



public void clickHomeGetStartedPage () {
 	 HomeGetStartbtn.click();
}
public void clickGraphGetStartbtn () {
	GraphGetStartbtn.click();
}
public void clickGraphBtn () {
	GraphBtn.click();
}
public void clickTryHere () {
	TryHere.click();
}
public void clickPresentationTextBox () {
	PresentationTextBox.click();
}
public void clickRunBtn() {
	RunBtn.click();
}
public void clickGraphRepresentations () {
	GraphRepresentations.click();
}
public void clickGraphQuestion () {
	GraphQuestion.click();
}
public void clickSignOut () {
	SignOutBtn.click();
}
}

package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

      public class HomePageTest extends BaseClass {
    	 
    	 
	@Test 
     
    public void homepage() throws InterruptedException, IOException {
    		   			   	
   HomePage hmPage= new HomePage (driver);
   
   
   hmPage.clickGetStartedPage();
   logger.info("clicked on get started btn");
  
    
   hmPage.clickdataStructure ();
   
   hmPage.clickDataGetStartedbtn ();
   
   hmPage.clickSignInPage ();
   
  hmPage.clickRegistrationbtn();
  
 
  
	  
  }
	}
      
	
      
	

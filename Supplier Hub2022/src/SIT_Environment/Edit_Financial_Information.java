package SIT_Environment;



import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.SelectorExternal;

public class Edit_Financial_Information {

	@Test
	public void editFinancialInfo() {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://int-sh-external.testEnvironment.com");

		 //Create object of Dimensions class
	    Dimension d = new Dimension(800,1000);
	    //Resize the current window to the given dimension
	    driver.manage().window().setSize(d);
	 	
	 	 
	 	// explicit wait - to wait for the Next button to be click-able
	 	WebDriverWait wait = new WebDriverWait(driver, 8);
	 	wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SignIn));
	 	//driver.manage().window().maximize();
	 			//type email 
	 			driver.findElement(SelectorExternal.username).sendKeys("qualitynow2022+sit+570@emailtest.com");
	 			driver.findElement(SelectorExternal.passwrord).sendKeys("Netsecured02!"); 	
	 			driver.findElement(SelectorExternal.SignIn).click();
	 			
	 			
	 			
//	 			  What is the full registered name of the factory?
	 			 		   // create instance of Random class
	 					        Random rand = new Random();
	 					  
	 					        
	 					     
	 													
	 					    // edit Contact Information for Account/ Buying	
	 							driver.manage().window().maximize();
	 				 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.financialInfoEdit));
	 				 			driver.findElement(SelectorExternal.financialInfoEdit).click();
	 				 			
	 				 			 
	 		    				 //eDIT Financial iNFORMATION
	 		    	
	 				 		// Generate random integers in range 0 to 999
	 					        int rand_int9 = rand.nextInt(1000);
	 		    			 			 					
	 							 driver.findElement(SelectorExternal.registration_number).sendKeys("23235"+rand_int9);
	 							driver.findElement(SelectorExternal.vat_number).sendKeys("23434"+rand_int9);
	 							driver.findElement(SelectorExternal.bank_name).sendKeys("Transilvania");
	 							driver.findElement(SelectorExternal.branch_address_line_1).sendKeys("Independence");
	 							driver.findElement(SelectorExternal.branch_address_line_2).sendKeys("Lotus"+rand_int9);
	 							driver.findElement(SelectorExternal.branch_address_city).sendKeys("Porta Ventura");
	 							driver.findElement(SelectorExternal.branch_address_county).sendKeys("NR34");
	 							driver.findElement(SelectorExternal.branch_address_country).click();
	 							driver.findElement(SelectorExternal.branch_address_country4).click();
	 							
	 							driver.findElement(SelectorExternal.branch_address_postcode).sendKeys("23456652");
	 							
	 					
	 							
	 							int rand_int41 = rand.nextInt(1000000000);
	 							driver.findElement(SelectorExternal.bic_swift_code).sendKeys(rand_int41+"12");
	 							
	 							int rand_int32 = rand.nextInt(10);
	 							driver.findElement(SelectorExternal.bank_account_number).sendKeys("2721224"+rand_int32);
	 							
	 							driver.findElement(SelectorExternal.beneficiary_name).sendKeys("Beneficiary");
	 							
	 							driver.findElement(SelectorExternal.saveFinancial).click();
	 							
	 							//Edit SHIPMENT and IMPORT iNFORMATION
	 		    				 
	 							wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.editShipment));
	 		    				driver.findElement(SelectorExternal.editShipment).click();
	 		    				driver.findElement(SelectorExternal.onlyUK).click();
	 		    				driver.findElement(SelectorExternal.saveShipment).click();
	 							
	}

}

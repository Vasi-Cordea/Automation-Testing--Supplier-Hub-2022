package UAT_Environment;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.Selectors;

public class Invitation_approvalx2_UAT {
	 WebDriver driver;

	 @Test

	 public  void invitatieUAT()  throws InterruptedException {
	 	 
	 	System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://uat-supplier-portal.boohoo.com");

	 	 //Create object of Dimensions class
	    Dimension d = new Dimension(800,1000);
	    //Resize the current window to the given dimension
	    driver.manage().window().setSize(d);
	 	 
	 	// explicit wait - to wait for the Next button to be click-able
	 	WebDriverWait wait = new WebDriverWait(driver, 10);
	 	
	 	wait.until(ExpectedConditions.elementToBeClickable(Selectors.BoohooGroup));
			driver.findElement(Selectors.BoohooGroup).click();
			
			driver.manage().window().maximize();
			
	 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

	 			//type email 
	 			driver.findElement(By.id("i0116")).sendKeys("InviteApproverUser@boohoo.com");
	 			
	 			driver.findElement(By.id("idSIButton9")).click();
	 			
	 			//wait until Signin button  is displayed
	 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	 			
	 			Thread.sleep(600);
	 					//type password
	 					driver.findElement(By.id("i0118")).sendKeys("Wackymusic30@");
	 					
	 					driver.findElement(By.id("idSIButton9")).click();
	 					
	 					
	 					//wait until 2nd Sign in button  is displayed
	 					wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	 					driver.findElement(By.id("idSIButton9")).click();
	 					
	 					Thread.sleep(1500);
	 					
	 					//wait for Invite A supplier button to be displayed
	 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.InviteAsupplier));
	 					
	 					//click invite a supplier button
	 					driver.findElement(Selectors.InviteAsupplier).click();
	 						 
	 					
	 					//wait for  button to be displayed
	 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.inviterName));
	 					
	 					

	 					//TYPE INVITER NAME
	 					driver.findElement(Selectors.inviterName).sendKeys("Vasi Selenium1");
	 					
	 					
	 					//TYPE INVITER role
	 					driver.findElement(Selectors.InviterRole).sendKeys("QA Manager");
	 					
	 					//click an item brand button
	 					driver.findElement(Selectors.brandItem).click();
	 					
	 					//click an item brand button
	 					driver.findElement(Selectors.department).sendKeys("Sales and Distribution");
	 					
	 					driver.findElement(Selectors.click1).click();
	 					driver.findElement(Selectors.click2).click();
	 					driver.findElement(Selectors.click3).click();

	 				        // create instance of Random class
	 				        Random rand = new Random();
	 				  
	 				        // Generate random integers in range 0 to 999
	 				        int rand_int1 = rand.nextInt(10000);
	 				       
	 				     	//generate random string for Compant Name
	 				       int leftLimit = 97; // letter 'a'
	 				      int rightLimit = 122; // letter 'z'
	 				      int targetStringLength = 4;
	 				      Random random = new Random();
	 				      StringBuilder buffer = new StringBuilder(targetStringLength);
	 				      for (int i = 0; i < targetStringLength; i++) {
	 				          int randomLimitedInt = leftLimit + (int) 
	 				            (random.nextFloat() * (rightLimit - leftLimit + 1));
	 				          buffer.append((char) randomLimitedInt);
	 				      }
	 				      String generatedString = buffer.toString();

	 				      System.out.println(generatedString);
	 					
	 					driver.findElement(Selectors.CompanyName).sendKeys(generatedString+" The North Face") ;
	 					
	 					   
	 					driver.findElement(Selectors.sameNameYes).click();
						//Thread.sleep(2000);
						   
	 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.popUpDuplicateFactory));
							driver.findElement(Selectors.popUpDuplicateFactory).click();

	 										
	 					
	 					
	 					driver.findElement(Selectors.SupllierrTitle).click();
	 					
	 					driver.findElement(Selectors.suppTitle140).click();
	 					
	 					
	 					driver.findElement(Selectors.suppFirstName).sendKeys("Liana"+rand_int1);
	 					
	 				
	 					
	 					driver.findElement(Selectors.suppLastName).sendKeys("Salem"+rand_int1);
	 					
	 					driver.findElement(Selectors.suppDepartment).click();
	 					driver.findElement(Selectors.department4).click();
	 					
	 				
	 					
	 					driver.findElement(Selectors.supplierEmail).sendKeys("qualitynow2022+UAT+"+generatedString+"@gmail.com");
	 					
	 					driver.findElement(Selectors.phoneCountryCode).click();
	 					driver.findElement(Selectors.phoneCountryCode17).click();
	 					
	 					//generate random integer telephone number
	 					int rand_int2 = rand.nextInt(100000000);
	 					
	 					//type random telephone number in text-box
	 					driver.findElement(Selectors.suppPhoneNr).sendKeys("08"+rand_int2);
	 					
	 					driver.findElement(Selectors.directorTitle).click();
	 					
	 					
	 					driver.findElement(Selectors.directorTitle141).click();
	 					
	 					driver.findElement(Selectors.directorFirtName).sendKeys("Andrew");
	 					driver.findElement(Selectors.directorLastName).sendKeys("Musk");
	 					
	 					//generate random Int and type director email
	 					driver.findElement(Selectors.directorEmail).sendKeys("qualitynow2022+UAT+"+generatedString+"@gmail.com");
	 					
	 					driver.findElement(Selectors.otherDepartmentProduced).click();
	 					
	 					driver.findElement(Selectors.businessJustification).sendKeys("Expensive crocodile high-end shoes");
	 					
	 					driver.findElement(Selectors.Karen).click();
	 					driver.findElement(Selectors.Burton).click();
	 					driver.findElement(Selectors.Debenhams).click();
	 					
	 					int rand_int5 = rand.nextInt(10);
	 					driver.findElement(Selectors.paymentTerm).sendKeys("6"+rand_int5);
	 					
	 					//UK shipment terms
						driver.findElement(Selectors.shypmentTerm).click();
						driver.findElement(Selectors.shypmentTermDDP1).click();
						driver.findElement(Selectors.delivery1).click();
						
						driver.findElement(Selectors.delivery2).click();
						driver.findElement(Selectors.delivery3).click();
						
						//US Shipment Terms 
						
						driver.findElement(Selectors.usShypmentTerm).click();
						driver.findElement(Selectors.usShypmentTermDAP).click();
						driver.findElement(Selectors.usShypmentTermDAP3).click();
	 					
	 					driver.findElement(Selectors.invoiceCurency).click();
	 					driver.findElement(Selectors.invoiceCurencyGbp).click();
	 					
	 					driver.findElement(Selectors.Importer).click();
	 					
	 					driver.findElement(Selectors.sendDraftInvite).click();
	 					
	 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.success));
	 					

						//Search and approve invitation					
						 
	 					Thread.sleep(500);
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Filter by status']")));
						 driver.findElement(Selectors.Invitations).click();
						 Thread.sleep(500);
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
						 driver.findElement(Selectors.search_invite).sendKeys(generatedString+" The North Face");
						 driver.findElement(Selectors.search_get).click();
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_Invitet));
						 driver.findElement(Selectors.Review_Invitet).click();
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Invite));
						 driver.findElement(Selectors.Approve_Invite).click();
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Confirm));
						 driver.findElement(Selectors.Approve_Confirm).click();
	
	 			//CREATE/APPROVE SECOND INVITE		

	 					 					Thread.sleep(1500);
	 					 					
	 					 					//wait for Invite A supplier button to be displayed
	 					 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.InviteAsupplier));
	 					 					
	 					 					//click invite a supplier button
	 					 					driver.findElement(Selectors.InviteAsupplier).click();
	 					 					
	 					 						 					 					 					 					
	 					 					//wait for  button to be displayed
	 					 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.brandItem));
	 					 					
	 					 					
	 					 					//TYPE INVITER NAME
	 					 					driver.findElement(Selectors.inviterName).sendKeys("Vasi Selenium2");
	 					 					
	 					 					
	 					 					//TYPE INVITER role
	 					 					driver.findElement(Selectors.InviterRole).sendKeys("Test Manager");
	 					 					
	 					 					//click an item brand button
	 					 					driver.findElement(Selectors.brandItem110).click();
	 					 					
	 					 					//click an item brand button
	 					 					driver.findElement(Selectors.department).sendKeys("sell as expensive as possible");
	 					 					
	 					 					driver.findElement(Selectors.click1).click();
	 					 					driver.findElement(Selectors.click2).click();
	 					 					driver.findElement(Selectors.click3).click();


	 					 				   int rand_int3 = rand.nextInt(10000);
	 					 					driver.findElement(Selectors.CompanyName).sendKeys(rand_int3+" Java Drama") ;
	 					 					
	 					 					   
	 					 										
	 					 					driver.findElement(Selectors.sameNameYes).click();
	 					 					
	 					 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.popUpDuplicateFactory));
	 										driver.findElement(Selectors.popUpDuplicateFactory).click();

	 					 					
	 					 					driver.findElement(Selectors.SupllierrTitle).click();
	 					 					
	 					 					driver.findElement(Selectors.suppTitle140).click();
	 					 					
	 					 					
	 					 					driver.findElement(Selectors.suppFirstName).sendKeys("Liana");
	 					 					
	 					 				
	 					 					
	 					 					driver.findElement(Selectors.suppLastName).sendKeys("Saltpepper");
	 					 					
	 					 					driver.findElement(Selectors.suppDepartment).click();
	 					 					driver.findElement(Selectors.department4).click();
	 					 					
	 					 				
	 					 					
	 					 					driver.findElement(Selectors.supplierEmail).sendKeys("qualitynow2022+UAT+"+rand_int3+"@gmail.com");
	 					 					
	 					 					driver.findElement(Selectors.phoneCountryCode).click();
	 					 					driver.findElement(Selectors.phoneCountryCode17).click();
	 					 					
	 					 					//generate random integer telephone number
	 					 					int rand_int4 = rand.nextInt(100000000);
	 					 					
	 					 					//type random telephone number in text-box
	 					 					driver.findElement(Selectors.suppPhoneNr).sendKeys("08"+rand_int4);
	 					 					
	 					 					driver.findElement(Selectors.directorTitle).click();
	 					 					
	 					 					
	 					 					driver.findElement(Selectors.directorTitle141).click();
	 					 					
	 					 					driver.findElement(Selectors.directorFirtName).sendKeys("Andrew");
	 					 					driver.findElement(Selectors.directorLastName).sendKeys("Director");
	 					 					
	 					 					//generate random Int and type director email
	 					 					driver.findElement(Selectors.directorEmail).sendKeys("qualitynow2022+UAT+"+rand_int3+"@gmail.com");
	 					 					
	 					 					driver.findElement(Selectors.otherDepartmentProduced).click();
	 					 					
	 					 					driver.findElement(Selectors.businessJustification).sendKeys("qualitative and shoes and jackets");
	 					 					
	 					 					driver.findElement(Selectors.Karen).click();
	 					 					driver.findElement(Selectors.Burton).click();
	 					 					driver.findElement(Selectors.Oasis).click();
	 					 					
	 					 					int rand_int9 = rand.nextInt(10);
	 					 					driver.findElement(Selectors.paymentTerm).sendKeys("3"+rand_int9);
	 					 					
	 					 				//UK shypment terms
	 										driver.findElement(Selectors.shypmentTerm).click();
	 										driver.findElement(Selectors.shypmentTermDDP1).click();
	 										driver.findElement(Selectors.delivery1).click();
	 										
	 										driver.findElement(Selectors.delivery2).click();
	 										driver.findElement(Selectors.delivery3).click();
	 										
	 										//US Shipment Terms 
	 										
	 										driver.findElement(Selectors.usShypmentTerm).click();
	 										driver.findElement(Selectors.usShypmentTermDAP).click();
	 										driver.findElement(Selectors.usShypmentTermDAP3).click();
	 					 					
	 					 					driver.findElement(Selectors.invoiceCurency).click();
	 					 					driver.findElement(Selectors.invoiceCurencyEuro).click();
	 					 					
	 					 					driver.findElement(Selectors.Importer).click();
	 					 					
	 					 					driver.findElement(Selectors.sendDraftInvite).click();
	 					 					
	 					 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.success));
	 					 					

	 										//Search and approve invitation					
	 										 
	 					 					Thread.sleep(500);
	 										wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Filter by status']")));
	 										 driver.findElement(Selectors.Invitations).click();
	 										 Thread.sleep(500);
	 										wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
	 										 driver.findElement(Selectors.search_invite).sendKeys(rand_int3+" Java Drama");
	 										 driver.findElement(Selectors.search_get).click();
	 										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_Invitet));
	 										 driver.findElement(Selectors.Review_Invitet).click();
	 										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Invite));
	 										 driver.findElement(Selectors.Approve_Invite).click();
	 										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Confirm));
	 										 driver.findElement(Selectors.Approve_Confirm).click();
	 										 
	 										// pop-up confirmation for the supplier created
	 										JFrame jFrame = new JFrame();
	 								        JOptionPane.showMessageDialog(jFrame,( "Invite/approval for ' " + generatedString +" The North Face ' / ' " +rand_int3+" Java Brava ' in UAT done !"));
	 					
	 }
}


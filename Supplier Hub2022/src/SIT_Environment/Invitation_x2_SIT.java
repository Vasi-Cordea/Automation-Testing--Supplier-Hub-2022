package SIT_Environment;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Helpers.Selectors;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Invitation_x2_SIT {

	// created reference variable for WebDriver
 WebDriver driver;

@Test

 public void invitatieVasi1()  throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	// open chrome browser
	WebDriver driver = new ChromeDriver();

	// navigate to testing page
	driver.get("https://int-supplier-portal.testEnvironment.com");

	 driver.manage().window().maximize();
	 
	// explicit wait - to wait for the Next button to be click-able
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

			//type email 
			driver.findElement(By.id("i0116")).sendKeys("InviteApproverUser@testEnvironment.com");
			
			driver.findElement(By.id("idSIButton9")).click();
			
			//wait until Signin button  is displayed
			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
			
			
					//type password
					driver.findElement(By.id("i0118")).sendKeys("Wackymusic30@");
					Thread.sleep(500);
					driver.findElement(By.id("idSIButton9")).click();
			
					//wait until 2nd Sign in button  is displayed
					wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
					driver.findElement(By.id("idSIButton9")).click();
					
					Thread.sleep(1500);
					//wait for Invite A supplier button to be displayed
					wait.until(ExpectedConditions.elementToBeClickable(Selectors.InviteAsupplier));
					
					//click invite a supplier button
					driver.findElement(Selectors.InviteAsupplier).click();
					
					
					//wait for ERROR message button to be displayed
					//wait.until(ExpectedConditions.elementToBeClickable(Selectors.errorLoad));
					//click invite a supplier button
					//driver.findElement(Selectors.errorLoad).click();
					
					Thread.sleep(300);
					//wait for Invite A supplier button to be displayed
					wait.until(ExpectedConditions.elementToBeClickable(Selectors.brandItem));
					
					

					//TYPE INVITER NAME
					driver.findElement(Selectors.inviterName).sendKeys("Vasi InviteScript");
					
					
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
				       
								
					
					driver.findElement(Selectors.CompanyName).sendKeys(rand_int1 + " Salomon Inc.") ;
					   
											
					driver.findElement(Selectors.sameNameYes).click();
					
					
					wait.until(ExpectedConditions.elementToBeClickable(Selectors.popUpDuplicateFactory));
					driver.findElement(Selectors.popUpDuplicateFactory).click();
					driver.findElement(Selectors.SupllierrTitle).click();
					
					driver.findElement(Selectors.suppTitle140).click();
					
					
					driver.findElement(Selectors.suppFirstName).sendKeys("Michaela");
					driver.findElement(Selectors.suppLastName).sendKeys("Monroe");
					
					driver.findElement(Selectors.suppDepartment).click();
					driver.findElement(Selectors.department4).click();
					
				
					
					driver.findElement(Selectors.supplierEmail).sendKeys("qualitynow2022+SIT+"+rand_int1+"@emailtest.com");
					
					driver.findElement(Selectors.phoneCountryCode).click();
					driver.findElement(Selectors.phoneCountryCode17).click();
					
					//generate random integer telephone number
					int rand_int2 = rand.nextInt(100000000);
					
					//type random telephone number in text-box
					driver.findElement(Selectors.suppPhoneNr).sendKeys("08"+rand_int2);
					
					driver.findElement(Selectors.directorTitle).click();
					
					
					driver.findElement(Selectors.directorTitle141).click();
					
					driver.findElement(Selectors.directorFirtName).sendKeys("Michelle");
					driver.findElement(Selectors.directorLastName).sendKeys("Macron");
					
					//generate random Int and type director email
					driver.findElement(Selectors.directorEmail).sendKeys("qualitynow2022+SIT+"+rand_int1+"@emailtest.com");
					
					driver.findElement(Selectors.otherDepartmentProduced).click();
					
					driver.findElement(Selectors.businessJustification).sendKeys("izmene si pijamale groase, gazul e scump!");
					
					driver.findElement(Selectors.Karen).click();
					driver.findElement(Selectors.Burton).click();
					int rand_int3 = rand.nextInt(10);
					driver.findElement(Selectors.paymentTerm).sendKeys("8"+rand_int3);
					
					driver.findElement(Selectors.shypmentTerm).click();
					driver.findElement(Selectors.shypmentTerm117).click();
					
//					driver.findElement(Selectors.delivery1).click();
					
					//US Shipment Terms 
					
					driver.findElement(Selectors.usShypmentTerm).click();
					driver.findElement(Selectors.shypmentTermDDP1).click();
					driver.findElement(Selectors.delivery1).click();
  					driver.findElement(Selectors.delivery2).click();
  					driver.findElement(Selectors.delivery3).click();
  					
					driver.findElement(Selectors.invoiceCurency).click();
					driver.findElement(Selectors.invoiceCurency171).click();
					
					driver.findElement(Selectors.Importer).click();
					
					driver.findElement(Selectors.sendDraftInvite).click();
					
					Thread.sleep(1000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Filter by status']")));
					 driver.findElement(Selectors.Invitations).click();
					 Thread.sleep(500);
					wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
					 driver.findElement(Selectors.search_invite).sendKeys(rand_int1 + " Salomon Inc.");
					 driver.findElement(Selectors.search_get).click();
					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_Invitet));
					 driver.findElement(Selectors.Review_Invitet).click();
					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Invite));
					 driver.findElement(Selectors.Approve_Invite).click();
					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Confirm));
					 driver.findElement(Selectors.Approve_Confirm).click();
					 

					
			  					
				  					Thread.sleep(2000);
				  					//wait for Invite A supplier button to be displayed
				  					wait.until(ExpectedConditions.elementToBeClickable(Selectors.InviteAsupplier));
				  					
				  					//click invite a supplier button
				  					driver.findElement(Selectors.InviteAsupplier).click();
				  					
				  					
				  					//wait for ERROR message button to be displayed
				  					//wait.until(ExpectedConditions.elementToBeClickable(Selectors.errorLoad));
				  					//click invite a supplier button
				  					//driver.findElement(Selectors.errorLoad).click();
				  					
				  					//wait for Invite A supplier button to be displayed
				  					wait.until(ExpectedConditions.elementToBeClickable(Selectors.brandItem));
				  					
				  					
				  					Thread.sleep(500);
				  					//TYPE INVITER NAME
				  					driver.findElement(Selectors.inviterName).sendKeys("Vasi InviteScript2");
				  					
				  					
				  					//TYPE INVITER role
				  					driver.findElement(Selectors.InviterRole).sendKeys("QA Lead");
				  					
				  					//click an item brand button
				  					driver.findElement(Selectors.brandItem).click();
				  					
				  					//click an item brand button
				  					driver.findElement(Selectors.department).sendKeys("Management");
				  					
				  					driver.findElement(Selectors.click1).click();
				  					driver.findElement(Selectors.click2).click();
				  					driver.findElement(Selectors.click3).click();

//				  				        // create instance of Random class
//				  				        Random rand = new Random();
//				  				  
//				  				        // Generate random integers in range 0 to 999
//				  				        int rand_int1 = rand.nextInt(10000);
				  				       
				  								
				  					int rand_int7 = rand.nextInt(1000);
				  					driver.findElement(Selectors.CompanyName).sendKeys(rand_int7 + " Amazonian Slippers") ;
				  					   
				  											
				  					driver.findElement(Selectors.sameNameYes).click();
				  					
				  				
				  					wait.until(ExpectedConditions.elementToBeClickable((Selectors.popUpDuplicateFactory)));
				  					driver.findElement(Selectors.popUpDuplicateFactory).click();
				  					
				  					driver.findElement(Selectors.SupllierrTitle).click();
				  					
				  					driver.findElement(Selectors.suppTitle140).click();
				  					
				  					
				  					driver.findElement(Selectors.suppFirstName).sendKeys("Giulia");
				  					driver.findElement(Selectors.suppLastName).sendKeys("Santorini");
				  					
				  					driver.findElement(Selectors.suppDepartment).click();
				  					driver.findElement(Selectors.department4).click();
				  					
				  				
				  					
				  					driver.findElement(Selectors.supplierEmail).sendKeys("qualitynow2022+SIT+"+rand_int7+"@emailtest.com");
				  					
				  					driver.findElement(Selectors.phoneCountryCode).click();
				  					driver.findElement(Selectors.phoneCountryCode17).click();
				  					
				  					//generate random integer telephone number
				  					int rand_int5 = rand.nextInt(100000000);
				  					
				  					//type random telephone number in text-box
				  					driver.findElement(Selectors.suppPhoneNr).sendKeys("07"+rand_int5);
				  					
				  					driver.findElement(Selectors.directorTitle).click();
				  					
				  					
				  					driver.findElement(Selectors.directorTitle141).click();
				  					
				  					driver.findElement(Selectors.directorFirtName).sendKeys("Giuseppino");
				  					driver.findElement(Selectors.directorLastName).sendKeys("Manchiuri");
				  					
				  					//generate random Int and type director email
				  					driver.findElement(Selectors.directorEmail).sendKeys("qualitynow2022+SIT+"+rand_int7+"@emailtest.com");
				  					
				  					driver.findElement(Selectors.otherDepartmentProduced).click();
				  					
				  					driver.findElement(Selectors.businessJustification).sendKeys("Funny skinny trousers");
				  					
				  					driver.findElement(Selectors.Karen).click();
				  					driver.findElement(Selectors.Burton).click();
				  					int rand_int6 = rand.nextInt(10);
				  					driver.findElement(Selectors.paymentTerm).sendKeys("9"+rand_int6);
				  					
				  					driver.findElement(Selectors.shypmentTerm).click();
				  					driver.findElement(Selectors.shypmentTermDDP1).click();
				  					
				  					driver.findElement(Selectors.delivery1).click();
				  					driver.findElement(Selectors.delivery2).click();
				  					
				  					//US Shipment Terms 
									
									driver.findElement(Selectors.usShypmentTerm).click();
									driver.findElement(Selectors.usShypmentTermDAP).click();
									driver.findElement(Selectors.usShypmentTermDAP3).click();
				  					
				  					driver.findElement(Selectors.invoiceCurency).click();
				  					driver.findElement(Selectors.invoiceCurency171).click();
				  					
				  					driver.findElement(Selectors.Importer).click();
				  					
				  					driver.findElement(Selectors.sendDraftInvite).click();
				  					
				  					Thread.sleep(1000);
				  					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Filter by status']")));
									 driver.findElement(Selectors.Invitations).click();
									 Thread.sleep(500);
									wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
									 driver.findElement(Selectors.search_invite).sendKeys(rand_int7 + " Amazonian Slippers");
									 driver.findElement(Selectors.search_get).click();
									 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_Invitet));
									 driver.findElement(Selectors.Review_Invitet).click();
									 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Invite));
									 driver.findElement(Selectors.Approve_Invite).click();
									 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Confirm));
									 driver.findElement(Selectors.Approve_Confirm).click();
									 
										Thread.sleep(2000);
										driver.close();
										
										// pop-up confirmation for the supplier created
										//JFrame jFrame = new JFrame();
										JFrame jFrame = new JFrame();

								        JOptionPane.showMessageDialog(jFrame, "Invite/approv for ' " +rand_int1 + " Amazonian Slippers ' and ' "+rand_int1 +" Salomon Inc.'"+" in SIT done!");
}
}



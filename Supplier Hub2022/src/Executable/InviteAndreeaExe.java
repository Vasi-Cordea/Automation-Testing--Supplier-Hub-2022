package Executable;
import java.util.Random;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.Selectors;

public class InviteAndreeaExe {
	
	WebDriver driver;
	

	public static void main (String args[]) throws InterruptedException{
		 
		 
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		// navigate to testing page
		driver.get("https://int-supplier-portal.email.com");

		 driver.manage().window().maximize();
		 
		// explicit wait - to wait for the Next button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

				//type email 
				driver.findElement(By.id("i0116")).sendKeys("InviteApproverUser@emailtest.com");
				
				driver.findElement(By.id("idSIButton9")).click();
				
				//wait until Sign in button  is displayed
				wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));

				Thread.sleep(500);
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
						
						
						//wait for ERROR message button to be displayed
						//wait.until(ExpectedConditions.elementToBeClickable(Selectors.errorLoad));
						//click invite a supplier button
						//driver.findElement(Selectors.errorLoad).click();
						Thread.sleep(1000);
						//wait for Invite A supplier button to be displayed
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.brandItem));
						
						

						//TYPE INVITER NAME
						driver.findElement(Selectors.inviterName).sendKeys("Andreea Sun");
						
						
						//TYPE INVITER role
						driver.findElement(Selectors.InviterRole).sendKeys("QA Specialist");
						
						//click an item brand button
						driver.findElement(Selectors.brandItem).click();
						
						//click an item brand button
						driver.findElement(Selectors.department).sendKeys("Spike Shoes");
						
						driver.findElement(Selectors.click1).click();
						driver.findElement(Selectors.click2).click();
						driver.findElement(Selectors.click3).click();

					        // create instance of Random class
					        Random rand = new Random();
					  
					        // Generate random integers in range 0 to 999
					        int rand_int1 = rand.nextInt(10000);
					       
									
						
						driver.findElement(Selectors.CompanyName).sendKeys(rand_int1 + " Timbaland Hike") ;
						
						driver.findElement(Selectors.sameNameYes).click();
						
						   

//						//wait for pop-up elastic search button to be displayed
//						wait.until(ExpectedConditions.elementToBeClickable(Selectors.popUpDuplicateFactory));
//						
//							driver.findElement(Selectors.popUpDuplicateFactory).click();
			
												
						driver.findElement(Selectors.SupllierrTitle).click();
						
						driver.findElement(Selectors.suppTitle140).click();
						
						 
 				     	//generate random string for Company Name
 				       int leftLimit = 97; // letter 'a'
 				      int rightLimit = 122; // letter 'z'
 				      int targetStringLength = 6;
 				      Random random = new Random();
 				      StringBuilder buffer = new StringBuilder(targetStringLength);
 				      for (int i = 0; i < targetStringLength; i++) {
 				          int randomLimitedInt = leftLimit + (int) 
 				            (random.nextFloat() * (rightLimit - leftLimit + 1));
 				          buffer.append((char) randomLimitedInt);
 				      }
 				      String generatedString = buffer.toString();

						
						driver.findElement(Selectors.suppFirstName).sendKeys(generatedString);
						driver.findElement(Selectors.suppLastName).sendKeys(generatedString);
						
						driver.findElement(Selectors.suppDepartment).click();
						driver.findElement(Selectors.department4).click();
					
				
					
					driver.findElement(Selectors.supplierEmail).sendKeys("contdetest.bh+supplierEmail+"+rand_int1+"@emailtest.com");
					
					driver.findElement(Selectors.phoneCountryCode).click();
					driver.findElement(Selectors.phoneCountryCode17).click();
					
					//generate random integer telephone number
					int rand_int2 = rand.nextInt(100000000);
					
					//type random telephone number in text-box
					driver.findElement(Selectors.suppPhoneNr).sendKeys("07"+rand_int2);
					
					driver.findElement(Selectors.directorTitle).click();
					
					
					driver.findElement(Selectors.directorTitle141).click();
					
					driver.findElement(Selectors.directorFirtName).sendKeys("Lila");
					driver.findElement(Selectors.directorLastName).sendKeys("Kingsman");
					
					//generate random Int and type director email
					driver.findElement(Selectors.directorEmail).sendKeys("contdetest.bh+app.exe+"+rand_int1+"@emailtest.com");
					
					driver.findElement(Selectors.otherDepartmentProduced).click();
					
					driver.findElement(Selectors.businessJustification).sendKeys("expensive and modern socks");
					
					driver.findElement(Selectors.Karen).click();
					driver.findElement(Selectors.Burton).click();
  					
					
					driver.findElement(Selectors.paymentTerm).sendKeys("43");
					
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
					driver.findElement(Selectors.invoiceCurency171).click();
					
					driver.findElement(Selectors.Importer).click();
					
					driver.findElement(Selectors.sendDraftInvite).click();
					
					
//					Thread.sleep(1000);
//					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Filter by status']")));
//					 driver.findElement(Selectors.Invitations).click();
//					 Thread.sleep(500);
//					wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
//					 driver.findElement(Selectors.search_invite).sendKeys(rand_int1 + " Timbaland Hike");
//					 driver.findElement(Selectors.search_get).click();
//					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_Invitet));
//					 driver.findElement(Selectors.Review_Invitet).click();
//					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Invite));
//					 driver.findElement(Selectors.Approve_Invite).click();
//					 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_Confirm));
//					 driver.findElement(Selectors.Approve_Confirm).click();
					 
						Thread.sleep(2000);
					driver.close();


}
}
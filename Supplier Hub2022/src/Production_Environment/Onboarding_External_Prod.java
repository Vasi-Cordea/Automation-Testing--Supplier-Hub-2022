package Production_Environment;


import java.util.Random;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.SelectorExternal;

public class Onboarding_External_Prod {

	@Test
	public void OnboardProd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://hub.emailTest.com");

	 	//Create object of Dimensions class
        Dimension d = new Dimension(720,920);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
	 
	 // explicit wait - to wait for the Next button to be click-able
	 	 	WebDriverWait wait = new WebDriverWait(driver, 8);
	 	 	wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SignIn));

	 	 			//type email 
	 	 			driver.findElement(SelectorExternal.username).sendKeys("qualitynow12345+prod+734@emailTest.com");
	 	 			driver.findElement(SelectorExternal.passwrord).sendKeys("D3O4.375_m"); 			
	 	 			
	 	 			//pause code 10 sec
	 	 			//Thread.sleep(10000);
	 	 			
	 	 			driver.findElement(SelectorExternal.SignIn).click();
	 	 			
//	           Setup new password	 			
	 	 			
	 	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.sendNewpass));
	 	 			driver.findElement(SelectorExternal.newPasswrord).sendKeys("Netsecured02!");
	 	 			 driver.findElement(SelectorExternal.confirmPasswrord).sendKeys("Netsecured02!"); 	
//	 	 			
	  			driver.findElement(SelectorExternal.sendNewpass).click();
	 	 			
	 			driver.manage().window().maximize();
 	 			
//	           Setup Company details	 			
	  			           //wait for external page to load
	 	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.editCompany));
	 	 			driver.findElement(SelectorExternal.editCompany).click();
	 	 				 			
	 	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.country));
	 	
	 	 			driver.findElement(SelectorExternal.addressline1).sendKeys("King James Street"); 
	 	 			driver.findElement(SelectorExternal.addressline2).sendKeys("corner Daniel Kolenda"); 
	 	 			driver.findElement(SelectorExternal.city).sendKeys("Detroit"); 
	 	 			driver.findElement(SelectorExternal.county).sendKeys("New York"); 
	 	 			driver.findElement(SelectorExternal.country).click(); 
	 	 			
	 	 			driver.findElement(SelectorExternal.country109).click(); 
	 	 			driver.findElement(SelectorExternal.postCode).sendKeys("24508"); 
	 	 			
	 	 			driver.findElement(SelectorExternal.officeAdressYes).click();
	 	 			
	 	 			driver.findElement(SelectorExternal.headcount).sendKeys("15"); 
	 	 			driver.findElement(SelectorExternal.female_count).sendKeys("10"); 
	 	 			driver.findElement(SelectorExternal.male_count).sendKeys("5"); 
	 	 			
	 	 			driver.findElement(SelectorExternal.capability).click();
	 	 			
	 	 			driver.findElement(SelectorExternal.factory_count).sendKeys("80"); 
	 	 			driver.findElement(SelectorExternal.min_order_quantityt).sendKeys("90"); 
	 	 			driver.findElement(SelectorExternal.leadtime).sendKeys("34"); 
	 	 			
	 	 			driver.findElement(SelectorExternal.size).click(); 
	 	 			
	 	 			driver.findElement(SelectorExternal.beauty).click();
	 	 			driver.findElement(SelectorExternal.cosmetic).click();
	 	 			driver.findElement(SelectorExternal.saveButton).click();
	 	 				 				 			
	 	 			
//	        Create new factory
	 	 			
	 	 			// wait for landing page to reload
	 	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.editCompany));
	 	 			
	 	 			driver.findElement(SelectorExternal.viewFactory).click();
	 	 			
	 	 			
	 	 		// wait for landing page to reload
	 	 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.addFactory));
	 	 			
	 	 			driver.findElement(SelectorExternal.addFactory).click();
	 	 			
	 	 		// wait for landing page to reload
	 	 			//wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.enterfactoryName));
	 	 			
	 	 			driver.findElement(SelectorExternal.factoryName).sendKeys("aaaa");
	 	 			
	 	 			driver.findElement(SelectorExternal.enterfactoryName).click();
	 	 			driver.findElement(SelectorExternal.addNewFactory).click();
	 	 			
	 	 			
//	          What is the full registered name of the factory?
	 	 		   // create instance of Random class
	 			        Random rand = new Random();
	 			  
	 			        // Generate random integers in range 0 to 999
	 			        int rand_int1 = rand.nextInt(1000);
	 	 			
	 			        
	 	 			driver.findElement(SelectorExternal.registered_factory_name).sendKeys(rand_int1+" Factory Automation");
	 	 			
//	           Who is your main contact for this factory?
	 	 			
	 	 			driver.findElement(SelectorExternal.contact_title).click();
	 	 			driver.findElement(SelectorExternal.contact_title144).click();
	 	 			
	 	 			driver.findElement(SelectorExternal.contact_first_name).sendKeys("FirstName");
	 	 			
	 	 			driver.findElement(SelectorExternal.contact_surname).sendKeys("SurName");
	 	 			
	 	 			driver.findElement(SelectorExternal.contact_email).sendKeys("qualitynow12345+prod+734@emailTest.com");
	 	 			
	 	 			driver.findElement(SelectorExternal.contact_phone_code).click();
	 	 			driver.findElement(SelectorExternal.contact_phone_code34).click();
	 	 			
	 	 			//generate random integer telephone number
	 					int rand_int2 = rand.nextInt(100000000);
	 					
	 					//type random telephone number in text-box
	  					driver.findElement(SelectorExternal.contact_phone_number).sendKeys("07"+rand_int2);
	  					
	  					driver.findElement(SelectorExternal.contact_job_title).sendKeys("Test Lead");
//	              Who is responsible for ethical compliance at this factory?
	  					 
	  					driver.findElement(SelectorExternal.product_compliance_title).click();
	  					driver.findElement(SelectorExternal.product_compliance_title152).click();
	  					
	  					driver.findElement(SelectorExternal.compliance_contact_first_name).sendKeys("Alain");
	  					driver.findElement(SelectorExternal.compliance_contact_surname).sendKeys("Delon");
	  					driver.findElement(SelectorExternal.compliance_contact_email).sendKeys("qualitynow12345+prod+734@emailTest.com");
	  					
	  					driver.findElement(SelectorExternal.compliance_phone_country_code).click();
	  					driver.findElement(SelectorExternal.compliance_phone_country_code109).click();
	  					driver.findElement(SelectorExternal.compliance_phone_number).sendKeys("076"+rand_int2);
	  					
	  					driver.findElement(SelectorExternal.compliance_contact_job_title).sendKeys("The Ethical One");
	  					
//	               Who is responsible for product compliance at this factory?
	  					
	  					driver.findElement(SelectorExternal.product_compliance_contact_title).click();
	  					driver.findElement(SelectorExternal.product_compliance_title3).click();
	  					driver.findElement(SelectorExternal.product_compliance_contact_first_name).sendKeys("ProductBOSS");
	  					driver.findElement(SelectorExternal.product_compliance_contact_surname).sendKeys("BOSSSurname");
	  					
	  					driver.findElement(SelectorExternal.product_compliance_contact_email).sendKeys("qualitynow12345+prod+734@emailTest.com");
	  					
	  					driver.findElement(SelectorExternal.product_compliance_phone_country_code).click();

	  					driver.findElement(SelectorExternal.product_compliance_phone_country_code3).click();
	  					driver.findElement(SelectorExternal.product_compliance_phone).sendKeys("077"+rand_int2);
	  					driver.findElement(SelectorExternal.product_compliance_contact_job_title).sendKeys("Product Manager");
	  					
//	 			 What is the factory address?					
	  					
	  					driver.findElement(SelectorExternal.factory_address_line_1).sendKeys(rand_int1+" address_line");
	  					driver.findElement(SelectorExternal.factory_address_line_2).sendKeys(rand_int1+" address_line2");
	  					driver.findElement(SelectorExternal.factory_city).sendKeys("cityName");
	  					driver.findElement(SelectorExternal.factory_county).sendKeys("countyName");
	  					driver.findElement(SelectorExternal.factory_country).click();
	  					driver.findElement(SelectorExternal.factory_country5).click();
	  					//driver.findElement(SelectorExternal.factory_country6).click();
	  					driver.findElement(SelectorExternal.factory_postcode).sendKeys(rand_int1+" postcode");
	  					driver.findElement(SelectorExternal.factory_head_count).sendKeys("150");
	  					driver.findElement(SelectorExternal.factory_female_count).sendKeys("60");
	  					driver.findElement(SelectorExternal.factory_male_count).sendKeys("90");
	  
//	        Shipping & Import Information
	  					
	 	 			driver.findElement(SelectorExternal.ship_ownership).click();
	  					
	 	 			driver.findElement(SelectorExternal.ship_ownership2).click();
	  					
	 	 			driver.findElement(SelectorExternal.ship_duration_engaged).click();
	 	 			driver.findElement(SelectorExternal.ship_duration_engaged5).click();
	 	 			driver.findElement(SelectorExternal.ship_duration_expected).click();
	 	 			driver.findElement(SelectorExternal.ship_duration_expected5).click();
	 	 			
//	         Capability and Capacity Information
	  					
	 			     					
	    				int rand_int3 = rand.nextInt(100);
	    				driver.findElement(SelectorExternal.z_total_capacity).sendKeys(rand_int3+"16");
	    				int rand_int4 = rand.nextInt(100);
	    				driver.findElement(SelectorExternal.z_testEnvironment_capacity).sendKeys(rand_int4+"4");
	    				int rand_int5 = rand.nextInt(1000);
	    				driver.findElement(SelectorExternal.z_planned_order_capacity).sendKeys(rand_int5+"5");
	    				int rand_int6 = rand.nextInt(10);
	    				driver.findElement(SelectorExternal.z_percentage_business).sendKeys(rand_int6+"6");
	    				int rand_int7 = rand.nextInt(10000);
	    				driver.findElement(SelectorExternal.z_estimated_vol_year_1).sendKeys(rand_int7+"7");
	    				int rand_int8 = rand.nextInt(100000);
	    				driver.findElement(SelectorExternal.z_estimated_vol_year_2).sendKeys(rand_int8+"89");
	    				
	  					
//	 			  // Audit Information 	 
	    			
	    				 
	    				driver.findElement(SelectorExternal.factory_visited_No).click();
	 	 			driver.findElement(SelectorExternal.third_party_social_audit_No).click();
	 	 			driver.findElement(SelectorExternal.corrective_action_plan_No).click();
	 	 			driver.findElement(SelectorExternal.registered_with_higg_No).click();
	    				driver.findElement(SelectorExternal.registered_exporter_No).click();
	 	 			driver.findElement(SelectorExternal.factory_from_pakistan_No).click();
	 	 			driver.findElement(SelectorExternal.factory_from_bangladesh_No).click();

	    				 
//	    				//  Production Information
	    								
	  					
	    				driver.findElement(SelectorExternal.factory_department_products).click();
	     			driver.findElement(SelectorExternal.Save).click();
	  					
	     			Thread.sleep(1500);
	  					//Navigate to Home page
	     			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.YourAppToFinancial));
	     			driver.findElement(SelectorExternal.YourAppToFinancial).click();
	     			
	     	 //eDIT Financial iNFORMATION
	 	
	     			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.financialInfoEdit));
	 		 			driver.findElement(SelectorExternal.financialInfoEdit).click();
	 		 			
	 		 			 
	  				
	  	
	 		 		// Generate random integers in range 0 to 999
	 			        int rand_int9 = rand.nextInt(1000);
	  			 			 					
	 					 driver.findElement(SelectorExternal.registration_number).sendKeys("23235"+rand_int9);
	 					driver.findElement(SelectorExternal.vat_number).sendKeys("23434"+rand_int9);
	 					driver.findElement(SelectorExternal.bank_name).sendKeys("Transilvania");
	 					driver.findElement(SelectorExternal.branch_address_line_1).sendKeys("Independence");
	 					driver.findElement(SelectorExternal.branch_address_line_2).sendKeys("Lotus"+rand_int9);
	 					driver.findElement(SelectorExternal.branch_address_city).sendKeys("Porta Ventura");
	 					driver.findElement(SelectorExternal.branch_address_county).sendKeys("NR"+rand_int9);
	 					driver.findElement(SelectorExternal.branch_address_country).click();
	 					driver.findElement(SelectorExternal.branch_address_country4).click();
	 					
	 					driver.findElement(SelectorExternal.branch_address_postcode).sendKeys("23458652");
	 					
	 			
	 					
	 					int rand_int41 = rand.nextInt(10);
	 					driver.findElement(SelectorExternal.bic_swift_code).sendKeys(rand_int41+"8809296");
	 					
	 					int rand_int32 = rand.nextInt(10);
	 					driver.findElement(SelectorExternal.bank_account_number).sendKeys("2723455"+rand_int32);
	 					
	 					driver.findElement(SelectorExternal.beneficiary_name).sendKeys("Beneficiary");
	 					
	 					driver.findElement(SelectorExternal.saveFinancial).click();
	     
	  					
	 					//Edit SHIPMENT and IMPORT iNFORMATION
	     				 
	 						wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.editShipment));
	 	    				driver.findElement(SelectorExternal.editShipment).click();
	 	    				driver.findElement(SelectorExternal.onlyUK).click();
	 	    				driver.findElement(SelectorExternal.saveShipment).click();
	 	    				
	  // edit 1. Contact Information for Account/ Buying	
	 							
	 				 			wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.EditContacts));
	 				 			driver.findElement(SelectorExternal.EditContacts).click();
	 			 						 												
	 							 driver.findElement(SelectorExternal.title).click();
	 							 driver.findElement(SelectorExternal.titleLord).click();
	 			 					
	 							 driver.findElement(SelectorExternal.first_name).sendKeys("Lewis");
	 							 driver.findElement(SelectorExternal.last_name).sendKeys("Hamilton");
	 							 driver.findElement(SelectorExternal.other_name).sendKeys("Leviston");
	 							 driver.findElement(SelectorExternal.email).sendKeys("qualitynow12345+prod+734@emailTest.com");
	 							 
	 								
	 							 driver.findElement(SelectorExternal.phone_country_code).click();
	 								
	 							 driver.findElement(SelectorExternal.phone_codeCambodgia).click();
	 							 
	 							 
	 							 driver.findElement(SelectorExternal.phone_number).sendKeys("077"+rand_int2);
	 			 					
	 							 driver.findElement(SelectorExternal.SaveContacts).click();
	 			 					
	 						// 2. edit Chairman Information
	 							//Thread.sleep(500);
	 	 				 			//wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.ChairmanButton));
	 	 				 			// driver.findElement(SelectorExternal.ChairmanButton).click();
	 	 							 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.title2));
	 	 							 driver.findElement(SelectorExternal.title2).click();
	 	 							 driver.findElement(SelectorExternal.titleLord2).click();
	 	 			 					
	 	 							 driver.findElement(SelectorExternal.first_name2).sendKeys("Gerard");
	 	 							 driver.findElement(SelectorExternal.last_name2).sendKeys("Thomas");
	 	 							 driver.findElement(SelectorExternal.other_name2).sendKeys("Tommy");
	 	 							 driver.findElement(SelectorExternal.email2).sendKeys("qualitynow12345+prod+734@emailTest.com");
	 	 							 
	 	 								
	 	 							driver.findElement(SelectorExternal.phone_country_code2).click();
	 	 								
	 	 							 driver.findElement(SelectorExternal.phone_codeCambodgia2).click();
	 	 							 
	 	 							 
	 	 							 driver.findElement(SelectorExternal.phone_number2).sendKeys("077"+rand_int2);
	 	 			 					
	 	 							 driver.findElement(SelectorExternal.Savechairman).click();
	 			 					

	 	 							
	 	 							//Thread.sleep(500);
	 	 							// edit Production Information	
	 	 							 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SaveProduction));
	 	 							 driver.findElement(SelectorExternal.NoProduction).click();
	 	 							 driver.findElement(SelectorExternal.SaveProduction).click();
	 	 							
	 	 							//Thread.sleep(500);
	 	 							 //edit Marketing Information
	 	 		    				
	 	 		    				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoMarketing));
	 	 							 driver.findElement(SelectorExternal.NoMarketing).click();
	 	 							 driver.findElement(SelectorExternal.SaveMarketing).click();
	 	 		    				 
	 	 		    				//edit HR Information
	 	 						//	Thread.sleep(500);
	 	 		    				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoHR));
	 	 							 driver.findElement(SelectorExternal.NoHR).click();
	 	 							 driver.findElement(SelectorExternal.SaveHR).click();
	 	 							 
	 	 							//edit Compliance Information
	 	 						//	Thread.sleep(500);
	 	 		    				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoCompl));
	 	 							 driver.findElement(SelectorExternal.NoCompl).click();
	 	 							 driver.findElement(SelectorExternal.SaveCompl).click();
	 	 							 
	 	 		    					//edit Contact Finance Information
	 	 							//Thread.sleep(500);
	 	 							 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.contactFinanceTitle));
	 	 							driver.findElement(SelectorExternal.contactFinanceTitle).click();	 		    				
	 	 		    				driver.findElement(SelectorExternal.contactFinanceTitle8).click();	 		    				
	 	 		    				driver.findElement(SelectorExternal.finance_first_name).sendKeys("George");	 		    				
	 	 		    				driver.findElement(SelectorExternal.finance_last_name).sendKeys("Cazacu");	 		    				
	 	 		    				driver.findElement(SelectorExternal.finance_contact_email).sendKeys("qualitynow12345+prod+734@emailTest.com");	 		    			
	 	 		    				driver.findElement(SelectorExternal.finance_phone_code).click();	 		    				
	 	 		    				driver.findElement(SelectorExternal.finance_phone_code5).click();	 		    				
	 	 		    				driver.findElement(SelectorExternal.finance_phone_number).sendKeys("07448"+rand_int1);	 		    				 
	 	 		    				driver.findElement(SelectorExternal.saveContactFinance).click();
	 	 		    				
	 	 		    				 
	 	 	    					//edit Booking Information
	 	 		    				//Thread.sleep(500);
	  							 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoBooking));
	  							driver.findElement(SelectorExternal.NoBooking).click();	 		    				
	  		    				driver.findElement(SelectorExternal.SaveBooking).click();	 		
	 	 	    			
	 	 	    				
	 	 	    				//edit Contact Finance Information
	  		    				//Thread.sleep(500);
	  							 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.NoTQC));
	  							driver.findElement(SelectorExternal.NoTQC).click();	 		    				
	  		    				driver.findElement(SelectorExternal.SaveTQC).click();
	  						  		
	  		    				//submit application
	  		    				 wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.Submit_Application));
		 							driver.findElement(SelectorExternal.Submit_Application).click();	
	 					
			 					wait.until(ExpectedConditions.invisibilityOfElementLocated(SelectorExternal.Submit_Application));
		 							 System.out.println("Onboarding done, Submit button invisible !");	
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					}
}
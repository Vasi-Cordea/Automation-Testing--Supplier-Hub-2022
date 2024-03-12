package Executable;

import java.util.Random;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.SelectorExternal;

public class addNewFactory_SIT {
	

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://int-sh-external.boohoo.com");

	 	//Create object of Dimensions class
        Dimension d = new Dimension(720,920);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
	 	 
	 	// explicit wait - to wait for the Next button to be click-able
	 	WebDriverWait wait = new WebDriverWait(driver, 8);
	 	wait.until(ExpectedConditions.elementToBeClickable(SelectorExternal.SignIn));

	 			//type email 
	 			driver.findElement(SelectorExternal.username).sendKeys("qualitynow2022+suppemail+sit+447@gmail.com");
	 			driver.findElement(SelectorExternal.passwrord).sendKeys("Netsecured02!"); 			
	 			
	 			driver.findElement(SelectorExternal.SignIn).click();
	 			

	 			
	 			driver.manage().window().maximize();
	 	
	 				 				 			
	 			
//       Create new factory
	 			
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
	 			
	 			
//         What is the full registered name of the factory?
	 		   // create instance of Random class
			        Random rand = new Random();
			  
			        // Generate random integers in range 0 to 999
			        int rand_int1 = rand.nextInt(10000);
	 			
			        
	 			driver.findElement(SelectorExternal.registered_factory_name).sendKeys(rand_int1+" Factory Automation");
	 			
//          Who is your main contact for this factory?
	 			
	 			driver.findElement(SelectorExternal.contact_title).click();
	 			driver.findElement(SelectorExternal.contact_title144).click();
	 			
	 			driver.findElement(SelectorExternal.contact_first_name).sendKeys("FirstName");
	 			
	 			driver.findElement(SelectorExternal.contact_surname).sendKeys("SurName");
	 			
	 			driver.findElement(SelectorExternal.contact_email).sendKeys("qualitynow2022+factoryEmail+uat"+rand_int1+"@gmail.com");
	 			
	 			driver.findElement(SelectorExternal.contact_phone_code).click();
	 			driver.findElement(SelectorExternal.contact_phone_code34).click();
	 			
	 			//generate random integer telephone number
					int rand_int2 = rand.nextInt(100000000);
					
					//type random telephone number in text-box
 					driver.findElement(SelectorExternal.contact_phone_number).sendKeys("07"+rand_int2);
 					
 					driver.findElement(SelectorExternal.contact_job_title).sendKeys("Test Lead");
//             Who is responsible for ethical compliance at this factory?
 					 
 					driver.findElement(SelectorExternal.product_compliance_title).click();
 					driver.findElement(SelectorExternal.product_compliance_title152).click();
 					
 					driver.findElement(SelectorExternal.compliance_contact_first_name).sendKeys("Alain");
 					driver.findElement(SelectorExternal.compliance_contact_surname).sendKeys("Delon");
 					driver.findElement(SelectorExternal.compliance_contact_email).sendKeys("qualitynow2022+factoryEthCompl+uat"+rand_int1+"@gmail.com");
 					
 					driver.findElement(SelectorExternal.compliance_phone_country_code).click();
 					driver.findElement(SelectorExternal.compliance_phone_country_code109).click();
 					driver.findElement(SelectorExternal.compliance_phone_number).sendKeys("076"+rand_int2);
 					
 					driver.findElement(SelectorExternal.compliance_contact_job_title).sendKeys("The Ethical One");
 					
//              Who is responsible for product compliance at this factory?
 					
 					driver.findElement(SelectorExternal.product_compliance_contact_title).click();
 					driver.findElement(SelectorExternal.product_compliance_title3).click();
 					driver.findElement(SelectorExternal.product_compliance_contact_first_name).sendKeys("ProductBOSS");
 					driver.findElement(SelectorExternal.product_compliance_contact_surname).sendKeys("BOSSSurname");
 					
 					driver.findElement(SelectorExternal.product_compliance_contact_email).sendKeys("qualitynow2022+productBoss+uat"+rand_int1+"@gmail.com");
 					
 					driver.findElement(SelectorExternal.product_compliance_phone_country_code).click();

 					driver.findElement(SelectorExternal.product_compliance_phone_country_code3).click();
 					driver.findElement(SelectorExternal.product_compliance_phone).sendKeys("077"+rand_int2);
 					driver.findElement(SelectorExternal.product_compliance_contact_job_title).sendKeys("Product Manager");
 					
//			 What is the factory address?					
 					
 					driver.findElement(SelectorExternal.factory_address_line_1).sendKeys(rand_int1+" address_line");
 					driver.findElement(SelectorExternal.factory_address_line_2).sendKeys(rand_int1+" address_line2");
 					driver.findElement(SelectorExternal.factory_city).sendKeys("cityName");
 					driver.findElement(SelectorExternal.factory_county).sendKeys("countyName");
 					driver.findElement(SelectorExternal.factory_country).click();
 					driver.findElement(SelectorExternal.factory_country4).click();
 					driver.findElement(SelectorExternal.factory_postcode).sendKeys(rand_int1+" postcode");
 					driver.findElement(SelectorExternal.factory_head_count).sendKeys("180");
 					driver.findElement(SelectorExternal.factory_female_count).sendKeys("80");
 					driver.findElement(SelectorExternal.factory_male_count).sendKeys("100");
 
//       Shipping & Import Information
 					
	 			driver.findElement(SelectorExternal.ship_ownership).click();
 					
	 			driver.findElement(SelectorExternal.ship_ownership2).click();
 					
	 			driver.findElement(SelectorExternal.ship_duration_engaged).click();
	 			driver.findElement(SelectorExternal.ship_duration_engaged5).click();
	 			driver.findElement(SelectorExternal.ship_duration_expected).click();
	 			driver.findElement(SelectorExternal.ship_duration_expected5).click();
	 			
//        Capability and Capacity Information
 					
			     					
   				int rand_int3 = rand.nextInt(100);
   				driver.findElement(SelectorExternal.z_total_capacity).sendKeys(rand_int3+"1");
   				int rand_int4 = rand.nextInt(100);
   				driver.findElement(SelectorExternal.z_boohoo_capacity).sendKeys(rand_int4+"4");
   				int rand_int5 = rand.nextInt(1000);
   				driver.findElement(SelectorExternal.z_planned_order_capacity).sendKeys(rand_int5+"5");
   				int rand_int6 = rand.nextInt(10);
   				driver.findElement(SelectorExternal.z_percentage_business).sendKeys(rand_int6+"6");
   				int rand_int7 = rand.nextInt(10000);
   				driver.findElement(SelectorExternal.z_estimated_vol_year_1).sendKeys(rand_int7+"7");
   				int rand_int8 = rand.nextInt(100000);
   				driver.findElement(SelectorExternal.z_estimated_vol_year_2).sendKeys(rand_int8+"8");
   				
 					
//			  // Audit Information 	 
   			
   				 
   				driver.findElement(SelectorExternal.factory_visited_No).click();
	 			driver.findElement(SelectorExternal.third_party_social_audit_No).click();
	 			driver.findElement(SelectorExternal.corrective_action_plan_No).click();
	 			driver.findElement(SelectorExternal.registered_with_higg_No).click();
   				driver.findElement(SelectorExternal.registered_exporter_No).click();
	 			driver.findElement(SelectorExternal.factory_from_pakistan_No).click();
	 			driver.findElement(SelectorExternal.factory_from_bangladesh_No).click();

   				 
//   				//  Production Information
   								
 					
   				driver.findElement(SelectorExternal.factory_department_products).click();
    			driver.findElement(SelectorExternal.Save).click();

}
}
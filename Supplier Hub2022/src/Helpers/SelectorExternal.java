package Helpers;

import org.openqa.selenium.By;

public class SelectorExternal {

	
	
public static By SignIn = By.xpath("//*[@name='signInSubmitButton']");
	
	
    public static By username= By.id("signInFormUsername");
    public static By passwrord= By.id("signInFormPassword");
    
    public static By Home = By.xpath("//*[@href='Home']");
    
    public static By newPasswrord= By.id("new_password");
   
    public static By confirmPasswrord= By.id("confirm_password");
    public static By sendNewpass= By.xpath("//button[@name='reset_password']");
    
   
    
    public static By editCompany= By.xpath("/html/body/div/div/main/div[2]/div/table/tbody/tr[1]/td[2]/div/div[2]/a/span");
    
    public static By addressline1= By.id("address_line_1");
    public static By addressline2= By.id("address_line_2");
    public static By city= By.id("city");
    public static By county= By.id("county");
    public static By country= By.id("country");
    public static By country109= By.id("109");
    public static By postCode= By.id("postcode");
    public static By officeAdressYes= By.id("office_address_same_Yes");
    public static By headcount= By.id("head_count");
    		public static By female_count= By.id("female_count");
    				public static By male_count= By.id("male_count");
    				public static By capability= By.xpath("/html/body/div/div/main/div/form/div/div[17]/fieldset/div/label");
    				
    				public static By factory_count= By.id("factory_count");
    				public static By min_order_quantityt= By.id("min_order_quantity");
    				public static By leadtime= By.id("leadtime");
    				
    				 public static By size = By.xpath("//*[@id=\"production_types\"]/span[1]/span");
    				 
    				 public static By beauty= By.id("not_supplying_beauty_No");
    				 public static By cosmetic= By.id("not_supplying_cosmetics_No");
    				 
    				 public static By saveButton = By.xpath("/html/body/div/div/main/div/form/div/div[25]/button");
    				
    				
 // CREATE NEW FACTORY
    				 public static By viewFactory = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div/table/tbody/tr[2]/td[2]/div/div/a");
    				
    				 public static By addFactory = By.xpath("//span[.='Add new factory']");
    				 
    				 public static By factoryName= By.id("factoryName");
    				 
    				 public static By enterfactoryName = By.xpath("//span[.='Enter factory name']");
    				 
    				 public static By addNewFactory = By.xpath("//span[.='Add new factory']");
    				 
    				 public static By registered_factory_name= By.id("registered_factory_name");
    				 
    				 // Who is your main contact for this factory?
    				 public static By contact_title= By.id("contact_title");
    				 public static By contact_title144= By.id("144");
    				 
    				 public static By contact_first_name= By.id("contact_first_name");
    				 
    				 public static By contact_surname= By.id("contact_surname");
    				 
    				 public static By contact_email= By.id("contact_email");
    				 
    				 public static By contact_phone_code= By.id("contact_phone_country_code");
    				 
    				 public static By contact_phone_code34= By.id("34");
    				 public static By contact_phone_number= By.id("contact_phone_number");
    				 public static By contact_job_title= By.id("contact_job_title");
    				 
    				 //Who is responsible for ethical compliance at this factory?
    				 public static By product_compliance_title= By.id("product_compliance_contact_title");
    				 
    				 public static By product_compliance_title152= By.xpath("/html/body/div/div/main/div/form/div/div[13]/div/div/div/select/option[2]");
    				 
    				 public static By compliance_contact_first_name= By.id("compliance_contact_first_name");
    				 
    				 public static By compliance_contact_surname= By.id("compliance_contact_surname");
    				 public static By compliance_contact_email= By.id("compliance_contact_email");
    				 

    				 public static By compliance_phone_country_code= By.id("compliance_phone_country_code");
    				 public static By compliance_phone_country_code109= By.xpath("/html/body/div/div/main/div/form/div/div[17]/div/div/div[1]/div/div/select/option[6]");
    				 public static By compliance_phone_number= By.id("compliance_phone_number");
    				 
    				
    				 public static By compliance_contact_job_title= By.id("compliance_contact_job_title");
    				 
    				 // Who is responsible for product compliance at this factory?
    				 public static By product_compliance_contact_title= By.id("product_compliance_contact_title");
    				 public static By product_compliance_title3= By.xpath("/html/body/div/div/main/div/form/div/div[20]/div/div/div/select/option[6]");
    				 
    				 public static By product_compliance_contact_first_name= By.id("product_compliance_contact_first_name");
    				 
    				
    				 public static By product_compliance_contact_surname= By.id("product_compliance_contact_surname");
    				 public static By product_compliance_contact_email= By.id("product_compliance_contact_email");
    				 
    				 public static By product_compliance_phone_country_code= By.id("product_compliance_phone_country_code");
    				 
    				 public static By product_compliance_phone_country_code3= By.xpath("/html/body/div/div/main/div/form/div/div[24]/div/div/div[1]/div/div/select/option[3]");
    				 
    				 public static By product_compliance_phone= By.id("product_compliance_phone_number");
    				 public static By product_compliance_contact_job_title= By.id("product_compliance_contact_job_title");
    				 
    				 //What is the factory address?
    				 
    				 public static By factory_address_line_1= By.id("address_line_1");
    				 public static By factory_address_line_2= By.id("address_line_2");
    				 public static By factory_city= By.id("city");
    				 public static By factory_county= By.id("county");
    				 public static By factory_country= By.id("country");
    				 public static By factory_country4= By.xpath("(//select[@name='country']/option)[7]");
    				 public static By factory_country5= By.xpath("(//select[@name='country']/option)[8]");
    				 public static By factory_country6= By.xpath("(//select[@name='country']/option)[9]");
    				 public static By factory_postcode= By.id("postcode");
    				
    				 public static By factory_head_count= By.id("head_count");
    				 public static By factory_female_count= By.id("female_count");
    				 public static By factory_male_count= By.id("male_count");
    				 
    				 
    				 //Shipping & Import Information
    				 
    				 public static By ship_ownership= By.id("ownership");
    				 public static By ship_ownership2 = By.xpath("//option[@name='contracted']");
    				 
    				 public static By ship_duration_engaged= By.id("duration_engaged");
    				 public static By ship_duration_engaged5 = By.xpath("//option[@name='7_months_to_year']");
    				 
    				 public static By ship_duration_expected= By.id("duration_expected");
    				 public static By ship_duration_expected5 = By.xpath("//option[@name='2-season']");
    				 
    				// Capability and Capacity Information
    				 
    				 public static By z_total_capacity= By.id("total_capacity");
    				 public static By z_boohoo_capacity= By.id("boohoo_capacity");
    				 public static By z_planned_order_capacity= By.id("planned_order_capacity");
    				 public static By z_percentage_business= By.id("percentage_business");
    				 public static By z_estimated_vol_year_1= By.id("estimated_vol_year_1");
    				 public static By z_estimated_vol_year_2= By.id("estimated_vol_year_2");
    				 
                    // Audit Information 	 
    				 
    				 public static By factory_visited_No= By.id("factory_visited_No");
    				 public static By third_party_social_audit_No= By.id("third_party_social_audit_No");
    				 public static By corrective_action_plan_No= By.id("corrective_action_plan_No");
    				 public static By registered_with_higg_No= By.id("registered_with_higg_No");
    				 public static By registered_exporter_No= By.id("registered_exporter_No");
    				 public static By factory_from_pakistan_No= By.id("factory_from_pakistan_No");
    				 public static By factory_from_bangladesh_No= By.id("factory_from_bangladesh_No");
    				 
    				//  Production Information
    				 
    				
    				 public static By factory_department_products = By.xpath("//label[@data-testid='factory_department_products[4]']");
    				 
    				 public static By Save = By.xpath("//button[@type='submit']");
    				 
    				 //Navigate to Home page
    				 public static By YourAppToFinancial= By.xpath("//*[text()='YOUR APPLICATION']");
    				 
  // edit Contact Information	 
    				 public static By EditContacts= By.xpath("/html/body/div/div/main/div[2]/div/table/tbody/tr[3]/td[2]/div/div[2]/a/span");
    				 
    				 public static By title= By.id("title");
    				 public static By titleLord= By.id("145");
    				 public static By first_name= By.id("first_name");
    				 public static By last_name= By.id("last_name");
    				 public static By other_name= By.id("other_name");
    				 public static By email= By.id("email");  
    				 public static By phone_country_code= By.id("phone_country_code");
    				 public static By phone_codeCambodgia= By.id("120");
    				 public static By phone_number= By.id("phone_number");  
    				 
    				 public static By SaveContacts= By.xpath("//*[@id=\"vertical-tabpanel-0\"]/div/div/div[5]/button");
    				 
    				// edit Chairman Information	
    				 
    					public static By ChairmanButton = By.xpath("//*[text()='Chairman / Managing Director / Owner']");
    				 public static By title2= By.xpath("//div[@data-testid='contacts[1][title]']");
    				 //select from a dropdown list
    				 public static By titleLord2= By.xpath("(//select[@name='contacts[1][title]']/option)[6]");
    				 public static By first_name2= By.xpath("//input[@name='contacts[1][first_name]']");
    				 public static By last_name2= By.xpath("//input[@name='contacts[1][last_name]']");
    				 public static By other_name2= By.xpath("//input[@name='contacts[1][other_name]']");
    				 public static By email2= By.xpath("//input[@name='contacts[1][email]']");  
    				 public static By phone_country_code2= By.xpath("//select[@name='contacts[1].phone_country_code']");
    				 public static By phone_codeCambodgia2= By.xpath("(//select[@name='contacts[1].phone_country_code']/option)[6]");
    				 public static By phone_number2= By.xpath("//input[@name='contacts[1].phone_number']");
    				 public static By Savechairman= By.xpath("/html/body/div/div/main/div/div[2]/form/div[2]/div/div/div[5]/button/span");
    				 
    				 
    				 
    				 
    				// edit Production Information	
    				 public static By NoProduction= By.xpath("//input[@name='contacts[2].applicable_check']"); 
    				 public static By SaveProduction= By.xpath("/html/body/div/div/main/div/div[2]/form/div[3]/div/div/div[5]/button/span");
    				 
    				 //edit Marketing Information
    				 
    				 public static By NoMarketing= By.xpath("/html/body/div/div/main/div/div[2]/form/div[4]/div/div/div[2]/fieldset/div/label/span[1]/span"); 
    				 public static By SaveMarketing= By.xpath("/html/body/div/div/main/div/div[2]/form/div[4]/div/div/div[5]/button/span");
    				 
    				 
    				//edit HR Information
    				 public static By NoHR= By.xpath("/html/body/div/div/main/div/div[2]/form/div[5]/div/div/div[2]/fieldset/div/label/span[2]"); 
    				 public static By SaveHR= By.xpath("/html/body/div/div/main/div/div[2]/form/div[5]/div/div/div[5]/button/span");
    				 
    				//edit Compliance Information
    				 public static By NoCompl= By.xpath("/html/body/div/div/main/div/div[2]/form/div[6]/div/div/div[2]/fieldset/div/label/span[2]"); 
    				 public static By SaveCompl= By.xpath("/html/body/div/div/main/div/div[2]/form/div[6]/div/div/div[5]/button/span");
    				 
    					//edit contact Finance Information
    				 
    				 public static By contactFinanceTitle= By.xpath("//div[@data-testid='contacts[6][title]']"); 
    				 public static By contactFinanceTitle8= By.xpath("(//select[@name='contacts[6][title]']/option)[8]"); 
    				
    				 public static By finance_first_name= By.xpath("//input[@name='contacts[6][first_name]']"); 
    				 public static By finance_last_name= By.xpath("//input[@name='contacts[6][last_name]']");  
    				 public static By finance_contact_email= By.xpath("//input[@name='contacts[6][email]']"); 
    				 public static By finance_phone_code= By.xpath("//select[@name='contacts[6].phone_country_code']"); 
    				 public static By finance_phone_code5= By.xpath("(//select[@name='contacts[6].phone_country_code']/option)[10]"); 
    				 public static By finance_phone_number= By.xpath("//input[@name='contacts[6].phone_number']"); 
    				 public static By saveContactFinance= By.xpath("/html/body/div/div/main/div/div[2]/form/div[7]/div/div/div[5]/button/span");
    				 
    					//edit Booking Information
    				 public static By NoBooking= By.xpath("/html/body/div/div/main/div/div[2]/form/div[8]/div/div/div[2]/fieldset/div/label/span[2]"); 
    				 public static By SaveBooking= By.xpath("/html/body/div/div/main/div/div[2]/form/div[8]/div/div/div[5]/button/span");
    				 
    					//edit Booking Information
    				 public static By NoTQC= By.xpath("/html/body/div/div/main/div/div[2]/form/div[9]/div/div/div[2]/fieldset/div/label/span[2]"); 
    				 public static By SaveTQC= By.xpath("/html/body/div/div/main/div/div[2]/form/div[9]/div/div/div[5]/button/span");
    				 
    				 
  //EDIT Financial iNFORMATION
    				 public static By financialInfoEdit= By.xpath("/html/body/div/div/main/div[2]/div/table/tbody/tr[4]/td[2]/div/div[2]/a/span");
    				 public static By registration_number= By.id("registration_number"); 
    				 public static By vat_number= By.id("vat_number"); 
    				 public static By bank_name= By.id("bank_name"); 
    				 public static By branch_address_line_1= By.id("branch_address_line_1"); 
    				 public static By branch_address_line_2= By.id("branch_address_line_2"); 
    				 public static By branch_address_city= By.id("branch_address_city"); 
    				 public static By branch_address_county= By.id("branch_address_county"); 
    				 public static By branch_address_country= By.xpath("//*[@id=\"branch_address_country\"]"); 
    				 public static By branch_address_country4= By.id("10"); 
    				 
    				 public static By branch_address_postcode= By.id("branch_address_postcode"); 
    				 public static By bic_swift_code= By.id("bic_swift_code"); 
    				 public static By sort_code= By.id("sort_code"); 
    				 public static By bank_account_number= By.id("bank_account_number"); 
    				 public static By beneficiary_name= By.id("beneficiary_name"); 
    				 
    				 public static By saveFinancial= By.xpath("//button[@type='submit']"); 
    				
    				 
    				//Edit SHIPMENT and IMPORT iNFORMATION
    				 public static By editShipment= By.xpath("/html/body/div/div/main/div[2]/div/table/tbody/tr[5]/td[2]/div/div[2]/a/span"); 
    				 public static By onlyUK= By.id("no-only-from-the-uk_99"); 
    				 public static By saveShipment= By.xpath("/html/body/div/div/main/div/form/div/div[4]/button/span"); 
    				 
    				 //Submit application
    				
    				 public static By Submit_Application= By.xpath("//span[text()='Submit Application']");
    				 
}

package Helpers;
import org.openqa.selenium.By;
public class Selectors {

	public static By emailInviter = By.id("i0116");
	public static By loginNext = By.id("idSIButton9");
	
	
    public static By BoohooGroup= By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div[1]/div/div/form/div/div/input[1]");
	public static By InviteAsupplier= By.xpath("//*[text()='INVITE A SUPPLIER']");
	public static By inviterName = By.id("inviter_name");
	public static By InviterRole = By.id("inviter_role");
	
	public static By errorLoad = By.className("MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary");
	public static By inviterBrand = By.id("inviter_brand");
	public static By brandItem = By.id("105");
	public static By brandItem110 = By.xpath("(//select[@name='inviter_brand']/option)[12]");
	//
	public static By department = By.id("buying_department");
	
	public static By click1 = By.xpath("//*[text()='Does the supplier have a valid third party audit available for all factories they wish to onboard?']");
	public static By click2 = By.xpath("//*[text()='This supplier can meet our lead time requirements?']");
	public static By click3 = By.xpath("//*[text()='This supplier can meet our cost price requirements and pricing structure?']");
	
	public static By CompanyName = By.id("supplier_company_name");
	
	
	public static By popUpDuplicateFactory = By.xpath("//*[text()='I understand']");
	
	public static By trade_company_name_are_different_No = By.id("trade_company_name_are_different_No");
	public static By supplier_trading_name = By.id("supplier_trading_name");
	
	
	
	public static By PopUpSameCompany = By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div");
	public static By sameNameYes = By.id("trade_company_name_are_the_same_Yes");
	
	
	public static By SupllierrTitle = By.id("supplier_title");
	public static By suppTitle140  = By.id("140");
	
	
	public static By suppFirstName  = By.id("supplier_firstname");
	public static By suppLastName  = By.id("supplier_surname");
	public static By suppDepartment  = By.id("supplier_department");
	public static By department4  = By.id("4");
	
	public static By supplierEmail  = By.id("supplier_email");
	
	public static By phoneCountryCode  = By.id("supplier_phone_country_code");
	public static By phoneCountryCode17  = By.id("17");
	
	public static By suppPhoneNr  = By.id("supplier_phone_number");
	
	public static By directorTitle  = By.id("director_title");
	public static By directorTitle141  = By.xpath("(//select[@name='director_title']/option)[5]");
	
	public static By directorFirtName  = By.id("director_firstname");
	public static By directorLastName = By.id("director_surname");
	
	public static By directorEmail = By.id("director_email");
	
	public static By businessJustification = By.id("business_justification");
	
	public static By otherDepartmentProduced = By.xpath("//*[text()='Footwear']");
	
	public static By OtherProducedText = By.id("supplier_produce_other");
	
	public static By Karen = By.id("new_brands");
	public static By Burton = By.xpath("(//input[@name='new_brands'])[3]");
	public static By Oasis = By.xpath("(//input[@name='new_brands'])[10]");
	public static By Debenhams = By.xpath("(//input[@name='new_brands'])[5]");
	
	public static By paymentTerm = By.id("payment_terms");
	
	public static By shypmentTerm = By.id("uk_shipment_terms");
	
	
	//temporary, to be deleted
	public static By shypmentTermUAT = By.id("shipment_terms");
	//temporary, to be deleted
		public static By shypmentTermDDP1UAT = By.xpath("(//select[@name='shipment_terms']/option)[4]");
   
	public static By shypmentTerm117 = By.xpath("(//select[@name='uk_shipment_terms']/option)[2]");
	public static By shypmentTermFCA = By.xpath("(//select[@name='uk_shipment_terms']/option)[3]");
	public static By shypmentTermDDP1 = By.xpath("(//select[@name='uk_shipment_terms']/option)[4]");
	
	//when selected term ddb, chose one
	public static By delivery1 = By.xpath("(//*[text()='Own Transport'])[1]");
	public static By delivery2 = By.xpath("//*[text()='Courier']");
	public static By delivery3 = By.xpath("//*[text()='Nominated Carrier']");
	
	
	public static By usShypmentTerm = By.id("us_shipment_terms");
	public static By usShypmentTermDAP = By.xpath("(//select[@name='us_shipment_terms']/option)[4]");
	public static By usShypmentTermDAP3 = By.xpath("(//span[text()='Nominated Carrier'])[2]");
	
	public static By invoiceCurency = By.id("invoice_currency");
	
	public static By invoiceCurency171 = By.xpath("(//select[@name='invoice_currency']/option)[5]");
	//select 3 option tag  from div with name invoice...
	public static By invoiceCurencyEuro = By.xpath("(//select[@name='invoice_currency']/option)[3]");
	public static By invoiceCurencyGbp = By.xpath("(//select[@name='invoice_currency']/option)[2]");
	public static By invoiceCurencyCad = By.xpath("(//select[@name='invoice_currency']/option)[10]");
	
	
	
	public static By Importer= By.xpath("//*[@id=\"supplier_types\"]");
	
	
	public static By sendDraftInvite= By.xpath("//span[text()='Send Draft Invite']");
	
	public static By success= By.xpath("//*[text()='Invite Form completed, and sent for internal approval']");
	
	public static By errorMSG= By.xpath("//*[@id=\"center_column\"]/div");
	public static By customerService= By.xpath("//*[@id=\"center_column\"]/h1");
	public static By cookieButton = By.xpath("//*[@id=\"cq-gen4\"]/div[1]/div[1]/div/div/div[2]/ul/li[2]/a/span");
	public static By html5Btn = By.xpath("//*[@id=\"ds2-globalnav\"]/ul[3]/li[1]/a");
	public static By MyConfigBtn = By.xpath("//*[@id=\"ds2-globalnav\"]/ul[3]/li[2]/a");
	
	//search invitation
	 public static By searchInvite= By.xpath("//input[@placeholder='Search']");
	 
	 //Approvals process
	 public static By select_status= By.xpath("//div[@data-testid='select-status']");
	 public static By boohooApproval= By.xpath("//*[text()='Boohoo Approval']");
	
			//SEARCH INVITATION 
	 public static By Invitations= By.xpath("//*[text()='INVITATIONS']");
	 public static By search_invite= By.xpath("//input[@placeholder='Suppliers']");
	 public static By search_get= By.xpath("//*[@data-testid='adornment']");
	 public static By Review_Invitet= By.xpath("//*[text()='Review']");
	 public static By Approve_Invite= By.xpath("//*[text()='Approve and Send']");
	 public static By Approve_Confirm= By.xpath("//*[text()='Confirm']");
	 
	//SEARCH Application
	 public static By search_application= By.xpath("//input[@placeholder='Search']");
	
	 public static By view_factoryDetail= By.xpath("/html/body/div/div/main/div/div[2]/table/tbody/tr[2]/th[3]/div/div/a/span/text()");
	 public static By Review_application= By.xpath("//span[text()='Review']");
	 
	 // Approve Finance
	 public static By Approve_4= By.xpath("//span[text()='Approve']");
	 
	 public static By finance_typeId = By.id("supplierTypeId");
	 
	                   //select from a drop-down list
	public static By finance_typeId1 = By.xpath("(//select[@name='supplierTypeId']/option)[2]");

	public static By finance_rsepFullName = By.xpath("//input[@name='responsibleContactFullName']");
	public static By finance_appConsentBox = By.xpath("//input[@name='approveConsent']");
	public static By finance_Approved = By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div/div[1]/button/span");
	
	 // Approve Ethical
	public static By Ethic_comments= By.id("comments");

	public static By ethic_Approved = By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div/div[1]/button/span");
	
	// Approve Factory     
	public static By factory_edit= By.xpath("/html/body/div/div/main/div/div[2]/table/tbody/tr[2]/th[3]/div/div/a");
	public static By factory_appFactory = By.xpath("//span[text()='Approve Factory']");
	 public static By factory_approvepopup= By.xpath("//span[text()='Approve']");
	 public static By factory_makeReltionActive= By.xpath("//span[text()='Make Supplier-Factory Relationship Active']");
	 public static By factory_makeReltionActivePopup= By.xpath("//span[text()='Make factory active']");
	 
	                               // same class button, choose 3rd factory
	 public static By factory_2= By.xpath("(//span[@class='MuiButton-label'])[3]");
	 public static By factory_3= By.xpath("(//span[@class='MuiButton-label'])[4]");
	 public static By factory_4= By.xpath("(//span[@class='MuiButton-label'])[5]");
	 public static By factory_5= By.xpath("(//span[@class='MuiButton-label'])[6]");
	 public static By factory_6= By.xpath("(//span[@class='MuiButton-label'])[7]");
	 
	 // Validate supplier moved from Application to Supplier
	 public static By Supplier_Folder= By.xpath("//a[text()='SUPPLIERS']");
	 public static By Supplier_searchBox= By.xpath("//label[@title='Search by name or reference id']");
	//input[@placeholder='Search by Name']
	 public static By Supplier_searchText= By.xpath("//input[@placeholder='Search by Name']");
	
}

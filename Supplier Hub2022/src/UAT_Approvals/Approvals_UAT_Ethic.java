package UAT_Approvals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_UAT_Ethic {

	public static void main(String[] args) throws InterruptedException {
		
		String str = "OSJZQ5" ;
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://uat-supplier-portal.testEnvironment.com");

	 	 //Create object of Dimensions class
	    Dimension d = new Dimension(800,1000);
	    //Resize the current window to the given dimension
	    driver.manage().window().setSize(d);
	 	 
	 	// explicit wait - to wait for the Next button to be click-able
	 	WebDriverWait wait = new WebDriverWait(driver, 10);
	 	
	 	wait.until(ExpectedConditions.elementToBeClickable(Selectors.testEnvironmentGroup));
			driver.findElement(Selectors.testEnvironmentGroup).click();
			
			driver.manage().window().maximize();
			
	 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

	 			//type email 
	 			driver.findElement(By.id("i0116")).sendKeys("EthicalComplianceApprover@testEnvironment.com");
	 			
	 			driver.findElement(By.id("idSIButton9")).click();
	 			
	 			//wait until Signin button  is displayed
	 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	 			
	 					//type password
	 					driver.findElement(By.id("i0118")).sendKeys("Shinylunch83)");
	 					
	 					driver.findElement(By.id("idSIButton9")).click();
	 					
	 					
	 					//wait until 2nd Sign in button  is displayed
	 					wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	 					driver.findElement(By.id("idSIButton9")).click();
	 					
	 					Thread.sleep(2000);
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.select_status));
						driver.findElement(Selectors.select_status).click();
						driver.findElement(Selectors.testEnvironmentApproval).click();
						
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
						driver.findElement(Selectors.search_application).sendKeys(str);
						driver.findElement(Selectors.search_get).click();
						Thread.sleep(500);
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_application));
						driver.findElement(Selectors.Review_application).click();
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.Approve_4));
						driver.findElement(Selectors.Approve_4).click();
						driver.findElement(Selectors.Ethic_comments).sendKeys("I approve their application to become a supplier for testEnvironment group plc");
						driver.findElement(Selectors.finance_appConsentBox).click();
						driver.findElement(Selectors.ethic_Approved).click();
	}

}

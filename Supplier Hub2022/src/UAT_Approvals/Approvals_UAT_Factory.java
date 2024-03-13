package UAT_Approvals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_UAT_Factory {
	
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
	 			driver.findElement(By.id("i0116")).sendKeys("FactoryApprover@testEnvironment.com");
	 			
	 			driver.findElement(By.id("idSIButton9")).click();
	 			
	 			//wait until Signin button  is displayed
	 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	 			
	 					//type password
	 					driver.findElement(By.id("i0118")).sendKeys("Smalltiger11:");
	 					
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
						
					
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_edit));
						driver.findElement(Selectors.factory_edit).click();
						
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
						driver.findElement(Selectors.factory_appFactory).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
							driver.findElement(Selectors.factory_approvepopup).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
							driver.findElement(Selectors.factory_makeReltionActive).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
							driver.findElement(Selectors.factory_makeReltionActivePopup).click();

}

}

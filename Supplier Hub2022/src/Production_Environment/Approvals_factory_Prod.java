package Production_Environment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_factory_Prod {
	

	 @Test

	 public void factoryApp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

		 	// open chrome browser
		 	WebDriver driver = new ChromeDriver();

		 	// navigate to testing page
		 	driver.get("https://hub-internal.boohoo-group.com");

		 	driver.manage().window().maximize();
		 	 
		 	// explicit wait - to wait for the Next button to be click-able
		 	WebDriverWait wait = new WebDriverWait(driver, 15);
		 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

		 			//type email 
		 			driver.findElement(By.id("i0116")).sendKeys("PROD-FactoryApprover@boohoo.com");
		 			
		 			driver.findElement(By.id("idSIButton9")).click();
		 			
		 			//wait until Signin button  is displayed
		 			wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		 			
		 					//type password
		 					driver.findElement(By.id("i0118")).sendKeys("yX.C0%srq)u1HaD{");
		 					
		 					driver.findElement(By.id("idSIButton9")).click();
		 			
		 					//wait until 2nd Sign in button  is displayed
		 					wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		 					driver.findElement(By.id("idSIButton9")).click();
		 					
		 				
		 					
		 					Thread.sleep(2000);
		 					wait.until(ExpectedConditions.elementToBeClickable(Selectors.select_status));
							driver.findElement(Selectors.select_status).click();
							driver.findElement(Selectors.boohooApproval).click();
}
}
package SIT_env_Approvals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_Finance_SIT {

	public static void main(String[] args) throws InterruptedException {
		
		String str = "3152" ;
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

		// open chrome browser
		WebDriver driver = new ChromeDriver();

		// navigate to testing page
		driver.get("https://int-supplier-portal.aaaaaaa.com");

		 driver.manage().window().maximize();
		 
		// explicit wait - to wait for the Next button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

				//type email 
				driver.findElement(By.id("i0116")).sendKeys("FinanceApprover@aaaaaa.com");
				
				driver.findElement(By.id("idSIButton9")).click();
				
				//wait until Signin button  is displayed
				wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
				
						//type password
						driver.findElement(By.id("i0118")).sendKeys("Funnyox11$");
						
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
						
						driver.findElement(Selectors.finance_typeId).click();
						driver.findElement(Selectors.finance_typeId1).click();
						driver.findElement(Selectors.finance_rsepFullName).sendKeys("Johny B");
						driver.findElement(Selectors.finance_appConsentBox).click();
						driver.findElement(Selectors.finance_Approved).click();
						Thread.sleep(1000);
						//driver.close();


	}

}

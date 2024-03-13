package UAT_Environment;





import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class acceptTC {

	
@Test
	
	public  void Terms () {
		
	System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

// 	// open Chrome browser
 	WebDriver driver = new ChromeDriver();





	 	// navigate to emailtest page	 	 	
        driver.get("https://mail.emailTest.com/mail/u/0/#inbox"); 
       
        
    	
        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("qualitynow2222@emailtest.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
  
     	//login to email
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Passwd']")));
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("1234#"); 
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
        //search for TC emails unread
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Caută în e-mailuri']")));
        driver.findElement(By.xpath("//input[@placeholder='Caută în e-mailuri']")).sendKeys("Acknowledgements"); 
        driver.findElement(By.xpath("//button[@aria-label='Caută în e-mailuri']")).click();
        
        driver.findElement(By.xpath("//span[text()='Este necitit']")).click();
        
        driver.findElement(By.xpath("(//span[text()='Invitation to accept our Group Supplier'])[1]")).click();
        
        driver.findElement(By.xpath("//*[@id=\":ls\"]/div[1]/table/tbody/tr/td/center/table/tbody/tr/td/table[4]/tbody/tr/th/table/tbody/tr/th[1]/center/table/tbody/tr/td/table/tbody/tr/td/a")).click();
        
        
        
        
        
        
        
        
}

	}



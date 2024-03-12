package SIT_env_Approvals;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_FactoryApp_SIT {
	
	@Test
	public void maintsetFactoryApp_SIT() throws InterruptedException {
		
		String str = "234" ;
		
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

		// open chrome browser
		WebDriver driver = new ChromeDriver();
			

		// navigate to testing page
		driver.get("https://int-supplier-portal.boohoo.com");

		 driver.manage().window().maximize();
		 
		// explicit wait - to wait for the Next button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

				//type email 
				driver.findElement(By.id("i0116")).sendKeys("FactoryApprover@boohoo.com");
				
				driver.findElement(By.id("idSIButton9")).click();
				
				//wait until Signin button  is displayed
				wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
				
						//type password
						driver.findElement(By.id("i0118")).sendKeys("Smalltiger11:");
						
						driver.findElement(By.id("idSIButton9")).click();
				
						//wait until 2nd Sign in button  is displayed
						wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
						driver.findElement(By.id("idSIButton9")).click();
						
						
						Thread.sleep(2000);
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
						driver.findElement(Selectors.search_application).sendKeys(str);
						driver.findElement(Selectors.search_get).click();
						Thread.sleep(500);
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.Review_application));
						driver.findElement(Selectors.Review_application).click();
						
						
					wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_edit));
						driver.findElement(Selectors.factory_edit).click();
						
						// approve relation for 1st factory
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
						driver.findElement(Selectors.factory_appFactory).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
							driver.findElement(Selectors.factory_approvepopup).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
							driver.findElement(Selectors.factory_makeReltionActive).click();
						
						 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
							driver.findElement(Selectors.factory_makeReltionActivePopup).click();
							
						// approve relation with 2nd factory
							 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_2));
								driver.findElement(Selectors.factory_2).click();
									
								wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
								driver.findElement(Selectors.factory_appFactory).click();
								
								 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
									driver.findElement(Selectors.factory_approvepopup).click();
								
								 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
									driver.findElement(Selectors.factory_makeReltionActive).click();
								
								 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
									driver.findElement(Selectors.factory_makeReltionActivePopup).click();
								
									// approve relation with 3nd factory
									 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_3));
										driver.findElement(Selectors.factory_3).click();												
										
										wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
										driver.findElement(Selectors.factory_appFactory).click();
										
										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
											driver.findElement(Selectors.factory_approvepopup).click();
										
										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
											driver.findElement(Selectors.factory_makeReltionActive).click();
										
										 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
											driver.findElement(Selectors.factory_makeReltionActivePopup).click();
								
											// approve relation with factory 4
											 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_4));
												driver.findElement(Selectors.factory_4).click();
					
												
												wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
												driver.findElement(Selectors.factory_appFactory).click();
												
												 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
													driver.findElement(Selectors.factory_approvepopup).click();
												
												 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
													driver.findElement(Selectors.factory_makeReltionActive).click();
												
												 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
													driver.findElement(Selectors.factory_makeReltionActivePopup).click();
													
													// approve relation with factory 5
													 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_5));
														driver.findElement(Selectors.factory_5).click();
							
														
														
														wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
														driver.findElement(Selectors.factory_appFactory).click();
														
														 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
															driver.findElement(Selectors.factory_approvepopup).click();
														
														 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
															driver.findElement(Selectors.factory_makeReltionActive).click();
														
														 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
															driver.findElement(Selectors.factory_makeReltionActivePopup).click();
															
															// approve relation with factory 6
															 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_6));
																driver.findElement(Selectors.factory_6).click();
									
																
																wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_appFactory ));
																driver.findElement(Selectors.factory_appFactory).click();
																
																 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_approvepopup));
																	driver.findElement(Selectors.factory_approvepopup).click();
																
																 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActive));
																	driver.findElement(Selectors.factory_makeReltionActive).click();
																
																 wait.until(ExpectedConditions.elementToBeClickable(Selectors.factory_makeReltionActivePopup));
																	driver.findElement(Selectors.factory_makeReltionActivePopup).click();
								
								System.out.println("Factory approval Done!");	
								
								 // Validate supplier moved from Application to Supplier
								Thread.sleep(1200);
								 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Supplier_Folder));
									driver.findElement(Selectors.Supplier_Folder).click();
								 
								 wait.until(ExpectedConditions.elementToBeClickable(Selectors.Supplier_searchBox));
									driver.findElement(Selectors.Supplier_searchBox).click();
							
								 
								// wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
									driver.findElement(Selectors.Supplier_searchText).sendKeys(str);
									driver.findElement(Selectors.search_get).click();
									
									//assert only 1 option is displayed in search result
									assertTrue(
											driver.findElement(By.xpath("(//span[text()='View Details'])[1]")).isDisplayed());
									
									assertFalse(
											driver.findElement(By.xpath("(//span[text()='View Details'])[2]")).isDisplayed());
}
}
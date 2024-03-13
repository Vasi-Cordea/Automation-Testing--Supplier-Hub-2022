package Production_Environment;


import static org.junit.Assert.assertTrue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Selectors;

public class Approvals_PROD_suite4 {
	
	
	String str = "7906" ;
	
	
	@Test
	public void factoryApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

	 	// open chrome browser
	 	WebDriver driver = new ChromeDriver();

	 	// navigate to testing page
	 	driver.get("https://hub-internal.emailTest.com");

	 	driver.manage().window().maximize();
	 	 
	 	// explicit wait - to wait for the Next button to be click-able
	 	WebDriverWait wait = new WebDriverWait(driver, 15);
	 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

	 			//type email 
	 			driver.findElement(By.id("i0116")).sendKeys("PROD-FactoryApprover@emailTest.com");
	 			
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
						driver.findElement(Selectors.testEnvironmentApproval).click();
						
						wait.until(ExpectedConditions.elementToBeClickable(Selectors.search_get));
						driver.findElement(Selectors.search_application).sendKeys(str);
						driver.findElement(Selectors.search_get).click();
						Thread.sleep(700);
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
								 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='View Details'])[1]")));
								assertTrue(
										driver.findElement(By.xpath("(//span[text()='View Details'])[1]")).isDisplayed());
								
								// assert supplier is active
								assertTrue(
										driver.findElement(By.xpath("//div[text()=' Supplier Active']")).isDisplayed());
								
								Thread.sleep(2500);
								//driver.close();
								
								 JFrame jFrame = new JFrame();
							        JOptionPane.showMessageDialog(jFrame, " All approvals for * " +str+ " Company Test * in Prod done!");
							        
								
						
	}
						@Test
						public void ethicalApp() throws InterruptedException {
							System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

						 	// open chrome browser
						 	WebDriver driver = new ChromeDriver();

						 	// navigate to testing page
						 	driver.get("https://hub-internal.emailTest.com");

						 	 //Create object of Dimensions class
						    Dimension d = new Dimension(800,1000);
						    //Resize the current window to the given dimension
						    driver.manage().window().setSize(d);
						 	 
						 	// explicit wait - to wait for the Next button to be click-able
						 	WebDriverWait wait = new WebDriverWait(driver, 8);
						 	
				
								
								driver.manage().window().maximize();
								
						 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

						 			//type email 
						 			driver.findElement(By.id("i0116")).sendKeys("PROD-EthicalApp@emailTest.com");
						 			
						 			driver.findElement(By.id("idSIButton9")).click();
						 			
						 			//wait until Signin button  is displayed
						 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
						 			Thread.sleep(300);
						 					//type password
						 					driver.findElement(By.id("i0118")).sendKeys("7{ZI@>e2w5hqv<ws");
						 					Thread.sleep(500);
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
											
											System.out.println("Ethical Compliance approval Done!");	
											Thread.sleep(1000);
											driver.close();
											
													
	}
						@Test
						public void sourcingApp() throws InterruptedException {
							System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

						 	// open chrome browser
						 	WebDriver driver = new ChromeDriver();

						 	// navigate to testing page
						 	driver.get("https://hub-internal.testEnvironment-group.com");

						 	 //Create object of Dimensions class
						    Dimension d = new Dimension(800,1000);
						    //Resize the current window to the given dimension
						    driver.manage().window().setSize(d);
						 	 
						 	// explicit wait - to wait for the Next button to be click-able
						 	WebDriverWait wait = new WebDriverWait(driver, 10);
						 	
						 
								
								driver.manage().window().maximize();
								
						 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

						 			//type email 
						 			driver.findElement(By.id("i0116")).sendKeys("PROD-SourcingApprove@emailTest.com");
						 			
						 			driver.findElement(By.id("idSIButton9")).click();
						 			
						 			//wait until Signin button  is displayed
						 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
						 			Thread.sleep(300);
						 					//type password
						 					driver.findElement(By.id("i0118")).sendKeys("[NlZGA`c8*zCv=>!");
						 					Thread.sleep(500);
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
											
											@Test
											public void financeApp() throws InterruptedException {
												System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");

											 	// open chrome browser
											 	WebDriver driver = new ChromeDriver();

											 	// navigate to testing page
											 	driver.get("https://hub-internal.emailTest.com");

											 	 //Create object of Dimensions class
											    Dimension d = new Dimension(800,1000);
											    //Resize the current window to the given dimension
											    driver.manage().window().setSize(d);
											 	 
											 	// explicit wait - to wait for the Next button to be click-able
											 	WebDriverWait wait = new WebDriverWait(driver, 10);
											 	
											
													
													driver.manage().window().maximize();
													
											 	wait.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));

											 			//type email 
											 			driver.findElement(By.id("i0116")).sendKeys("PROD-FinanceApprover@emailTest.com");
											 			
											 			driver.findElement(By.id("idSIButton9")).click();
											 			
											 			//wait until Signin button  is displayed
											 			wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
											 			Thread.sleep(300);
											 					//type password
											 					driver.findElement(By.id("i0118")).sendKeys("e9(/U6X%R.a=3\"mB");
											 					Thread.sleep(500);
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
																
																System.out.println("Finance approval Done!");
																Thread.sleep(1000);
																driver.close();
																
																
}
}
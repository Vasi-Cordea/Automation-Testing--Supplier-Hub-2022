package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void wait(WebDriver driver, By el) {
		
		WebDriverWait wait = new WebDriverWait(driver, 16);
		wait.until(ExpectedConditions.elementToBeClickable(el));
}
}
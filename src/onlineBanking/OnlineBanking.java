package onlineBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OnlineBanking {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver ", "C:\\Users\\001759\\Documents\\Eclipse\\bk\\geckodriver");

	    WebDriver driver = new FirefoxDriver();
	    Actions mouseActions = new Actions(driver);
	    
	    driver.get("https://www.bk.rw/ways-of-banking/online-banking");
	    Thread.sleep(3000);
	    	    
	    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"web-business-bank-slide\"]/div/div/div[2]/a"));
	    Action hoverButton = mouseActions.moveToElement(loginButton).build();
	    hoverButton.perform();
	    Thread.sleep(3000);
	    
	    //Open and close Accordions
	    WebElement accordionRegister = driver.findElement(By.xpath("//*[@id=\"bs-collapse\"]/div[1]/div[1]/h4/a"));
	    WebElement accordionBenefits = driver.findElement(By.xpath("//*[@id=\"bs-collapse\"]/div[2]/div[1]/h4/a"));
	    WebElement accordionServices = driver.findElement(By.xpath("//*[@id=\"bs-collapse\"]/div[3]/div[1]/h4/a"));
	    
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", accordionRegister);
	    Thread.sleep(2000);
	    
	    //Open and close <How to Register>
	    Action openAccordionRegister = mouseActions.moveToElement(accordionRegister).click().build();
	    openAccordionRegister.perform();
	    Thread.sleep(3000);
	    
	    Action closeAccordionRegister = mouseActions.moveToElement(accordionRegister).click().build();
	    closeAccordionRegister.perform();
	    Thread.sleep(3000);
	    
	    //Open and close <Benefits>
	    Action openAccordionBenefits = mouseActions.moveToElement(accordionBenefits).click().build();
	    openAccordionBenefits.perform();
	    Thread.sleep(3000);
	    
	    Action closeAccordionBenefits = mouseActions.moveToElement(accordionBenefits).click().build();
	    closeAccordionBenefits.perform();
	    Thread.sleep(2000);
	    
	    //Open and Close <Services Available>
	    Action openAccordionServices = mouseActions.moveToElement(accordionServices).click().build();
	    openAccordionServices.perform();
	    Thread.sleep(3000);
	    
	    Action closeAccordionServices = mouseActions.moveToElement(accordionServices).click().build();
	    closeAccordionServices.perform();
	    Thread.sleep(3000);
	    
	    //Find and click Apply Now button
	    WebElement applySection = driver.findElement(By.xpath("/html/body/div[6]"));
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", applySection);

	   
	    WebElement applyButton = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/p[2]"));
	    Action clickApplyButton = mouseActions.moveToElement(applyButton).click().build();
	    clickApplyButton.perform();
    
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    System.out.println("Success!");
	    Thread.sleep(3000);
	    driver.close();
	   
	   
	}
	
}

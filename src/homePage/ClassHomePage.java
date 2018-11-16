package homePage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ClassHomePage {
	
	public static void main(String[] args) throws InterruptedException{
		
        System.setProperty("webdriver.gecko.driver ", "C:\\Users\\001759\\Documents\\Eclipse\\bk\\geckodriver");

	    WebDriver driver = new FirefoxDriver();
	    
    	
	    driver.get("https://www.bk.rw");
		Thread.sleep(3000);
	    
	    
	    WebElement openAccount = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/h3"));
        WebElement getLoan = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/h3"));
        WebElement getMortgage = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div/h3"));
        WebElement cardCenter = driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/h3"));

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,480)", openAccount);
        
        Actions mouseActions = new Actions(driver);

        Action mouseHoverOpenAccount = mouseActions.moveToElement(openAccount).build();
        mouseHoverOpenAccount.perform();
        Thread.sleep(3000);
        
        Action mouseHoverGetLoan = mouseActions.moveToElement(getLoan).build();
        mouseHoverGetLoan.perform();     
        Thread.sleep(3000);   
        
        Action mouseHoverGetMortgage = mouseActions.moveToElement(getMortgage).build();
        mouseHoverGetMortgage.perform();
        Thread.sleep(3000);
        
        Action mouseHoverCardCenter = mouseActions.moveToElement(cardCenter).build();
        mouseHoverCardCenter.perform();
        Thread.sleep(3000);
        
        WebElement openAccountList = driver.findElement(By.cssSelector("body > div.container.personal-home-shtcuts > div > div:nth-child(1) > div > ul"));
        List<WebElement> links = openAccountList.findElements(By.tagName("li"));
        System.out.println("The links under the Open Account section are:");
		System.out.println(" ");
        for (int i = 0; i < links.size(); i++)
            {
            
        		System.out.println("* " + links.get(i).getText());
        		
            }
        
        Thread.sleep(3000);
        
        WebElement buyRate = driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[2]"));
        WebElement sellRate = driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[3]"));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellRate);
        
        String s = sellRate.getText();
        String b = buyRate.getText();
           
        double sell = Double.parseDouble(s);
        double buy = Double.parseDouble(b);
        
       
        int SR, BR;
        
         SR = (int) sell;
         BR = (int) buy;
         
         if(SR!=0 && SR>BR && SR>800){
             int diff = SR - BR;
             int diff2 = SR - 800;
        
         System.out.println(" ");
         System.out.println("The selling price is greater than the buying price by " + diff);
 		 System.out.println(" ");	
         System.out.println("The selling price is greater than 800 by " + diff2);
         
         }else{
             
         System.out.println("The selling price is less than the buying price and is less than 800");
    
         }
         
         Thread.sleep(3000);
         System.out.println("Success!");
 	     Thread.sleep(3000);
 	     driver.close();
 	
	}

}

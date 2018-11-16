package MegaMenu;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MenuNavigation {
	
	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver ", "C:\\Users\\001759\\Documents\\Eclipse\\bk\\geckodriver");

	    WebDriver driver = new FirefoxDriver();
	    Actions mouseActions = new Actions(driver);
	    
	    driver.get("https://www.bk.rw");
	    Thread.sleep(3000);
	    
	    WebElement elementCurrentAccount = driver.findElement(By.xpath("/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/a"));
        WebElement onlineBankingLink = driver.findElement(By.xpath("/html/body/section[2]/nav/div/div/div[2]/ul[1]/li[2]/ul/li[2]/ul/li[2]/a"));

        Action hoverOnElement = mouseActions.moveToElement(elementCurrentAccount).build();
        hoverOnElement.perform();
        Thread.sleep(3000);
        
        Action clickElement = mouseActions.moveToElement(onlineBankingLink).click().build();
        clickElement.perform();
        Thread.sleep(3000);
       
        System.out.println(driver.getTitle());
	}

}

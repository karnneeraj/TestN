package seleniumwebdemo;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class casestudy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    String underconsTitle = "Under constuction murciry tool";
	    List<WebElement> link = driver.findElements (By.tagName("a"));
	    String [] linktext = new String [link.size()];
	    int i=0;
	    for(WebElement e:link)
	    {
	    	linktext[i]=e.getText();
	    	i++;
	    	
	    }
	    for(String t:linktext)
	    		{
	    			driver.findElement(By.linktext(t).click();
	    			if (driver.getTitle().equals(underconsTitle)
	    			{
	    				System.out.println("\"" + t+ "\" + is undercontraction");
	    			}
	    			else 
	    				System.out.println("\"" + t+ "\" + is working");"
	    						
	    			}
	    		}
	     driver.navigate().back();
	     
	}
driver.quit();
}

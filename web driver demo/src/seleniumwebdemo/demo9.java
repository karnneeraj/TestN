package seleniumwebdemo;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo9 {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.get("http://idrs.it.att.com:3008/");
		    Thread.sleep(4000);
		    driver.manage().window().maximize();
		   // driver.findElement(By.xpath("//*[@type='text' and @value='userid']")).sendKeys("nk8289");
		    driver.findElement(By.cssSelector("userid")).sendKeys("nk8289");
		    driver.findElement(By.id("Password")).sendKeys("!!");
		    driver.findElement(By.name("submit")).click();
            driver.findElement(By.linkText("My Dashboard")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN)); 
            Thread.sleep(2000);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            System.out.println("No of tabs = " + tabs.size());
            Thread.sleep(2000);
            driver.switchTo().window(tabs.get(1));
            System.out.println(driver.getTitle());
            driver.switchTo().window(tabs.get(0));
            System.out.println(driver.getTitle());
            
	}

}

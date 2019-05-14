package seleniumwebdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {

	public static void main(String[] args) {
	
		     System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    
		     WebDriver driver = new FirefoxDriver();
		     driver.get("https://opensource-demo.orangehrmlive.com/");
		     driver.manage().window().maximize();
		     String.ExpectedTitle();
		     driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     driver.findElement(By.cssSelector("input#btnLogin")).click();
		     String ActualTitle = driver.getTitle();
		     if (ExpectedTitile.equals(ActualTitle))
		     {
		    	 System.out.println("if the title is same then do logout");
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.id("Welcome")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath(null)"//"[@id='Welcome Menu'/ul/li[2]/a]")).click();"
		 
		    
		     }
		     
	}

}

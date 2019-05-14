package seleniumwebdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("txtUsername")).sendKeys("linda.anderson");
	     String Value =driver.findElement(By.id("txtUsername")).getAttribute("value");
	     System.out.println(Value);
	     driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
	     driver.findElement(By.id("btnLogin")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Performance")).click();
	     //driver.findElement(By.xpath("//b[contains(text(),'Performance')]")).click();
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println(links.size());
	     for(WebElement e:links)
	     {
	    	 String linktext =e.getText();
	    	 System.out.println(linktext);
	    	 
	     }
	}

}

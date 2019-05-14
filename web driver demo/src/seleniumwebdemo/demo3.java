package seleniumwebdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://newtours.demoaut.com/");
	     driver.manage().window().maximize();
	     WebElement username=driver.findElement(By.name("username"));
	     if (username.isEnabled())
	     {
	    	 username.sendKeys("Sunil");
	    	 username.clear();
	    	 username.sendKeys("Sunil");
	    	     	 
	     }
	  if (driver.findElement(By.name("Username")).isDisplayed()); 
	  {
		  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sunil");
		 // /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input
		  driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		 
		  		
	  }
	  if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
	  		
	  {
		  driver.findElement (By.xpath("//*[@name='tripype' and @value='oneway']")).click();
		  WebElement DD = driver.findElement (By.name("passcount"));
		  Select sel = new Select(DD);
		  List<WebElement> data = sel.getOptions();
		  System.out.println(data.size());
		  for (int i=0;i<data.size();i++)
		  {
			  System.out.println(data.get(i).getText());
			  
		  }
		  sel.selectByValue("2");
		  
		  
	  }
	}
	

}

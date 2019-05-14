package seleniumwebdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://newtours.demoaut.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.name("userName")).sendKeys("Sunil");
	     driver.findElement(By.name("password")).sendKeys("Sunil");
	     driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
	     //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();	
	    
	}

}

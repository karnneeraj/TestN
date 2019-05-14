package seleniumwebdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://newtours.demoaut.com/");
	     driver.manage().window().maximize();
	    // driver.findElement(By.id("userName")).sendKeys("Admin");
	     driver.findElement(By.name("Username")).sendKeys("Sunil");
	}

}

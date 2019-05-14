package seleniumwebdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://efmsms-uat.hydc.sbc.com:8008/ms");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("ATTUID")).sendKeys("nk8289");
	     driver.findElement(By.id("Password")).sendKeys("Bang07Lore!!");
	     
	     
	}

}

package seleniumwebdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	     driver.get("http://newtours.demoaut.com/");
	     driver.manage().window().maximize();
	     WebElement link = driver.findElement(By.linkText("Car Rentals"));
	     Actions MH = new Actions(driver);
	     Action mouseover = MH.moveToElement(link).build();
	     mouseover.perform();
	     MH.sendKeys(link, (Keys.ENTER)).perform();
	     
	     
	}

}

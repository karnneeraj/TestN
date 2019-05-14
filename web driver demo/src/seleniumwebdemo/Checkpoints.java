package seleniumwebdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkpoints {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEERAJKUMAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    
	     WebDriver driver = new FirefoxDriver();
        driver.get("https://www.limeroad.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
               
        //Select SHOP WOMEN
        driver.findElement(By.id("shopWomen")).click();
		Thread.sleep(2000);
		//Select the @category
		driver.findElement(By.xpath("//img[@src = 'https://img0.junaroad.com/assets/images/sprite/women_bag_new.png']")).click();
		Thread.sleep(1000);
		//Select Item
		driver.findElement(By.xpath("//img[@src='//img0.junaroad.com/uiproducts/14557519/std_300_0-1513246692.jpg']")).click();
		Thread.sleep(2000);
		//Verify the Item before Add to cart
		String beforeCart = driver.findElement(By.xpath("//div[@class ='c3 fs20 pt0 p12 pb2 bs ttC']")).getText();
	
		
		//Add to Cart
	   // driver.findElement(By.xpath("div[@class='h48 bs avail bgL br4 p12 cF taC fwB gtm-atc bxs hbxs ']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		//Verify the Item After Add to cart
		String afterCart = driver.findElement(By.xpath("//div[@class = 'fs16 ttC']")).getText();
		
		Boolean compareName = beforeCart.equals(afterCart);
		System.out.println(compareName);
		if(compareName = true) {
			System.out.println("Item is Correct");
		}else {
			System.out.println("Item is Incorrect");
		}
		
		
		//Verify the Price before check out (Total price)
		String X1 = driver.findElement(By.xpath("//div[@class = 'dT wp100 p40 bs  cP fs20']//div[@class = 'dTc vM taR wp50 wsN owsN']")).getText();
		System.out.println(X1);
		X1 = X1.substring(1);
		System.out.println("SubString" + X1);
		
		//Check out 
		driver.findElement(By.linkText("CHECKOUT")).click();
		Thread.sleep(2000);
		//Verify the Price After check out 
		driver.findElement(By.xpath("//label[@class='bdbF bs no-inp p16 pR dB sclk_cc']")).click();
		Thread.sleep(2000);
		String X2=driver.findElement(By.xpath("//form[@id ='tar-cc']//span[@id='tPay' and @class='aPay']")).getText();
		System.out.println(X2);
		
		
		Boolean ComparePrice=X1.equals(X2);
		if(ComparePrice = true) {
			System.out.println("X1 is equal to X2");
		}else {
			System.out.println("X1 is not equal to X2");
		}
		
		
		
		
		//Verify the errors
		driver.findElement(By.id("pnAl")).sendKeys("5438");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id = 'tar-cod']//div[@class='subOrder bgL br4 bs hbxs bxs cF fwB fs16 m12A p12 taC w96p']")).click();
		driver.findElement(By.id("mobAl")).sendKeys("750403");
		driver.findElement(By.xpath("//form[@id = 'tar-cod']//div[@class='subOrder bgL br4 bs hbxs bxs cF fwB fs16 m12A p12 taC w96p']")).click();
		Thread.sleep(2000);
		System.out.println("Errors are displayed");
		
		//Click on Limeroad logo
		driver.findElement(By.xpath("//a[@class = 'l12 m80 pA t0 z5 ']/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id = 'vHdr']/child::a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Customer Support
		driver.findElement(By.xpath("//a[@class='no-sub tdN c0 dB p8 pl12']")).click();
		Thread.sleep(2000);
		//Click on shopping cart symbol
		driver.findElement(By.id("cartB")).click();
		Thread.sleep(2000);
		
		//delete the item in cart
		driver.findElement(By.xpath("//div[@class='h24 w24 dIb vT']")).click();
		Thread.sleep(2000);
		//No item is displayed in cart
		String message = driver.findElement(By.xpath("//div[@class = 'c6 fs13 mt40 p12']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='bgL br4 bs cF dB fs18 fwB hbxs m12A mb96 mxw310 p12 taC tdN']")).click();
		driver.navigate().refresh();
		driver.close();
		
		
		  
	}   
        
	
	}



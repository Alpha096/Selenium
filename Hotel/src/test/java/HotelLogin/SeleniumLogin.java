package HotelLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		Thread t = null;
		driver.get("file:///D:/hotelBooking/login.html/");
		String strheading=driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/h1")).getText();
		if(strheading.contentEquals("Hotel Booking Application"))
		{
			System.out.println("heading matched");
		}
		else
		{
			System.out.println("heading not matched");
		}
		
		String str=driver.getCurrentUrl();
		System.out.println(str);
		
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		//driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		
		
		//driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		driver.findElement(By.name("userPwd")).sendKeys("wrongpwd");
		
		t.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		
		//String alertMessage=driver.switchTo().alert().getText();
		//System.out.println(alertMessage);
		driver.switchTo().alert();
		t.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		//driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.navigate().to("file:///D:/hotelBooking/hotelbooking.html/");
		t.sleep(3000);
		
		//driver.close();
		
	
	}
}










/*package Login;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogin {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/hotelBooking/login.html/");
		String head = driver.findElement(By.xpath("//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		System.out.println(head);
		System.out.println(driver.getCurrentUrl());
		WebElement form = driver.findElement(By.name("myform"));
		form.findElement(By.name("userName")).sendKeys("capgemini");
		//form.findElement(By.name("userPwd")).sendKeys("capg1234");
		form.findElement(By.name("userPwd")).sendKeys("capg12345");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		form.findElement(By.className("btn")).click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		//driver.navigate().to("file:///D:/hotelBooking/hotelbooking.html");

	}
}
*/
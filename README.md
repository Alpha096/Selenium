package HotelBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBooking {
	public static void main(String []args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/hotelBooking/hotelbooking.html/");
		
		
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("Alpha");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("Beta");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@id='txtEmail']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtEmail']")).sendKeys("aaa@jj.bb");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("9685741230");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		Select s = new Select(driver.findElement(By.xpath("html/body/div[1]/div/form/table/tbody/tr[7]/td[2]/select")));
		s.selectByValue("Select City");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		Select s1 = new Select(driver.findElement(By.xpath("html/body/div[1]/div/form/table/tbody/tr[7]/td[2]/select")));
		s1.selectByValue("Pune");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		Select s2 = new Select(driver.findElement(By.xpath("html/body/div[1]/div/form/table/tbody/tr[8]/td[2]/select")));
		s2.selectByValue("Select State");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		Select s3 = new Select(driver.findElement(By.xpath("html/body/div[1]/div/form/table/tbody/tr[8]/td[2]/select")));
		s3.selectByValue("Maharashtra");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@id='txtCardholderName']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtCardholderName']")).sendKeys("Alpha");
		driver.findElement(By.xpath("//*[@id='btnPayment']")).click();
		driver.switchTo().alert().accept();
	}
	
}

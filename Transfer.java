package airportTransfer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Transfer {
	 public static void main(String[] args) throws InterruptedException {
			
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("start-maximized","--remote-allow-origins=*");
		 ChromeDriver driver=new ChromeDriver(chromeOptions);
			 	 
		 driver.get("https://qa.travelfika.com/");
		 Thread.sleep(1000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//div[text()='Airport Transfer']")).click();
		 Thread.sleep(1000);
		 
		 WebElement airport = driver.findElement(By.xpath("//input[@placeholder='Search for Airport']/parent::div/parent::div"));
		 airport.click();
		 Thread.sleep(1000);
		 Actions action = new Actions(driver);		 
		 action.moveToElement(airport).sendKeys("JFK").perform();
		 Thread.sleep(1000);		 
		 driver.findElement(By.xpath("//span[contains(text(),'New york, ')]")).click();
		 
		 WebElement hotel = driver.findElement(By.xpath("//input[@placeholder='Search for hotel']/parent::div/parent::div"));
		 Thread.sleep(1000);
		 hotel.click();
		 action.moveToElement(hotel).sendKeys("The Manhattan Club").perform();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='the manhattan club']")).click();
		 
		 Thread.sleep(500);
		 WebElement calendar = driver.findElement(By.xpath("//span[text()='Arrival Date']"));
		 action.moveToElement(calendar).click().perform();
		 Thread.sleep(500);
		 WebElement next = driver.findElement(By.xpath("//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__default DayPickerNavigation_button__default_2 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_3 DayPickerNavigation_button__horizontalDefault DayPickerNavigation_button__horizontalDefault_4 DayPickerNavigation_rightButton__horizontalDefault DayPickerNavigation_rightButton__horizontalDefault_5']"));
		 next.click();
		 Thread.sleep(500);
	     next.click();
		 Thread.sleep(500);
	     next.click();
		 Thread.sleep(500);
	     next.click();
	     
		 Thread.sleep(1000);
	     WebElement date = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[2]/td[3]"));
		 action.moveToElement(date).click().perform();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[text()='Done']")).click();
		 Thread.sleep(500);
		 
	     WebElement clock = driver.findElement(By.xpath("//div[@class='relative']/button"));
		 clock.click();
		 Thread.sleep(500);
		 WebElement time = driver.findElement(By.xpath("//p[text()='10:00']"));
		 Thread.sleep(500);
		 action.moveToElement(time).click().perform();
		 
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[text()='Search for transfers']/parent::a")).click();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='relative w-full rounded-2xl overflow-hidden p-2']")).click();
		 
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//button[text()='Book']")).click();
		 
		 Set<String> windowHandles1 = driver.getWindowHandles();
	     List<String> book=new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(book.get(1));
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("djhdbhs");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("djhdbhs");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//button[@placeholder='Select*']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[text()='Mr']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@placeholder='Age*']")).sendKeys("24");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Select Airline*']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[text()='American Airlines']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@placeholder='Flight Number*']")).sendKeys("US-123");
		 Thread.sleep(500);
         driver.findElement(By.xpath("(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[1]/input")).sendKeys("5th cross st");
		 
		 Thread.sleep(1000);
		 WebElement country2 = driver.findElement(By.xpath("//input[@placeholder='Select Country*']"));
		 country2.sendKeys("India");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='India']")).click();
		 
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@placeholder='Zipcode*']")).sendKeys("624678");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[2]/input")).sendKeys("salem");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@placeholder='Email*']")).sendKeys("aghjdj01@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Contact number']")).sendKeys("5637352892");
	     
	     Thread.sleep(1000);
	     
	     driver.switchTo().frame(0);
	     
	     driver.findElement(By.xpath("//div[@class='p-CardNumberInput']//input")).sendKeys("5555555555554444");
	     Thread.sleep(1000);
	     WebElement exp = driver.findElement(By.xpath("//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']"));
	     exp.sendKeys("11");
	     Thread.sleep(500);
	     exp.sendKeys("25");
	     Thread.sleep(1500);
	     WebElement cvv = driver.findElement(By.xpath("//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']"));
	     cvv.sendKeys("324");
	    
	     driver.switchTo().defaultContent();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//button[text()='Proceed to Pay']")).click();
	       
	     driver.findElement(By.xpath("//a[text()='Receipt']")).click();
	     Thread.sleep(500);
	     Set<String> windowHandles2 = driver.getWindowHandles();
	     List<String> receipt=new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(receipt.get(2));
		 
         Thread.sleep(2000);
	     WebElement receipt1 = driver.findElement(By.xpath("//table[@class='st-Wrapper']/tbody"));
	     String text1 = receipt1.getText();
	     System.out.println("       Receipt : "+text1);
	     Thread.sleep(1000);
	     driver.close();
	     driver.switchTo().window(book.get(1));

	     Thread.sleep(500);   
	     driver.findElement(By.xpath("//div[text()='Cancel the booking?']")).click();
	     Thread.sleep(3000);
	     
	     WebElement refund = driver.findElement(By.xpath("(//h4[text()='Transfer Subtotal']/parent::div)[2]"));
	     String text2 = refund.getText();
	     System.out.println("        Refund details : "+text2);
	      
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[text()='Yes']")).click();
	         
	     Thread.sleep(3000);
		 WebElement cancel = driver.findElement(By.xpath("//div[@class='text-red-800']"));
		 String text3 = cancel.getText();
		 System.out.println("       Cancellation status : "+text3);  
		 
		 WebElement refunded = driver.findElement(By.xpath("//h4[text()='Refunded']/parent::div"));
		 String text4 = refunded.getText();
		 System.out.println("       refunded  : "+text4); 
		 				
		 
 }
}
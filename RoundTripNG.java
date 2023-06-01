package automationTestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoundTripNG {
	WebDriver driver;	
	//long startTime;
	//long endTime;
	 
	 @BeforeClass
		public void openBrowser() throws InterruptedException { 
			driver = new ChromeDriver();
			 	 
		 driver.get("https://qa.travelfika.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 //startTime = System.currentTimeMillis();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	   @Test
		 public void booking() throws InterruptedException {
		 driver.findElement(By.xpath("//div[text()='Flights']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='locationInput']")).sendKeys("M");
		 driver.findElement(By.xpath("//input[@id='locationInput']")).sendKeys("A");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@id='locationInput']")).sendKeys("A");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@id='locationInput']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[contains(text(),'Chennai, India')]")).click();
	     Thread.sleep(500);
	     driver.findElement(By.xpath("//input[@placeholder='Flying to']")).sendKeys("J");
	     driver.findElement(By.xpath("//input[@placeholder='Flying to']")).sendKeys("F");
	     driver.findElement(By.xpath("//input[@placeholder='Flying to']")).sendKeys("K");
	     Thread.sleep(500);
	     driver.findElement(By.xpath("//input[@placeholder='Flying to']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//span[contains(text(),'New york, ')]")).click();
		 Thread.sleep(500);
		 Actions action = new Actions(driver);
		 WebElement date = driver.findElement(By.xpath("//div[@class='absolute inset-0']"));
		 action.moveToElement(date).click().perform();
		 Thread.sleep(500);
		 WebElement next = driver.findElement(By.xpath("//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__default DayPickerNavigation_button__default_2 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_3 DayPickerNavigation_button__horizontalDefault DayPickerNavigation_button__horizontalDefault_4 DayPickerNavigation_rightButton__horizontalDefault DayPickerNavigation_rightButton__horizontalDefault_5']"));
		 next.click();
		 Thread.sleep(500);
		 next.click();
		 Thread.sleep(500);
		 next.click();
		 Thread.sleep(500);
		 next.click();
		 Thread.sleep(500);
		
		 WebElement depart = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[2]/td[3]"));
		 Thread.sleep(500);
		 action.moveToElement(depart).click().perform();
		 Thread.sleep(500);
		 WebElement ret = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[3]/td[4]"));
		 Thread.sleep(500);
		 action.moveToElement(ret).click().perform();
		 Thread.sleep(500);
		 
		 driver.findElement(By.xpath("//span[text()='Economy']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//p[text()='Business']")).click();
		 Thread.sleep(500);
	 
		 driver.findElement(By.xpath("//span[text()='Search for flights']")).click();
		 Thread.sleep(15000);
		 
		 Set<String> windowHandles = driver.getWindowHandles();
	     List<String> obj=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(obj.get(1));

		 Thread.sleep(500);
				 
		 driver.findElement(By.xpath("//div[@class='grid items-center w-full p-1']")).click();
		
		 Thread.sleep(10000);
		 Set<String> windowHandles2 = driver.getWindowHandles();
	     List<String> trip=new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(trip.get(2));
		 
		 driver.findElement(By.xpath("//span[@class='cursor-pointer rounded-lg text-primary-6000 bg-primary-100']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("(//span[@class='cursor-pointer rounded-lg text-primary-6000 bg-primary-100'])[2]")).click();
		
		 Thread.sleep(500);

		
	     
		 driver.findElement(By.xpath("//button[text()='Continue to Checkout']")).click();
		// Thread.sleep(3000);
		 //driver.findElement(By.xpath("//button[text()='Skip & Continue']")).click();
		 Thread.sleep(10000);
		 
		 WebElement price = driver.findElement(By.xpath("//div[@class='flex flex-col w-full gap-4 text-neutral-900 rounded-2xl px-6 py-4 border-2 shadow-lg']"));
		 String text2 = price.getText();
		 System.out.println("    price : "+text2);
		
		 driver.findElement(By.xpath("//span[@class='rounded-xl flex items-center justify-between gap-2']/input")).sendKeys("ascfgg");
		 driver.findElement(By.xpath("(//span[@class='rounded-xl flex items-center justify-between gap-2']/input)[3]")).sendKeys("yfrhf");
		 WebElement dob = driver.findElement(By.xpath("//span[@class='w-full flex items-center justify-between gap-2']/input"));
		 action.moveToElement(dob).click().perform();
		 Thread.sleep(200);
		 dob.sendKeys("12");
		 Thread.sleep(100);
		 dob.sendKeys("12");
		 Thread.sleep(200);
		 dob.sendKeys("1999");
		
		 Thread.sleep(500);
		 WebElement country = driver.findElement(By.xpath("//div[@class='passport-issue-country w-full md:w-1/3 lg:1/3']//span/select"));
		 Select countryDropDown = new Select(country);
		 countryDropDown.selectByVisibleText("India");
		 
		 Thread.sleep(500);
		 WebElement gender = driver.findElement(By.xpath("//div[@class='gender w-full md:w-1/3 lg:1/3']//span/select"));
		 Select genderDropDown = new Select(gender);
		 genderDropDown.selectByVisibleText("Male");
		 
		 Thread.sleep(500);
		 driver.findElement(By.xpath("(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[1]/input")).sendKeys("5th cross st");
		 
		 Thread.sleep(700);
		 WebElement country2 = driver.findElement(By.xpath("//button[@class='w-full flex justify-between items-center bg-transparent']/input"));
		 country2.sendKeys("India");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='India']")).click();
		 
		 Thread.sleep(300);
		 driver.findElement(By.xpath("//input[@placeholder='Zipcode*']")).sendKeys("624678");
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[2]/input")).sendKeys("salem");
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  justify-center items-center']/input")).sendKeys("aghjdj01@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Contact number']")).sendKeys("5637352892");
	     
	     Thread.sleep(500);
	     
	     driver.switchTo().frame(0);
	     
	     driver.findElement(By.xpath("//div[@class='p-CardNumberInput']//input")).sendKeys("5555555555554444");
	     Thread.sleep(500);
	     WebElement exp = driver.findElement(By.xpath("//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']"));
	     exp.sendKeys("11");
	     Thread.sleep(200);
	     exp.sendKeys("25");
	     Thread.sleep(500);
	     WebElement cvv = driver.findElement(By.xpath("//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']"));
	     cvv.sendKeys("324");
	    
	     driver.switchTo().defaultContent();
	     
	     Thread.sleep(500);
	     
	     driver.findElement(By.xpath("//button[text()='Proceed to pay']")).click();
	       
	     Thread.sleep(8000);
	     
	     WebElement payment = driver.findElement(By.xpath("//div[@class='w-full lg:w-4/5 mt-4 flex flex-col shadow-[0_0_20px_0.5px_rgba(0,0,0,0.2)] rounded-2xl px-6 py-4 justify-center mx-auto']"));
	     String text3 = payment.getText();
	     System.out.println("      payment summary: "+text3);
					    
	     Thread.sleep(500);
			
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//a[text()='Receipt']")).click();
	     Thread.sleep(500);
	     Set<String> windowHandles3 = driver.getWindowHandles();
	     List<String> receipt=new ArrayList<String>(windowHandles3);
		 driver.switchTo().window(receipt.get(3));
		 
		 Thread.sleep(2000);
	     WebElement receipt1 = driver.findElement(By.xpath("//table[@class='st-Wrapper']/tbody"));
	     String text4 = receipt1.getText();
	     System.out.println("       Receipt : "+text4);
	     Thread.sleep(500);
	     driver.close();
	     
	     Thread.sleep(500);
	     
	     driver.switchTo().window(trip.get(2));
	       
		 Thread.sleep(500);
			      
	     driver.findElement(By.xpath("//span[text()='Cancel the ticket?']")).click();
	     Thread.sleep(2000);
	     
	     WebElement refund = driver.findElement(By.xpath("//h4[text()='Total Refund']/parent::div"));
	     String text6 = refund.getText();
	     System.out.println("        Refund details : "+text6);
	      
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[text()='Yes']")).click();
	         
	     Thread.sleep(2000);
		 WebElement cancel = driver.findElement(By.xpath("//div[@class='flex flex-row p-2 text-primary-6000 bg-primary-50']"));
		 String text7 = cancel.getText();
		 System.out.println("       Cancellation status : "+text7);
		}		
	
	 @AfterTest
		public void closeBrowser() {
			   driver.quit();
				/*
				 * endTime = System.currentTimeMillis(); long totalTime =endTime-startTime;
				 * System.out.println("total time=  "+totalTime);
				 */
				}

}

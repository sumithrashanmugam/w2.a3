package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Title=driver.getTitle();
		System.out.println("Title of the page is :  "+ Title);
		driver.findElement(By.linkText("Log Out")).click();
		driver.quit();
		
	}

}

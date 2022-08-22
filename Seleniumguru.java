package Gurudemo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Seleniumguru {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sasitharanb\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement fN = driver.findElement(By.name("firstName"));
		fN.sendKeys("sasitharan");
		String Text1 = driver.findElement(By.name("firstName")).getText();
		assertEquals(true, Text1.contains("sasitharan"));
		Thread.sleep(3000);

		WebElement lN = driver.findElement(By.name("lastName"));
		lN.sendKeys("B");
		String Text2 = driver.findElement(By.name("lastname")).getText();
		assertEquals(true, Text2.contains("B"));

		driver.findElement(By.name("phone")).sendKeys("9095978785");
		String Text3 = driver.findElement(By.name("phone")).getText();
		assertEquals(true, Text3.contains("9095978785"));

		driver.findElement(By.id("userName")).sendKeys("sasitharanb@maveric-system.com");
		String Text4 = driver.findElement(By.id("userName")).getText();
		assertEquals(true, Text4.contains("sasitharan@maveric-system.com"));

		driver.findElement(By.name("address1")).sendKeys("dlf,porur");
		String Text5 = driver.findElement(By.name("address1")).getText();
		assertEquals(true, Text5.contains("dlf,porur"));

		driver.findElement(By.name("city")).sendKeys("Chennai");
		String Text6 = driver.findElement(By.name("city")).getText();
		assertEquals(true, Text6.contains("Chennai"));

		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		String Text7 = driver.findElement(By.name("state")).getText();
		assertEquals(true, Text7.contains("Tamilnadu"));

		driver.findElement(By.name("postalCode")).sendKeys("600018");
		String Text8 = driver.findElement(By.name("postalCode")).getText();
		assertEquals(true, Text8.contains("600018"));

		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("AUSTRALIA");

		driver.findElement(By.id("email")).sendKeys("sasitharanb");
		String Text9 = driver.findElement(By.id("email")).getText();
		assertEquals(true, Text9.contains("sasitharanb"));
		driver.findElement(By.name("password")).sendKeys("sasi123");
		String Text10 = driver.findElement(By.name("password")).getText();
		assertEquals(true, Text10.contains("sasi123"));
		driver.findElement(By.name("confirmPassword")).sendKeys("sasi123");
		String Text11 = driver.findElement(By.name("confirmPassword")).getText();
		assertEquals(true, Text11.contains("sasi123"));
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();

		boolean displayed = driver.findElement(By.className("mouseOut")).isDisplayed();
		if (displayed)
			System.out.println("landed successfully");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"))
				.click();
		driver.findElement(By.name("userName")).sendKeys("sasitharanb");
		driver.findElement(By.name("password")).sendKeys("sasi123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		 File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        FileHandler.copy(scrFile, new File("screenshot.png"));
	        driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
		boolean displayed1 = driver.findElement(By.className("mouseOut")).isDisplayed();
		if (displayed1)
			System.out.println("Login successfully");
		

	}

}

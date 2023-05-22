package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\AppData\\Local\\Temp\\Rar$EX00.109\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[onclick*='phone']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".col-lg-9>div>div:nth-of-type(2)")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector(".container>div>ul>li:nth-of-type(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[onclick*='notebook']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Dell i7 8gb']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector(".container>div>ul>li:nth-of-type(4)")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Puja");
		driver.findElement(By.id("country")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("delhi");
		driver.findElement(By.id("card")).click();
		driver.findElement(By.id("card")).sendKeys("9874563211234569");
		driver.findElement(By.id("month")).click();
		driver.findElement(By.id("month")).sendKeys("09");
		driver.findElement(By.id("year")).click();
		driver.findElement(By.id("year")).sendKeys("2023");
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000); 
		
		
	}

}













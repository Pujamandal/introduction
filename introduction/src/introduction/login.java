package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\AppData\\Local\\Temp\\Rar$EX00.109\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='sign-username']")).click();
		driver.findElement(By.cssSelector("input[id='sign-username']")).sendKeys("rio12345");
		driver.findElement(By.cssSelector("input[type='password']")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rio12345");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).click();
		driver.findElement(By.id("loginusername")).sendKeys("rio12345");
		driver.findElement(By.cssSelector("input[id='loginpassword']")).click();
		driver.findElement(By.cssSelector("input[id='loginpassword']")).sendKeys("rio12345");
		driver.findElement(By.cssSelector("button[onclick*='logIn()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).click();
		driver.findElement(By.id("loginusername")).sendKeys("rio123");
		driver.findElement(By.cssSelector("input[id='loginpassword']")).click();
		driver.findElement(By.cssSelector("input[id='loginpassword']")).sendKeys("rio123456");
		driver.findElement(By.cssSelector("button[onclick*='logIn()']")).click();   

	}

}













package FirstTest;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {
	public static void main(String[] args)  {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.ebay.com/");

driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for implicit wait
//Waits: 1. Implicit wait 2. Explicit wait 3. Fluent wait - all are dynamic
//Implicit: applies to all web elements coz its global and tells web driver maximum wait time
//Explicit wait: tell web driver to halt execution until particular condition is met or maximum time has passed. only for those webelement where specified
//Fluent: tells web driver maximum wait timewhen searching for elements before throwing exception. looks for web element repeatdly at regular intervals
//unitl timeout happens. possible to set a default polling period
WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/a"));
Actions action = new Actions(driver);
action.moveToElement(element).perform();
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(2))
.withMessage("This is a custom message");// remove semicolon and comment in next step
//.ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();


//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));//Explicit wait
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
//driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();


	}

}





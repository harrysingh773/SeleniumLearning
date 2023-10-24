package FirstTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.salesforce.com/");

driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@aria-label='Start free trial: AI + Data + CRM = more sales and happier customers.']")).click();
Set<String> windowhandles =driver.getWindowHandles();
System.out.println(windowhandles);
Iterator<String> iterator= windowhandles.iterator();
String parentWindow= iterator.next();
String childWindow=iterator.next();
Thread.sleep(2000);

driver.switchTo().window(childWindow);

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("harry");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("singh");
driver.switchTo().window(parentWindow);



	}

}

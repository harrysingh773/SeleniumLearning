package FirstTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

driver.manage().window().maximize();
//driver.switchTo().frame(0);//by index
//driver.switchTo().frame("iframeResult");//by id or name
WebElement frame1 = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame1);
driver.findElement(By.xpath("/html/body/button")).click();

Alert alert = driver.switchTo().alert();
Thread.sleep(2000);
String alerttext = alert.getText();
System.out.println(alerttext);
Thread.sleep(2000);
//alert.accept();//to accept alert
alert.dismiss(); //to dismiss the alert
//driver.switchTo().alert().sendKeys("demo"); //to send a message



driver.switchTo().parentFrame();
System.out.println(driver.getTitle());

	}

}

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
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
driver.manage().window().maximize();
// Print Title of the page
JavascriptExecutor js = (JavascriptExecutor) driver;
String script = "return document.title;";
String title = (String) js.executeScript(script);
System.out.println(title);

//Switch to the frame
//driver.switchTo().frame(0);//by index
//driver.switchTo().frame("iframeResult");//by id or name
WebElement frame1 = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame1);
//Click button
js.executeScript("myFunction();");
Thread.sleep(2000);
//Accepting alert
driver.switchTo().alert().accept();
WebElement button =driver.findElement(By.xpath("/html/body/button"));

js.executeScript("arguments[0].style.border='3px solid red'",button);

//scroll the page
driver.navigate().to("https://www.w3schools.com/");
WebElement scroll = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
js.executeScript("arguments[0].scrollIntoView(true);", scroll);



	}

}

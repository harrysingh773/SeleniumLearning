package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");

driver.manage().window().maximize();
//driver.switchTo().frame(0);//by index
//driver.switchTo().frame("iframeResult");//by id or name
WebElement frame1 = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame1);
driver.findElement(By.xpath("/html/body/button")).click();

System.out.println(driver.getTitle());
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//*[@id=\"runbtn\"]")).click();
System.out.println(driver.getTitle());

	}

}

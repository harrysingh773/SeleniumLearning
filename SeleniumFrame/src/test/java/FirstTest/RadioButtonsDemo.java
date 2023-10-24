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

public class RadioButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
Thread.sleep(2000);
driver.manage().window().maximize();

WebElement radio1= driver.findElement(By.id("bookFlights"));
WebElement radio2= driver.findElement(By.id("redeemFlights"));

radio1.click();
System.out.println(radio1.isSelected());
System.out.println(radio2.isSelected());

List<WebElement> numberofradiobuttons = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
System.out.println(numberofradiobuttons.size());



	}

}

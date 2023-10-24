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

public class ResizableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://jqueryui.com/slider/#colorpicker");

driver.manage().window().maximize();
WebElement frame =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
driver.switchTo().frame(frame);

WebElement Redslider = driver.findElement(By.xpath("/html/body/div[1]/span"));
Actions action = new Actions(driver);
action.dragAndDropBy(Redslider, -15, 15).perform();

WebElement Greenslider = driver.findElement(By.xpath("/html/body/div[2]/span"));
action.dragAndDropBy(Greenslider, -15, 15).perform();

	}

}

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

public class AutomatedSliderDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://jqueryui.com/resizable/");

driver.manage().window().maximize();
WebElement frame =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
driver.switchTo().frame(frame);

WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
Actions action = new Actions(driver);
action.dragAndDropBy(element, 150, 150).perform();

	}

}

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

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.ebay.com/");

driver.manage().window().maximize();
WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[4]/a"));
Actions action = new Actions(driver);
action.moveToElement(element).perform();


	}

}

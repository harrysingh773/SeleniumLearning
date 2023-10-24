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

public class TextCompareKeyboardActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://extendsclass.com/text-compare.html");
WebElement sourcetext =driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div[1]/div[1]"));
Actions action = new Actions(driver);
action.keyDown(sourcetext, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

WebElement destinationtextarea =driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]"));
action.keyDown(destinationtextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}

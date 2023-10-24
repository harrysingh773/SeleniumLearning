package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
WebElement ddown = driver.findElement(By.id("multi-select"));
Select select = new Select(ddown);
select.selectByValue("Florida");
Thread.sleep(2000);
select.selectByIndex(3);
Thread.sleep(2000);
select.selectByVisibleText("Ohio");
Thread.sleep(2000);
List<WebElement> allitems = select.getAllSelectedOptions();
System.out.println(allitems.size());
select.deselectAll();
Thread.sleep(2000);
select.selectByValue("Florida");
Thread.sleep(2000);
select.selectByIndex(3);
Thread.sleep(2000);
select.selectByVisibleText("Ohio");
Thread.sleep(2000);
select.deselectByIndex(3);
Thread.sleep(2000);
List<WebElement> allitems1 = select.getAllSelectedOptions();
System.out.println(allitems1.size());


	}

}

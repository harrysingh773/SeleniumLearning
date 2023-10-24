package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.sugarcrm.com/request-demo/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//
//List<WebElement> alltags = driver.findElements(By.tagName("a"));
//System.out.println("Total tags are " + alltags.size());
//
//for (int i=0; i<alltags.size(); i++) {
//	System.out.println("All links on page are "+alltags.get(i).getAttribute("href"));
//	System.out.println("All links on page are "+alltags.get(i).getText());
//}


//driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
//driver.manage().window().maximize();
//List<WebElement> alltags = driver.findElements(By.tagName("option"));
//System.out.println("Total tags are " + alltags.size());
//for (int i=0; i<alltags.size(); i++) {
//System.out.println("All links on page are "+alltags.get(i).getAttribute("value"));
//
//}

driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
driver.manage().window().maximize();
List<WebElement> alltags = driver.findElements(By.tagName("select"));
System.out.println("Total tags are " + alltags.size());
for (int i=0; i<alltags.size(); i++) {
System.out.println("All links on page are "+alltags.get(i).getAttribute("option"));
}
}

	}

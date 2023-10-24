package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.united.com/en/us");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"bookFlightForm\"]/div[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"bookFlightForm\"]/div[1]/div[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"bookFlightForm\"]/div[1]/div[2]")).click();

//to scroll on the page
WebElement message = driver.findElement(By.xpath("//*[@id=\"hp-sdl-comp-76-30097\"]/div/div/div/div/h2"));
Actions actions =new Actions(driver);
actions.moveToElement(message);
actions.perform();

//to find out all checkboxes on the page
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}

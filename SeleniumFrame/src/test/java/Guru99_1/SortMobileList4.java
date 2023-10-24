//Compare 2 prices in list view and detail view

package Guru99_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Collections;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.EqualsMethod;

public class SortMobileList4 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://live.techpanda.org/");
System.out.println("The title is " + driver.getTitle());
driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button/span/span")).click();
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")).click();
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")).clear();
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")).sendKeys("1000");
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button/span/span")).click();
System.out.println("Error message is: " +driver.findElement(By.xpath("//span[contains(text(),'Some of the products cannot be ordered in requeste')]")).getText());
driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();

System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]")).getText());
	}
}

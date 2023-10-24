package Guru99_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortMobileList2 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://live.techpanda.org/");
System.out.println("The title is " + driver.getTitle());
driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
System.out.println("The title of this page is " + driver.getTitle());
WebElement ddown = driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
Select select = new Select(ddown);
select.selectByValue("http://live.techpanda.org/index.php/mobile.html?dir=asc&order=name");

List<WebElement> t =driver.findElements(By.xpath("//*[@class=\"product-info\"]/h2"));

List originalList = new ArrayList();


for(WebElement e:t) {
	originalList.add(e.getText()); 

}
System.out.println("Sorted by Name: " + originalList);

	}

}

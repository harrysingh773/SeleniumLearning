//if a dropdown is sorted or not

package Guru99_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortMobileList {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://live.techpanda.org/");
System.out.println("The title is " + driver.getTitle());
driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
System.out.println("The title of this page is " + driver.getTitle());
WebElement ddown = driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
Select select = new Select(ddown);

List originalList = new ArrayList();
List tempList = new ArrayList();
List<WebElement>Options=select.getOptions();

for(WebElement e:Options) {
	originalList.add(e.getText()); 
	tempList.add(e.getText()); 
}
System.out.println("Before sorting: " + originalList);
System.out.println("Before sorting " + tempList);
Collections.sort(tempList);
System.out.println("After sorting " + tempList);

if (tempList ==originalList) {
	System.out.println("dropdown is sorted");
	
}
else {
		System.out.println("dropdown is not sorted");
		
	}


	}

}

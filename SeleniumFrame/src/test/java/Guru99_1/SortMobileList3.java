//Compare 2 prices in list view and detail view

package Guru99_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.EqualsMethod;

public class SortMobileList3 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://live.techpanda.org/");
System.out.println("The title is " + driver.getTitle());
driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
String listprice = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();


System.out.println("list price is " +listprice);
driver.findElement(By.xpath("//*[@id=\"product-collection-image-1\"]")).click();
String detailprice =driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
System.out.println("detail price is " +detailprice);



if (listprice.equals(detailprice)) {
	System.out.println("Both prices are equal");
}else {
	System.out.println("Both prices are not equal");
}

	}
}

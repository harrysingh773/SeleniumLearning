package FirstTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import Utilities.ReadXLSdata2;

public class FirstScript2 extends BaseTest{
@Test(dataProviderClass=ReadXLSdata2.class,dataProvider="bvtdata")
public static void LoginTest(String username, String password) throws InterruptedException {
	
	System.out.println("Clicked Sucessfully");
	Thread.sleep(4000);
	driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
	driver.findElement(By.id(loc.getProperty("email_link"))).sendKeys(username);
	driver.findElement(By.id(loc.getProperty("nextbutton"))).click();
	Thread.sleep(4000);
	driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("Login_field"))).click();
	Thread.sleep(4000);
}

}

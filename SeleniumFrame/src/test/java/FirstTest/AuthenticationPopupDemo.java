package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopupDemo {
	public static String username="admin"; //Reading from external file XLS or CSV
	public static String password="admin"; //Reading from external file XLS or CSV

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");



	}

}

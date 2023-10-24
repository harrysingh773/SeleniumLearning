package FirstTest;

import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesfromFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("C:\\Users\\home\\eclipse-workspace\\SeleniumFrame\\src\\test\\resources\\ConfigFiles\\configuration.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputStream= new FileOutputStream("C:\\Users\\home\\eclipse-workspace\\SeleniumFrame\\src\\test\\resources\\ConfigFiles\\configuration.properties");
		properties.setProperty("testdata", "87686876");
		properties.store(outputStream, "This is customer data from TC2");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();




	}

}

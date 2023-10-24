package BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop = new Properties();
	public static FileReader fr1;
	public static Properties loc = new Properties();
	
	@BeforeMethod

public void setUp() throws IOException {
	if (driver==null) {
		System.out.println("The path is: "+ System.getProperty("user.dir"));
		fr=new FileReader(System.getProperty("user.dir")+"/src/test/resources/ConfigFiles/configuration.properties");
	prop.load(fr);
	fr1=new FileReader(System.getProperty("user.dir")+"/src/test/resources/ConfigFiles/locators.properties");
	loc.load(fr1);
	}
	if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(prop.getProperty("testUrl"));
	
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("safari")) {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get(prop.getProperty("testUrl"));
		
		}
}
@AfterMethod
public void tearDown() {
	driver.close();
	System.out.println("Tear down successful");
	
}

}

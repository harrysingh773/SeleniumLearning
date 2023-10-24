package FirstTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.asx.com.au/");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

driver.manage().window().maximize();

//Step 1 - Switch to frame which has that particular web table
//Step 2 - To get number of rows
//Step 3 - to get number of columns
//Step 4- For loop to iterate rows and columns and get text and print it
driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/nav/div/h5[2]")).click();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for implicit wait



driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[3]/div[1]/div/div/section/div/button/span")).click();


List<WebElement> rowElements =driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div[1]/div[1]/div[1]/div[2]/table[1]/tr"));


System.out.println(rowElements.size());
int rowsize =rowElements.size();

List<WebElement> ColumnElements =driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div[1]/div[1]/div[1]/div[2]/table[1]/tr[2]/td"));
System.out.println(ColumnElements.size());
int colsize =ColumnElements.size();

for (int i=1;i<=1;i++) {
	for (int j=1;j<=colsize;j++) {
		System.out.print(driver.findElement(
				By.xpath("//*[@id=\"home_top_twenty\"]/div[1]/div[1]/div[1]/div[2]/table[1]/tr[" + i + "]/th[" + j + "]"))
				.getText()+ "   ");
	}
	System.out.println();

for(int k=2;k<=rowsize;k++) {
	for (int l=1;l<=colsize;l++) {
		System.out.print(driver.findElement(
				By.xpath("//*[@id=\"home_top_twenty\"]/div[1]/div[1]/div[1]/div[2]/table[1]/tr[" + k + "]/td[" + l + "]"))
				.getText()+ "   ");
	}
	System.out.println();
}
}
	}

}

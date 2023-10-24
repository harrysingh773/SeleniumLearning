package LoyaltyLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {

	private static final boolean True = false;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.coach.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		WebElement iframe = driver.findElement(By.id("attentive_creative"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("closeIconContainer")));
		driver.findElement(By.id("closeIconContainer")).click();
		driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"registration-form-fname\"]")).sendKeys("Har");
driver.findElement(By.xpath("//*[@id=\"register\"]/form/div[2]/label")).sendKeys("jan");
driver.findElement(By.xpath("//*[@id=\"register\"]/form/div[3]/label")).sendKeys("har.jan@gmail.com");
driver.findElement(By.xpath("//*[@id=\"register\"]/form/div[4]/div[1]/label")).sendKeys("Coach@1234");
driver.findElement(By.xpath("//*[@id=\"register\"]/form/div[5]/label")).sendKeys("555-556-6585");

WebElement radio1=driver.findElement(By.xpath("//*[@id=\"sms-optin\"]"));
WebElement radio2=driver.findElement(By.xpath("//label[@for='add-to-emaillist']"));
radio1.isSelected();

System.out.println(radio1.isSelected());
System.out.println(radio2.isSelected());


boolean checkbox1 = radio1.isSelected();
boolean checkbox2 = radio2.isSelected();

if(checkbox1=True) {
radio1.click();
System.out.println(radio1.isSelected());
}

else {
	System.out.println(radio1.isSelected());
};

if(checkbox2=True) {
radio2.click();
System.out.println(radio2.isSelected());
}

else {
	System.out.println(radio2.isSelected());
};

	}

}

package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/createaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("harry");
		driver.findElement(By.name("lastName")).sendKeys("singh");
		driver.findElement(By.name("lastName")).clear();
		System.out.println(driver.findElement(By.name("firstName")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).getSize());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).isSelected());
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		//By genderlocator = RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@id='day']"));
		//System.out.println(genderlocator);
		
		System.out.println(driver.findElement(By.xpath("//select[@id='month']")));
		WebElement ddown =driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(ddown);
		//select.selectByValue("2");
		//System.out.println(select);
		select.selectByVisibleText("April");
		System.out.println(select);
		select.selectByIndex(4);
		System.out.println(select);

	}

}

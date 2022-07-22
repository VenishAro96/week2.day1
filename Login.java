package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args)  {
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
  driver.findElement(By.id("password")).sendKeys("crmsfa");
  driver.findElement(By.className("decorativeSubmit")).click();
  // to verify
  WebElement logot = driver.findElement(By.className("decorativeSubmit"));
  String logout = logot.getDomAttribute("type");
  if(logout.equals("submit")) {
	  System.out.println("logged in successful");
	}
  driver.close();
}
}
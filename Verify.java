package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Orion");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venish");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arockiasamy");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Michael");
		  driver.findElement(By.name("departmentName")).sendKeys("Testing");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf is good");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("venisharo96@gmail.com");
		  WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  WebElement indus = driver.findElement(By.id("createLeadForm_industryEnumId"));
		  Select s = new Select(state);
		  Select i = new Select(indus);
		  s.selectByVisibleText("New York ");
		  i.selectByIndex(4);
		  driver.findElement(By.className("smallSubmit")).click();
		  String title = driver.getTitle();
		  System.out.println(title);
		  if(title.contains("View Lead")) {
			  System.out.println("login Successful");
		  }
		  driver.close();
	}

}

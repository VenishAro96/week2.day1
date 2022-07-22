package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		WebElement compname = driver.findElement(By.id("createLeadForm_companyName"));
		compname.sendKeys("Orion");
		WebElement f1name = driver.findElement(By.id("createLeadForm_firstName"));
		f1name.sendKeys("Venish");
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
		WebElement sub = driver.findElement(By.className("smallSubmit"));
		sub.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement cname = driver.findElement(By.id("createLeadForm_companyName"));
		cname.clear();
		cname.sendKeys("Orion Innovation");
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.clear();
		fname.sendKeys("Michael Venish Arockiasamy");
		WebElement sub1 = driver.findElement(By.className("smallSubmit"));
		sub1.click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
	}

}

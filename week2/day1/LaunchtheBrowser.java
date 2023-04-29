package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchtheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// webDriverManager.chromedriver.setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(1000);
	
	//driver.close();
	driver.findElement(By.linkText(
            "CRM/SFA"));
	driver.findElement(By.linkText("Leads"));
	driver.findElement(By.linkText("Create Lead"));
	
	
	
	}

}

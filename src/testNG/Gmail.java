package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
	
	public WebDriver driver;
	
  @Test(priority = 1)
  public void login() {
	  
	  driver.findElement(By.id("identifierId")).sendKeys("ramya@gmail.com");
  }
  
  
  @Test(priority = 2)
  public void createaccount() {
	  
	  driver.findElement(By.id("identifierId")).sendKeys("ramya@gmail.com");
  }
  
  @Test(priority = 3)
  public void logout() {
	  
	  driver.findElement(By.id("identifierId")).sendKeys("ramya@gmail.com");
  }
  
  @BeforeTest
  public void openurl() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charvik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}

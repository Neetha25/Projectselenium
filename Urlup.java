package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public void class notes

{


	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\chrome\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
	        driver.close();  
	        
	        WebElement x=driver.findelement(By.name());
	        x.sendKeys("Selenium Topic");
	        x.sendKeys("Keys.Enter");
	        

}
//driver.findElement(By.id("lst-ib")).sendKeys("Selenium"); ->find webelement by 'id'

//driver.findElement(By.name("btnK")).click();


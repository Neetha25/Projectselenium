package Chrome;
import org.openqa.selenium.WebDriver;


public class TestOne 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chrome\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
				driver.get("https://www.google.com");
				
				//driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
				WebElement x=driver.findelement(By.name("q"));
				
				//driver.findElement(By.name("btnK")).click();
				
		        x.sendKeys("Selenium Topic");
		        x.sendKeys("Keys.Enter");
		        driver.close();  

	
	}

}

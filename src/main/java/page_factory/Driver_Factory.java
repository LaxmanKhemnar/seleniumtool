package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver_Factory 
{
	static WebDriver driver;
	public static  WebDriver intiBrowser(String browerName)
	{
		 if(browerName.equals("chrome")) {
			 driver=new ChromeDriver();
		 }
		 else
		 {
			 driver=new EdgeDriver();
		 }
		 return driver;
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
}

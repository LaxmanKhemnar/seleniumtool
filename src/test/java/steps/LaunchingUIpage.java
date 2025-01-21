package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchingUIpage
{
	 WebDriver driver;
	    List<String> links = new ArrayList<>();
	    String filepath="C:\\Users\\vivek.nityo\\eclipse-workspace\\HealthMonitoring\\Daily MIS 2024 2 (version 2).xlsx";
	@Given("I open the browser")
	public void i_open_the_browser() {
		driver = new ChromeDriver();
	   
	}

	@When("I read the links from {string}")
	//public void i_read_the_links_from(String string) {
	
		public void i_read_the_links_from(String filePath) throws IOException {
//	        FileInputStream file = new FileInputStream(filePath);
//	        arr
//	       // Workbook workbook = new XSSFWorkbook(file);
//	        WorkbookFactory.create(file).getSheet("SEM").getSheetName();
//	      //  Sheet sheet = workbook.getSheetAt(0);
//
//	        for (Row row : SEM) {
//	            for (int i = 0; i < row.getLastCellNum(); i++) {
//	                String cellValue = row.getCell(i).getStringCellValue();
//	                if (cellValue.startsWith("https")) {
//	                    links.add(cellValue);
//	                }
//	            }
//	        }
//
//	        //workbook.close();
//	        file.close();
	    }
	

	@Then("I open each link in the browser")
	public void i_open_each_link_in_the_browser() {
		for (String link : links) {
            driver.get(link);
            // Add any additional actions or assertions here
        }
        driver.quit();
	   
	}

}

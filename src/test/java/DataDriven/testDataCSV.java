package DataDriven;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testDataCSV {

	static WebDriver driver;
	
	public static void main(String[] args) {
		 String csvFile = "C:\\Users\\Admin\\Documents\\testData.csv"; // Step 1
	      try {
		            CSVReader reader = new CSVReader(new FileReader(csvFile)); // Step 2
		            String[] line;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	      reader.readNext(); // Step 4: Skip header row

          while ((line = reader.readNext()) != null) { // Step 5
              String username = line[0];
              String password = line[1];

              driver.get("https://www.saucedemo.com/v1/");
              driver.findElement(By.id("user-name")).sendKeys(username); // Step 7
              driver.findElement(By.id("password")).sendKeys(password);
              driver.findElement(By.id("login-button")).click();

              // Step 8: Validate result (dummy example - you’ll replace with real logic)
              boolean isLoginSuccess = driver.getCurrentUrl().contains("inventory");

              if (isLoginSuccess) {
                  System.out.println("Test Passed for user: " + username);
              } else {
                  System.out.println("Test Failed for user: " + username);
              }
          }

          driver.quit(); // Step 9
          reader.close();

      } catch (Exception e) {
          e.printStackTrace();
	      }
	}

}

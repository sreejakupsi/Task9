package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9Question1 {

	public static void main(String[] args) {
		//Opens the Firefox browser
		WebDriver driver = new FirefoxDriver();
		//Navigates to the url
		driver.get("https://www.google.com/");
		//Maximise the page
		driver.manage().window().maximize();
		//Prints the url
		String url=driver.getCurrentUrl();
		System.out.println("The URL of the website: "+url);
		//Reloads the page
		driver.navigate().refresh();
		//Close the browser
		driver.quit();
		
	}

}

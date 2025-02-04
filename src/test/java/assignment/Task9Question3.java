package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task9Question3 {

	public static void main(String[] args) {
	//Opens the chrome browser
	WebDriver driver=new ChromeDriver();
	//Opens the url
	driver.get("https://www.wikipedia.org/");
	//Maximise the page
	driver.manage().window().maximize();
	//Search for query 
	WebElement search=driver.findElement(By.name("search"));
	search.sendKeys("Artificial Intelligence");
	search.submit();
	//Click on history
	 WebElement historyLink = driver.findElement(By.cssSelector("[title='History of artificial intelligence']"));
	historyLink.click();
	//Title of the section
	String pageTitle=driver.getTitle();
	System.out.println("The title of the section:"+pageTitle);
	//Close the browser
	driver.quit();
	}

}

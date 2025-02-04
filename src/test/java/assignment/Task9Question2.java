package assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task9Question2 {

	public static void main(String[] args) {
		//Opens the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url
		driver.get("https://www.demoblaze.com/");
		//Maximise the browser
		driver.manage().window().maximize();
		//Check the title
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("STORE")){
				System.out.println("Page landed on the correct website");
		}
		else {
			System.out.println("Page not landed on correct website");
		}
		//Close the browser
		driver.quit();
		
	}

}

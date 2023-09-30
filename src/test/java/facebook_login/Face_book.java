package facebook_login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_book {

	public static void main(String[] args) throws Exception {
		
// OPEN CHROME DRIVER //
		WebDriver driver = new ChromeDriver();
		
// TYPE FACEBOOK URL IN BROWSER //
		driver.get("https://www.facebook.com/");
		
// TYPE VALID EMAIL //
		driver.findElement(By.name("email")).sendKeys("vaishnavi6299@gmail.com");
		
// TYPE INVALID PASSWORD //
		driver.findElement(By.name("pass")).sendKeys("Vaishnavi@1111");
		
// CLICK ON LOGIN BUTTON //
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Tryanotherway  = driver.findElement(By.linkText("Try another way"));
		if (Tryanotherway.isDisplayed()) {
			System.out.println("tc_01 passed");
			System.out.println("Try another way is Displayed as Expected");
		} else {
			System.out.println("Try another way  object is not Displayed");
			System.out.println("TC_01 passed");

// TO CLOSE THE CURRENT BROWSER //
//		driver.quit();
	}
}
}
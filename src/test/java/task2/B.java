package task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Maven-Workspace\\GitDay1Task1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		driver.quit();
		driver.close();
	}
}

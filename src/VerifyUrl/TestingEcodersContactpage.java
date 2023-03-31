package VerifyUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcodersContactpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\K NageshKumar\\eclipse-workspace\\testing_ecoders\\alljarsfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://127.0.0.1:5000/contact");
		Thread.sleep(1000);
		String titleofpage=driver.getTitle();
		System.out.println(titleofpage);
		String urlofpage=driver.getCurrentUrl();
		System.out.println(urlofpage);
		String sourceofpage=driver.getPageSource();
		System.out.println(sourceofpage);
		
		String expectedurl="http://127.0.0.1:5000/contact";
		
		if(expectedurl.equals(urlofpage)) {
			System.out.println("url matched");
			
		}
		else {
			System.out.println("url not matched");
		}
		
		driver.quit();
		
	}
}

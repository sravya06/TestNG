package Test1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NG1 {
  @Test
  public void f() {
	  

		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver c1=new ChromeDriver();
		c1.get("http://www.google.com");

  }
}

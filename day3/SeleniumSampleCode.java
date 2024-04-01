package week2.day3;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumSampleCode {

	public static void main(String[] args) {
		//Launch Chrome Browser
		//ChromeDriver driver = new ChromeDriver();
		//launch edge browser
		EdgeDriver driver=new EdgeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//Launch application url
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}

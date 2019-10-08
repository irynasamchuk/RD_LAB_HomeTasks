package task6_ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6_ChromeDriver {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }
}

package task7_FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class FacebookLogin {

    public static void main(String[] args) {
        facebookLogin();
    }

    public static void facebookLogin() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys("facebook");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@name='btnK']"));
        searchButton.click();
        WebElement facebookLink = driver.findElement(By.xpath("//div[@class='ellip']"));
        facebookLink.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://uk-ua.facebook.com/");
        WebElement loginInput = driver.findElement(By.xpath("//input[@name= 'email']"));
        loginInput.sendKeys("badlogin");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name= 'pass']"));
        passwordInput.sendKeys("badpassword");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type= 'submit']"));
        loginButton.click();
        WebElement error = driver.findElement(By.xpath("//div[@class= '_4rbf _53ij']"));
        System.out.println(error.getText());
        if(error.getText().equals("Указана електронна адреса (або номер телефону) не пов'язана з жодним обліковим записом. Створіть обліковий запис."))
            System.out.println("Test passed");
            else
            System.out.println("Test failed");
        driver.quit();
    }
}

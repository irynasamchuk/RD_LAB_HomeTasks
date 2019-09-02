import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import task8_PageObject.FacebookLoginErrorPage;
import task8_PageObject.FacebookLoginPage;
import task8_PageObject.GooglePage;

import java.util.concurrent.TimeUnit;

public class FacebookLoginTest{
   static WebDriver driver;

   public static WebDriver getDriver(){
       if(driver == null){
           System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
           driver = new ChromeDriver();
       }
       return driver;
   }

   public static void quiteDriver(){
       driver.quit();
       driver = null;
   }

   public static void wrongPasswordTest(){
       GooglePage googleSearch = new GooglePage(getDriver());
       googleSearch.searchFacebook("facebook");
       googleSearch.getFacebookLink().click();
       FacebookLoginPage facebookLoginPage = new FacebookLoginPage(getDriver());
       facebookLoginPage.loginProcess("test@gmail.com", "12456654");
       FacebookLoginErrorPage facebookLoginErrorPage = new FacebookLoginErrorPage(getDriver());
       facebookLoginErrorPage.getErrorMessage();
       WebElement message =  facebookLoginErrorPage.getErrorMessage();
       String errorMessageText = message.getText();
       if (errorMessageText.equals("Ви ввели неправильний пароль. Забули пароль?")) {
           System.out.printf("Test passed");
       } else {
           System.out.printf("Test failed with error message" +errorMessageText);
       }
       quiteDriver();
   }

   public static void wrongLoginTest(){
       GooglePage googlePage = new GooglePage(getDriver());
       googlePage.searchFacebook("facebook");
       googlePage.getFacebookLink().click();
       FacebookLoginPage facebookLoginPage = new FacebookLoginPage(getDriver());
       facebookLoginPage.loginProcess("+3806784544","1233424");
       FacebookLoginErrorPage facebookLoginErrorPage = new FacebookLoginErrorPage(getDriver());
       WebElement message = facebookLoginErrorPage.getErrorMessage();
       String errorMessageText = message.getText();
       if(errorMessageText.equals("Указана електронна адреса (або номер телефону) не пов'язана з жодним обліковим записом. Створіть обліковий запис.")){
           System.out.println("Test passed");
       } else System.out.println("Test failed with error message: " +errorMessageText);
       quiteDriver();
   }

    public static void main(String[] args) {
        wrongPasswordTest();
        wrongLoginTest();
    }
}

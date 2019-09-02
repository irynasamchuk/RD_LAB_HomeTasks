package task8_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
    private WebDriver driver;
    private By searchField = By.xpath("//input[@name='q']");
   // private By searchButton = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");
    private By facebookLink = By.xpath("//div[@class='ellip']");

    public GooglePage(WebDriver driver){
        this.driver = driver;
        driver.get("https://www.google.com/");
    }

    public WebElement getSearchField(){
        return driver.findElement(searchField);
    }

//    public  WebElement getSearchButton(){
//        return driver.findElement(searchButton);
//    }

    public WebElement getFacebookLink(){
        return driver.findElement(facebookLink);
    }

    public void searchFacebook(String seachQuery){
        getSearchField().sendKeys(seachQuery);
        getSearchField().sendKeys(Keys.ENTER);
       // getSearchButton().click();
    }
}

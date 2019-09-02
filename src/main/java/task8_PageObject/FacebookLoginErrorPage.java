package task8_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookLoginErrorPage {
    private WebDriver driver;
    private By errorMessage = By.xpath("//div[@class= '_4rbf _53ij']");

    public FacebookLoginErrorPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessage(){
        return driver.findElement(errorMessage);
    }
}

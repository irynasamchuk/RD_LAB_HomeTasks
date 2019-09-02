package task8_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
    private WebDriver driver;
    private By loginInput = By.xpath("//input[@name= 'email']");
    private By passwordInput = By.xpath("//input[@name= 'pass']");
    private By submitButton = By.xpath("//input[@type='submit']");

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginInput(){
        return driver.findElement(loginInput);
    }

    public WebElement getPasswordInput(){
        return driver.findElement(passwordInput);
    }

    public WebElement getSubmitButton(){
        return driver.findElement(submitButton);
    }

    public void loginProcess(String login, String password){
        getLoginInput().sendKeys(login);
        getPasswordInput().sendKeys(password);
        getSubmitButton().click();
    }
}

package homeworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id="user-name")
    private WebElement usernameInput;

    @FindBy(name="password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    public void clickLogin() {
        loginButton.click();
    }
    public boolean isUsernameInputDisplayed() {
        return usernameInput.isDisplayed();
    }

    public boolean isPasswordInputDisplayed() {
        return passwordInput.isDisplayed();
    }


}

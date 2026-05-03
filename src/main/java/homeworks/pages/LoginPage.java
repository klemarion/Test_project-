package homeworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    private WebElement usernameInput;

    @FindBy(name="password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        }

    public LoginPage enterUsername(String username) {
        type(usernameInput, username);
        return this;
    }
    public LoginPage enterPassword(String password) {
        type(passwordInput, password);
        return this;
    }
    public LoginPage clickLogin() {
        click(loginButton);
            return this;
    }
    public boolean isUsernameInputDisplayed() {
        waitForVisibility(usernameInput);
        return usernameInput.isDisplayed();
    }
    public boolean isPasswordInputDisplayed() {
        waitForVisibility(passwordInput);
        return passwordInput.isDisplayed();
    }
    public boolean isLoginButtonDisplayed() {
        waitForVisibility(loginButton);
        return loginButton.isDisplayed();
    }
    public boolean isLoginPageOpened() {
        return (isUsernameInputDisplayed() && isPasswordInputDisplayed() && isLoginButtonDisplayed());
    }
}

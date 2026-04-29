package homeworks.tests;

import homeworks.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class LoginTests_Data_ProviderLocators {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }
    @Test
    public void  checkTitle(){
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Swag Labs"));

        System.out.println("Actual title: " + title);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(loginPage.isUsernameInputDisplayed(), "Username field is not displayed");
        softAssert.assertTrue(loginPage.isPasswordInputDisplayed(), "Password field is not displayed");

        softAssert.assertAll();

    } @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }

    @Test (dataProvider = "loginData")
    public void loginForm(String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

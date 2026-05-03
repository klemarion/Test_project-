package homeworks.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest_locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        checkTitle(driver);
        checkLocators(driver);

        driver.quit();
    }

    public static void checkTitle(WebDriver driver) {
        String title = driver.getTitle();
        boolean result = title.contains("Swag Labs");
        System.out.println("Title contains 'Swag Labs': " + result);
    }

    public static void checkLocators(WebDriver driver) {
        List<WebElement> usernameById = driver.findElements(By.id("user-name"));
        if (!usernameById.isEmpty()) {
            System.out.println("Username field found by ID");
        }

        List<WebElement> logoByClassName = driver.findElements(By.className("login_logo"));
        if (!logoByClassName.isEmpty()) {
            System.out.println("Swag Labs logo found by ClassName");
        }

        List<WebElement> loginButtonByCss = driver.findElements(By.cssSelector("input[data-test='login-button']"));
        if (!loginButtonByCss.isEmpty()) {
            System.out.println("Login button found by CSS Selector");
        }

        List<WebElement> logoByXpath = driver.findElements(By.xpath("//div[text()='Swag Labs']"));
        if (!logoByXpath.isEmpty()) {
            System.out.println("Swag Labs logo found by XPath");
        }
    }
}

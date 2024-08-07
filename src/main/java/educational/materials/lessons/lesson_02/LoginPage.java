package educational.materials.lessons.lesson_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriverWait wait;

    @FindBy(css="form#login input[type='text']")
    private WebElement usernameField;

    @FindBy(css="form#login input[type='password']")
    private WebElement passwordField;

    @FindBy(css="form#login button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void login(String username, String password) {}

    public void typeUsernameInField(String username) {}

    public void typePasswordInField(String password) {}

    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
    }
}

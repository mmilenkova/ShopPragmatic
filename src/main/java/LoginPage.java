import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "input-username") //Page factory, който е вграден в selenium - в полетата да можем да запазим елемнетите не само локаторите. Той рабпто с анотация FindBy., който очаква параметри.
    private static WebElement usernameInputField;//в променливата WebElement ще пази елемнт, който е локира с (id - в конкретния случай)

    @FindBy(id = "input-password")
    private static WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    private static WebElement loginButton;

    private static String url = "https://shop.pragmatic.bg/admin/";

    static {
        PageFactory.initElements(Browser.getDriver(), LoginPage.class);
    }

    public static void goTo() {
        Browser.getDriver().get(url);
    }

    public static void writeInTheUsernameInputField(String username) {
        usernameInputField.sendKeys(username);
    }

    public static void writeInThePasswordInputField(String password) {
        passwordInputField.sendKeys(password);
    }

    public static void clickTheLoginButton() {
        loginButton.click();
    }
}

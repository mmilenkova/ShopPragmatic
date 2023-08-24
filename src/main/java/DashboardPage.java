import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {

    @FindBy(xpath = "//*[@class='fa fa-sign-out']/ ..")
    private static WebElement logoutButton;

    static {
        PageFactory.initElements(Browser.getDriver(), DashboardPage.class);
    }

    public static void verifyPresenceOfLogoutButton() {
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}

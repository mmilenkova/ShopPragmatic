import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReturns {

    @FindBy (css = "a[href$='44']")
    private static WebElement editID44Button;

    static {
        PageFactory.initElements(Browser.getDriver(),ProductReturns.class);
    }

    public static void clickEditID44Button() {
        editID44Button.click();
    }

}

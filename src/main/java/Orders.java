import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {

    @FindBy (css = "a[href$='page=2']")
    private static WebElement page2;
    @FindBy(css = "a[href$='1083&page=2']")
    private static WebElement view;

    static {
        PageFactory.initElements(Browser.getDriver(),Orders.class);
    }

    public static void clickButtonPage2() {
        page2.click();
    }
    public static void clickViewButton1083() {
        view.click();
    }

}

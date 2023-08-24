import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Navigate {
    @FindBy(id = "navigation")
    private static WebElement navigation;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart fw']/ ..")
    private static WebElement sales;

    @FindBy(css = "#collapse4>li>a")
    private static WebElement order;

    @FindBy(xpath = "//*[@id='collapse4']//li[3]/a")
    private static WebElement returns;

    static {
        PageFactory.initElements(Browser.getDriver(),Navigate.class);
    }

    public static void clickTheSalesMenu() {
        sales.click();
    }

    public static void clickTheOrderMenu() {
        order.click();
    }

    public static void clickTheReturnMenu() {
        returns.click();
    }


}

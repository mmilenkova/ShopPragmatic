import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Order1083 {
  @FindBy(id = "input-order-status")
    private static WebElement orderStatus;

  @FindBy(id = "button-history")
  private static WebElement buttonHistory;

  @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
  private static WebElement success;

  static {
      PageFactory.initElements(Browser.getDriver(),Order1083.class);
  }

  public static void setOrderStatus() {
      orderStatus.sendKeys("Complete");
  }

  public static void clickButtonAddHistory() {
      buttonHistory.click();
  }

  public static void successModifiedOrders() {
      Assert.assertTrue(success.isDisplayed());
  }

}

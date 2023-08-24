import org.testng.annotations.*;

public class LoginPageTest {

    @BeforeSuite
    public void setup() {
        Browser.setupDriver();
    }

    @AfterSuite
    public void tearDown() {
        Browser.quitDriver();
    }

    @Test
    public void loginTest() {
        LoginPage.goTo();
        LoginPage.writeInTheUsernameInputField("admin");
        LoginPage.writeInThePasswordInputField("parola123!");
        LoginPage.clickTheLoginButton();
        DashboardPage.verifyPresenceOfLogoutButton();

    }

    @Test
    public void modifiedOrdersTest() {
        LoginPage.goTo();
        LoginPage.writeInTheUsernameInputField("admin");
        LoginPage.writeInThePasswordInputField("parola123!");
        LoginPage.clickTheLoginButton();
        Navigate.clickTheSalesMenu();
        Navigate.clickTheOrderMenu();
        Orders.clickButtonPage2();
        Orders.clickViewButton1083();
        Order1083.setOrderStatus();
        Order1083.clickButtonAddHistory();
        Order1083.successModifiedOrders();
    }

    @Test
    public void goToProductReturnsTest() {
        LoginPage.goTo();
        LoginPage.writeInTheUsernameInputField("admin");
        LoginPage.writeInThePasswordInputField("parola123!");
        LoginPage.clickTheLoginButton();
        Navigate.clickTheSalesMenu();
        Navigate.clickTheReturnMenu();
        ProductReturns.clickEditID44Button();
        ReturnProductId44.viewReturnProductId44();
    }

    @Test
    public void ModifiedProductReturnsTest() {
        LoginPage.goTo();
        LoginPage.writeInTheUsernameInputField("admin");
        LoginPage.writeInThePasswordInputField("parola123!");
        LoginPage.clickTheLoginButton();
        Navigate.clickTheSalesMenu();
        Navigate.clickTheReturnMenu();
        ProductReturns.clickEditID44Button();
        ReturnProductId44.selectReturnActionDropDown();
        ReturnProductId44.clickSaveButton();
        ReturnProductId44.viewTextSuccessModified();
    }

}

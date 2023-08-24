import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ReturnProductId44 {
//    @FindBy (css = "#tab-history")
//    private static WebElement tabHistory;

    @FindBy (css = "#tab-general")
    private static WebElement tabGeneral;

    @FindBy (id = "input-return-action")
    private static WebElement returnActionDropDown;

    @FindBy (xpath = "//*[@class='fa fa-save']/ ..")
    private static WebElement saveButton;

    @FindBy (xpath = "//*[@class='alert alert-success alert-dismissible']/..")
    private static WebElement textModifiedReturns;

    static {
        PageFactory.initElements(Browser.getDriver(),ReturnProductId44.class);
    }

//    public static void clickTabHistory() {
//        tabHistory.click();
//    }

    public static void selectReturnActionDropDown() {
        Select returnSelect = new Select (returnActionDropDown);
        returnSelect.selectByValue("3");
    }

    public static void clickSaveButton(){
        saveButton.click();
    }

    public static void viewReturnProductId44() {
        Assert.assertTrue(tabGeneral.isDisplayed());
    }

    public static void viewTextSuccessModified () {
        Assert.assertTrue(textModifiedReturns.isDisplayed());
    }

}

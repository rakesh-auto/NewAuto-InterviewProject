package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utils.WebElementUtil;

public class SwagPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Swag Labs']")
    private WebElement textSwagPage;

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement textProduct;

    public SwagPage(){
        PageFactory.initElements(driver,this );
    }

    public String swagText(){
        return WebElementUtil.getTextOfElement(textSwagPage);
    }

    public String swagProductText(){
        return WebElementUtil.getTextOfElement(textProduct);
    }





}

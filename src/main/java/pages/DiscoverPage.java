package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.WebTestBase;
import utils.WebElementUtil;

public class DiscoverPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Campos Superior Blend']")
    private WebElement blendProduct;

   public DiscoverPage(){super();
   }

   public String verifyPage() {
     return   WebElementUtil.getTextOfElement(blendProduct);
   }

}

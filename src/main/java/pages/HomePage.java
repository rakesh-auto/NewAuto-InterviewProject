package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utils.WebDriverUtil;

public class HomePage extends WebTestBase {

   @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    private WebElement closeAdd;

    @FindBy(xpath = "(//a[text()='SHOP THE RANGE'])[1]")
    private WebElement discoverMoreBtn;

    @FindBy(xpath = "//button[text()=' Login ']")
     private WebElement submitBtn;

    public HomePage(){
        PageFactory.initElements(driver,this );

    }

   public void addClose(){
        WebDriverUtil.clickOnElement(closeAdd);
    }

    public void setDiscoverMoreBtn(){
        WebDriverUtil.clickOnElement(discoverMoreBtn);
    }





}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utils.WebDriverUtil;

import static testBase.WebTestBase.driver;

public class LoginPage extends WebTestBase {

    @FindBy(id="user-name")
    private WebElement LoginUserName;

    @FindBy(id = "password")
    private WebElement loginPassword;

    @FindBy(xpath = "//input[@name='login-button']")
    private WebElement submitBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this );

    }

    public void login(String userName,String password){
        WebDriverUtil.sendKeyElement(LoginUserName,userName);
        WebDriverUtil.sendKeyElement(loginPassword,password);

    }
    public void setSubmitBtn(){
        WebDriverUtil.clickOnElement(submitBtn);
}

public void setClick(){
    WebDriverUtil.click(submitBtn);
}




}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.WebTestBase;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {

    public static final long IMPLICIT_WAIT=20;
    public static final long PAGE_LOAD_TIMEOUT_WAIT=20;

    public static final long EXPLICIT_WAIT=30;

    public static void clickOnElement(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeyElement(WebElement element,String text) {
        element.sendKeys(text);
    }
    public static void click(WebElement element){
        element.click();
    }


}

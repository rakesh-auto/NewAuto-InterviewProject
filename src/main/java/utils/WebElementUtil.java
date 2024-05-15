package utils;

import org.openqa.selenium.WebElement;

public class WebElementUtil {

    public  static  String getTextOfElement(WebElement element) {           //for get text return type is string
        return element.getText();
    }
}

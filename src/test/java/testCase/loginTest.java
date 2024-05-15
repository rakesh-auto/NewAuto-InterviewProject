package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DiscoverPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SwagPage;
import testBase.WebTestBase;

public class loginTest  extends WebTestBase{

        HomePage homePage;
        LoginPage loginPage;
        SoftAssert softAssert;
        SwagPage swagPage;
        DiscoverPage discoverPage;

          loginTest(){
            super();
        }

        @BeforeMethod
        public void preBrowser(){
            initialization();
            homePage =new HomePage();
            loginPage=new LoginPage();
            swagPage=new SwagPage();

        }
        @Test(description = "verify the login Page With Valid Email Password")
        public void tc(){
         softAssert=new SoftAssert();
          loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
         // loginPage.setSubmitBtn();
          softAssert.assertEquals(swagPage.swagText(),"Swag Labs");
          softAssert.assertAll();

        }

    @Test(description = "verify the login Page With inValid Email  and Password")
    public void tc02(){
        softAssert=new SoftAssert();
        loginPage.login(prop.getProperty("invalidUser"),prop.getProperty("password"));
        loginPage.setSubmitBtn();
       // loginPage.setClick();
        softAssert.assertEquals(swagPage.swagProductText(),"Swag Labs");
        softAssert.assertAll();

    }
    @Test(description = "verify the login Page With inValid Email  and Password")
    public void tc03() {
    }
    }

    }

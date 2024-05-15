package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DiscoverPage;
import pages.HomePage;
import testBase.WebTestBase;

public class HomePageTest extends WebTestBase {
    HomePage homePage;
    SoftAssert softAssert;
    DiscoverPage discoverPage;

    HomePageTest(){
        super();
    }

    @BeforeMethod
        public void preBrowser(){
             initialization();
             homePage =new HomePage();
    }
    @Test
    public void tc(){
        System.out.println("i am execute");
         /*softAssert=new SoftAssert();
            homePage.addClose();
            homePage.setDiscoverMoreBtn();
        softAssert.assertEquals(discoverPage.verifyPage(),"Campos Superior Blend");
        softAssert.assertAll();*/
    }


    }



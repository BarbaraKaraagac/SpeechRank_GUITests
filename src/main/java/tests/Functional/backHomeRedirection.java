package tests.Functional;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.HomePage;
import tests.TestBase;

import static navigation.ApplicationURLs.APPLICATION_URL;
import static org.testng.AssertJUnit.assertEquals;

//This test checks an user's login with correct credentials defined in a LoginPage class

public class backHomeRedirection extends TestBase {

   @Test
   @Severity(SeverityLevel.CRITICAL)
   @Description ("The purpose of this test is to verify the correctness of a redirection to /n"
           +"the home page via Speech Rank logo button")

  public void backHomeRedirection(){

       HomePage homePage = new HomePage();
       DriverUtils.navigateToPage(APPLICATION_URL+"conference/11");

        String header = homePage.goHome();
        assertEquals(header, "Choose conference to display details");
    }

}
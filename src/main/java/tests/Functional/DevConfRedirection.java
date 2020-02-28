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

public class DevConfRedirection extends TestBase {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description ("The purpose of this test is to verify the correctness of a redirection to /n"
            +"the DevConf page")

    public void backHomeRedirection() {

        HomePage homePage = new HomePage();
        DriverUtils.navigateToPage(APPLICATION_URL);

        String title = homePage.goDevConf();
        assertEquals(title, "DevConf presentation list");
    } }


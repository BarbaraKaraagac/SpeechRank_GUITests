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

public class ImportCorrectness extends TestBase {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description ("The purpose of this test is to verify the correctness an Import of conferences")

    public void backHomeRedirection() {

        HomePage homePage = new HomePage();
        DriverUtils.navigateToPage(APPLICATION_URL);

        String conferenceTitle = homePage.Import();
        assertEquals(conferenceTitle, "Boiling Frogs 2019 - Tomasz Kaczmarzyk - The Lasagne Industry");
    } }


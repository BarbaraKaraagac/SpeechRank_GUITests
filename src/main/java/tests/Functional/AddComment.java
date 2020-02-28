package tests.Functional;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import page.objects.Confitura2018;
import page.objects.HomePage;
import tests.TestBase;

import static navigation.ApplicationURLs.APPLICATION_URL;
import static org.testng.AssertJUnit.assertEquals;

public class AddComment extends TestBase {

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("The goal of this test is to check the correctness of a comment addition")
    public void addComment() {
        DriverUtils.navigateToPage(APPLICATION_URL+"conference/51");

        Confitura2018 confitura2018 = new Confitura2018();
        String comment = Confitura2018.addComment();

        assertEquals(comment, "Ola Kunysz: gruszki na wierzbie ółśćąźężń&*))%@@@11666==~~");

    }


}
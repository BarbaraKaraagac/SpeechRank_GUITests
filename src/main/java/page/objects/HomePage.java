package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;



public class HomePage {

    public static Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(css = "body > ui-view > header > div > nav > div.navbar-header > a")
    private  static WebElement MainLogo;

    @FindBy(css = "#navbar > ul > li:nth-child(1) > a")
    private static WebElement HomeButton;
    @FindBy(xpath = "/html/body/ui-view/ui-view/div/div[1]/div/div/h2")
    private static WebElement Header;

    //search fields

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(3) > input")
    private static WebElement confName;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(4) > input")
    private static WebElement Year;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(5) > input")
    private static WebElement playlistId;

    @FindBy(css = "body > ui-view > ui-view > div > button")
    private static WebElement ImportButton;


    //conferences
    @FindBy(xpath = "/html/body/ui-view/ui-view/div/div[5]/div[2]/div[1]/a/p")
    private static WebElement DevConf2019;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(1) > div > div > h2")
    private static WebElement DevConf2019title;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > a > p")
    private static WebElement BoilingFrogs2019;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(7) > div:nth-child(2) > div:nth-child(3) > a > p")
    private static WebElement Scalar2019;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(7) > div:nth-child(2) > div:nth-child(4) > a > p")
    private static WebElement Confitura2019;

    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(8) > div:nth-child(2) > div:nth-child(1) > a > p")
    private static WebElement BoilingFrogs2018;
    @FindBy(xpath = "/html/body/ui-view/ui-view/div/div[6]/div[2]/div[2]/a/p")
    private static WebElement Confitura2018;
    @FindBy(css = "body > ui-view > ui-view > div > div:nth-child(9) > div:nth-child(2) > div > a > p")
    private static WebElement DevConf2017;

    public String defaultName ="Some conference name";
    public String year = "2019";
    public String playlistID ="PLVT0blg4rCWCUv3oEMQ12haQkMQ1drefo";

    public HomePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public String Import(){

        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getWebDriver();;

        confName.clear();
        confName.sendKeys(defaultName);
        logger.info("name typed");

        Year.clear();
        Year.sendKeys(year);
        logger.info("year typed");

        playlistId.clear();
        playlistId.sendKeys(playlistID);
        logger.info("id typed");

        js.executeScript("window.scrollBy(0,1000);");

        ImportButton.click();

        String finalAlertText = playlistId.getText();

        return finalAlertText;
    }

    public static String goHome()

    {
        MainLogo.click();
        logger.info("navigation successful");
        String header =Header.getText();
        return header;
    }

    public static String goDevConf(){
        DevConf2019.click();
        logger.info("navigation successful");
        String title = DevConf2019title.getText();
        return title;

    }
}

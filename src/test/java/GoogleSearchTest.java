import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    private WebDriver driver;

//    @BeforeMethod
//    public void setUp() {
//        driver = new SafariDriver();
//    }

    @Test
    @Description("Opens link and ensures element is visible")
    @Owner("Koba Kamladze")
    @Severity(SeverityLevel.MINOR)
    @Parameters({"netu parametra zdes"})
    public void googleSearchTest() {
        navigateToGoogle();
        assertion();
        attachFile();
    }

    @Step("Navigating to the link")
    public void navigateToGoogle() {
        System.out.println("Opening link -  https://www.google.com");
    }

    @Step("Asserting element")
    public void assertion() {
        System.out.println("Asserting that element is displayed/");
    }

    @Step("Attaching text file")
    public void attachFile() {
        AllureHelper.attachFile("helloworld.txt");
    }

//    @AfterMethod
//    public void tearDown() {
////        AllureHelper.attachScreenshot(driver);
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

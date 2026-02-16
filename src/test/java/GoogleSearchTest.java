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

    @Test(groups = "faliing")
    public void failingTest2() {
        addNumbersAndCheckEquality(3, 2, 6);
    }

    @Test(groups = "faliing")
    public void failingTest1() {
        compareTwoNumbers(3, 2);
    }

    @Test(groups = "passing")
    public void passingTest2() {

    }

    @Description("Opens link and ensures element is visible")
    @Owner("Koba Kamladze")
    @Severity(SeverityLevel.MINOR)
    @Parameters({"There is no parameter"})
    @Test(groups = "passing")
    public void googleSearchTest() {
        navigateToGoogle();
        assertion();
        attachFile();
    }

    @Step("Navigating to the link")
    private void navigateToGoogle() {
        System.out.println("Opening link -  https://www.google.com");
    }

    @Step("Asserting element")
    private void assertion() {
        System.out.println("Asserting that element is displayed/");
    }

    @Step("Attaching text file")
    private void attachFile() {
        AllureHelper.attachFile("helloworld.txt");
    }

    @Step("Add numbers and check equality")
    private void addNumbersAndCheckEquality(int a, int b, int c) {
        Assert.assertEquals(a + b, c);
    }

    @Step("Compare 2 numbers")
    private void compareTwoNumbers(int a, int b) {
        Assert.assertTrue(a < b);
    }
}

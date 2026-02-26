
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GoogleSearchTest {

    @BeforeSuite
    public void before() {
        String USER_DIR_PATH = System.getProperty("user.dir");
        Path path = Paths.get(USER_DIR_PATH + "/allure-results/environment.properties");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(path)))) {
            writer.write("Browser=Safari\n");
            writer.write("Env=QA\n");
            writer.write("URL=https://test.example.com\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Issue("AB-1234")
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

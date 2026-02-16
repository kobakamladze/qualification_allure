import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AllureHelper {

    private static final String USER_DIR_PATH = System.getProperty("user.dir");

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] attachScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value="{filename}", type="text/*")
    public static void attachFile(String filename) {
       try {
           Files.readString(Paths.get(USER_DIR_PATH + "/src/test/resources/", filename));
       } catch(Exception e) {
           System.out.println("Could not find file!");
       }
    }
}

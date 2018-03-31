package core;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BrowserFactory extends MethodsFactory {

    @BeforeClass
    public void setUp() {
        DRIVER.set(new ChromeDriver());
    }

    @AfterClass
    public void tearDown() {
        driver().close();
    }

    @Attachment(value = "{0}", type = "image/png")
    @AfterMethod //AfterMethod annotation - This method executes after every test execution
    public byte[] screenShot(ITestResult result) throws IOException {
        // To create reference of TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver();
        byte[] src = new byte[0];
        //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
        if (ITestResult.FAILURE == result.getStatus()) {
            try {

                // Call method to capture screenshot
//                return screenshot.getScreenshotAs(OutputType.BYTES);
//                TakesScreenshot screenshot = (TakesScreenshot) driver();
                return screenshot.getScreenshotAs(OutputType.BYTES);
//                return screenshot.getScreenshotAs(OutputType.BYTES);
                // Copy files to specific location
                // result.getName() will return name of test case so that screenshot name will be same as test case name
//                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
////                FileUtils.copyFile(src, new File("./screenshots/" + result.getName() + timeStamp + ".png"));
//                System.out.println("Successfully captured a screenshot");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
//        }else{
//            return screenshotPassed();
//        }
        return screenshotPassed();
    }

    private byte[] screenshotPassed() throws IOException {

        Path path = Paths.get("/Users/romandubovyi/Downloads/trelloTests/base64_decrypt.bin");
        return Files.readAllBytes(path);

    }
//    private byte[] screenshotFailed() {
//
//        TakesScreenshot screenshot = (TakesScreenshot) driver();
//
//
//    }
}
//}

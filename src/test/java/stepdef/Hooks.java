package stepdef;

import com.qa.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    private final DriverManager driverManager = new DriverManager();
//
//
//    @After
//    public void quit(Scenario scenario) throws IOException {
//        try {
//            if (scenario.isFailed()) {
//                // Senaryo başarısızsa ekran görüntüsü al
//                TakesScreenshot ts = (TakesScreenshot) driverManager.getDriver();
//                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", scenario.getName());
//                new VideoManager().captureScreenshot(scenario.getName());
//
//
//            }
//
//            // İsteğe bağlı olarak başarısız senaryo durumunu logla
//            if (scenario.isFailed()) {
//                System.out.println("Senaryo başarısız: " + scenario.getName());
//                new VideoManager().captureScreenshot(scenario.getName());
//
//            }
//        } finally {
//            // WebDriver'ı kapat
//            new VideoManager().captureScreenshot(scenario.getName());
//            DriverManager.quitDriver();
//        }
//    }
@After
public void tearDown(Scenario scenario) {
    final byte[] screenshot = ((TakesScreenshot)
            DriverManager.
                    getDriver()).
            getScreenshotAs(OutputType.BYTES);
    if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png", "screenshots");
    }
    DriverManager.quitDriver();
    // if (!scenario.isFailed()) DriverManager.closeDriver();
}
    //public static void quitDriver() { //quit Method
    //    if (driver != null) {
    //        driver.quit();
    //        driver = null;
    //    }
}

package com.qa.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class VideoManager {
    private final TestUtils utils;
    private WebDriver driver = null;

    public VideoManager() {
        this.utils = new TestUtils();
        this.driver = driver;
    }

    public void startRecording() {
        // Ekran kaydı özelliği web tarayıcıları için doğrudan desteklenmediği için bu kısımda bir işlem yapmıyoruz
        // Gerekirse ekran kaydı için farklı bir kütüphane veya araç kullanabilirsiniz
    }

    public void stopRecording(String scenarioName) {
        // Ekran kaydı özelliği web tarayıcıları için doğrudan desteklenmediği için bu kısımda bir işlem yapmıyoruz
        // Gerekirse ekran kaydı için farklı bir kütüphane veya araç kullanabilirsiniz
    }

    public void captureScreenshot(String scenarioName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String dirPath = "src/screenshots"; // Ekran görüntülerini kaydetmek için klasör yolu
            File screenshotDir = new File(dirPath);
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs();
            }

            File destFile = new File(screenshotDir, scenarioName + ".png");
            FileUtils.copyFile(screenshot, destFile);
            utils.log().info("Screenshot path: " + destFile.getAbsolutePath());
        } catch (Exception e) {
            utils.log().error("Error during screenshot capture: " + e.toString());
        }
    }
}

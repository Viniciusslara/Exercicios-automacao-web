package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Logger {
	
	public void takeScreenshot(String stepName) {
		WebDriver webDriver = WebDriverManager.getDriver();
        TakesScreenshot ts = (TakesScreenshot) webDriver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
        String folderName = "Screenshots_" + new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
        File folder = new File("target/screenshots/" + folderName);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        File destination = new File(folder, stepName + "-" + timestamp + ".png");

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

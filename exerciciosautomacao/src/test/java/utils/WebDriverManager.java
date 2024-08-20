package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver-win64/chromedriver.exe");
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }


    public static void quitDriver() {
    	if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}


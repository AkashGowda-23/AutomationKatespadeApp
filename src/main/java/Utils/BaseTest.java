package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
    protected static WebDriver driver; 

    public static WebDriver initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options); 
        driver.get("https://www.katespade.com/");
        driver.manage().window().maximize();

        return driver;
    }
    
    public static WebDriver getDriver() {
        return driver;
    }

    public static void teardown() {
        driver.close();
    }

    public static ExtentReports getreport() {
        ExtentReports report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Akash Gowda\\Documents\\Ui\\target\\report.html");
        report.attachReporter(spark);
        spark.config().setReportName("UI Automation Project Report");
        report.setSystemInfo("Tester", "Akash, Nikitha, Diya, Krishna");
        return report;
    }
}

import geb.report.ReportState
import geb.report.Reporter
import geb.report.ReportingListener
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 2
}

environments {

    // run via “./gradlew chromeTest”
    chrome {
        driver = { new ChromeDriver() }
    }

    // run via “./gradlew chromeHeadlessTest”
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }

    reportsDir = new File("target/geb-reports")
    reportOnTestFailureOnly = true
    atCheckWaiting = true
    baseNavigatorWaiting = true


}

// To run the tests with all browsers just run “./gradlew test”
baseUrl = "https://www.screwfix.com"


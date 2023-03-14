import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {

    //int a;
    //a =10;

    WebDriver driver;
    void setupdriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(url);
    }

     void close() throws InterruptedException {

        Thread.sleep(6000);
        driver.quit();
     }

}




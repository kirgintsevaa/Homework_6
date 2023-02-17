import data.WebDriverName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class WebDriverFactory {

    public WebDriver create(WebDriverName type){
        WebDriver driver = null;
        switch(type) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions option1 = new ChromeOptions();
                option1.addArguments("---start-fullscreen");
                driver = new ChromeDriver(option1);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions option2 = new FirefoxOptions();
                option2.addArguments("---start-fullscreen");
                driver = new FirefoxDriver(option2);
                break;
        }  System.out.println("Вы выбрали браузер:"+ driver);
           return driver;
    }

}
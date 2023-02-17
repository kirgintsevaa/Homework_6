import data.WebDriverName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Scanner;

public class MyMainTest {
    static Scanner scanner = new Scanner(System.in);
    static String type;

    public static void main(String[] args) {
        WebDriverFactory driver = new WebDriverFactory();
        System.out.println("\nВыберите браузер: \n1-chrome \tили \t2-firefox");
        type = scanner.nextLine();
        switch (type) {
            case "1":
                WebDriver chrome = driver.create(WebDriverName.CHROME);
                break;
            case "2":
                WebDriver firefox = driver.create(WebDriverName.FIREFOX);
                break;
        }
    }
}
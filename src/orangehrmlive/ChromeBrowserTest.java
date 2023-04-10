package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the chrome browser

        WebDriver driver = new ChromeDriver();
        // open the Url into browser

        driver.get(baseUrl);

        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // get the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // get the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Find the email element and type email
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("Admin123");

       // driver.close();
    }
}
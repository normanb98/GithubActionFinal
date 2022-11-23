package Intellij_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class CreateNewCustomerTest {

    protected WebDriver driver;
    public String baseUrl = "https://www.way2automation.com/angularjs-protractor/banking/#/login";


    private By addCustomerBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[1]");
    private By openAccountBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[2]");
    private By customersBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[3]");
    private By homeBy = By.xpath("/html/body/div[3]/div/div[1]/button[1]");

    @Test (description = "Creating a customer and checking if the creation was successful")
    public void runTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        Thread.sleep(2000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnButton("Bank Manager Login");

        Thread.sleep(1000);

        driver.findElement(addCustomerBy).click();

        Thread.sleep(1000);

        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        addCustomerPage.addCustomer("Demo", "Test", "xxxx");

        Thread.sleep(1000);

        try {
            Assert.assertTrue(driver.switchTo().alert().getText().contains("Customer added successfully"));
            driver.switchTo().alert().accept();
            System.out.println(this.getClass().getSimpleName() + " PASSED");

        } catch (Exception e) {
            System.out.println(this.getClass().getSimpleName() + " FAILED");
        }

    }

}
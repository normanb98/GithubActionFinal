package Intellij_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    private By customerLoginBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button");
    private By bankManagerLoginBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button");
    private By homeBy = By.xpath("/html/body/div[3]/div/div[1]/button[1]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButton(String clickOn) {
        if (clickOn.equals("Home")) {
            driver.findElement(homeBy).click();
        }
        else if (clickOn.equals("Customer Login")) {
            driver.findElement(customerLoginBy).click();
        }
        else if (clickOn.equals("Bank Manager Login")) {
            driver.findElement(bankManagerLoginBy).click();
        }
    }
}
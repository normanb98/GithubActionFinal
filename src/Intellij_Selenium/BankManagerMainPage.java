package Intellij_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankManagerMainPage {
    protected WebDriver driver;

    private By addCustomerBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[1]");
    private By openAccountBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[2]");
    private By customersBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[3]");
    private By homeBy = By.xpath("/html/body/div[3]/div/div[1]/button[1]");



    public void clickOnButton(String clickOn) {
        if (clickOn.equals("Home")) {
            driver.findElement(homeBy).click();
        }
        else if (clickOn.equals("Add Customer")) {
            driver.findElement(addCustomerBy).click();
        }
        else if (clickOn.equals("Open Account")) {
            driver.findElement(openAccountBy).click();
        }
        else if (clickOn.equals("Customers")) {
            driver.findElement(customersBy).click();
        }
    }
}
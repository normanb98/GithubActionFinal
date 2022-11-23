package Intellij_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
    protected WebDriver driver;

    private By firstNameBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input");
    private By lastNameBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input");
    private By postCodeBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input");
    private By addCustomerBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button");
    private By openAccountBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[2]");
    private By customersBy = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[3]");
    private By homeBy = By.xpath("/html/body/div[3]/div/div[1]/button[1]");

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addCustomer(String firstName, String lastName, String postCode) {
        driver.findElement(firstNameBy).sendKeys(firstName);
        driver.findElement(lastNameBy).sendKeys(lastName);
        driver.findElement(postCodeBy).sendKeys(postCode);
        driver.findElement(addCustomerBy).click();
    }

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
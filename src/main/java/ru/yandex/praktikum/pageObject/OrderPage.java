package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    private By orderHeader = By.className("Order_Header__BZXOb");
    private By buttonNextInOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");
    private By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By inputMetro = By.xpath(".//input[@placeholder='* Станция метро']");
    private By metroSokolniki = By.xpath(".//ul[@class='select-search__options']/li[4]");
    private By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By dropdownRentalPeriod = By.className("Dropdown-arrow");
    private By rentalPeriod1day = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    private By checkboxBlackColor = By.id("black");
    private By buttonCheckoutOrder = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM') and text()='Заказать']");
    private By buttonPopupConfirmOrder = By.xpath(".//button[text()='Да']");
    private By headerPopupOrderConfirmed = By.className("Order_ModalHeader__3FDaJ");



    public void waitForLoadOrderHeader(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(orderHeader));
    }

    public String getHeaderText() {
        return driver.findElement(orderHeader).getText();
    }

    public void createOrder(String name, String surname, String address, String phone, String date) {
        driver.findElement(inputName).clear();
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputSurname).clear();
        driver.findElement(inputSurname).sendKeys(surname);
        driver.findElement(inputAddress).clear();
        driver.findElement(inputAddress).sendKeys(address);
        driver.findElement(inputMetro).click();
        driver.findElement(metroSokolniki).click();
        driver.findElement(inputPhone).clear();
        driver.findElement(inputPhone).sendKeys(phone);
        driver.findElement(buttonNextInOrder).click();
        driver.findElement(inputDate).clear();
        driver.findElement(inputDate).sendKeys(date);
        driver.findElement(dropdownRentalPeriod).click();
        driver.findElement(rentalPeriod1day).click();
        driver.findElement(checkboxBlackColor).click();
        driver.findElement(buttonCheckoutOrder).click();
        driver.findElement(buttonPopupConfirmOrder).click();
    }

    public String getTextPopupHeaderOrderConfirmed() {
        return driver.findElement(headerPopupOrderConfirmed).getText();
    }
}

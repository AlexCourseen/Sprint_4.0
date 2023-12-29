package ru.praktikum.scooter.models;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    //Кнопка "Заказать" в header
    private By headerOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //Кнопка "Заказать" в roadmap
    private By roadMapOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[contains(@class,'Button_Button__ra12g')]");
    // FAQ Вопрос №1
    private By faqQuestion1 = By.xpath(".//div[@id='accordion__heading-0']");
    // FAQ Вопрос №2
    private By faqQuestion2 = By.xpath(".//div[@id='accordion__heading-1']");
    // FAQ Вопрос №3
    private By faqQuestion3 = By.xpath(".//div[@id='accordion__heading-2']");
    // FAQ Вопрос №4
    private By faqQuestion4 = By.xpath(".//div[@id='accordion__heading-3']");
    // FAQ Вопрос №5
    private By faqQuestion5 = By.xpath(".//div[@id='accordion__heading-4']");
    // FAQ Вопрос №6
    private By faqQuestion6 = By.xpath(".//div[@id='accordion__heading-5']");
    // FAQ Вопрос №7
    private By faqQuestion7 = By.xpath(".//div[@id='accordion__heading-6']");
    // FAQ Вопрос №8
    private By faqQuestion8 = By.xpath(".//div[@id='accordion__heading-7']");
    // FAQ Видимый ответ на вопрос
    private By faqVisibleAnswer = By.xpath(".//div[@class='accordion__panel' and not(@hidden)]/p");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHeaderOrderButton() {
        driver.findElement(headerOrderButton).click();
    }

    public void clickRoadmapOrderButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(roadMapOrderButton));
        driver.findElement(roadMapOrderButton).click();
    }

    public void clickFaqQuestion(int numberOfQuestion) {
        By faqQuestion = null;
        if (numberOfQuestion == 1) {
            faqQuestion = faqQuestion1;
        } else if (numberOfQuestion == 2) {
            faqQuestion = faqQuestion2;
        } else if (numberOfQuestion == 3) {
            faqQuestion = faqQuestion3;
        } else if (numberOfQuestion == 4) {
            faqQuestion = faqQuestion4;
        } else if (numberOfQuestion == 5) {
            faqQuestion = faqQuestion5;
        } else if (numberOfQuestion == 6) {
            faqQuestion = faqQuestion6;
        } else if (numberOfQuestion == 7) {
            faqQuestion = faqQuestion7;
        } else if (numberOfQuestion == 8) {
            faqQuestion = faqQuestion8;
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(faqQuestion));
        driver.findElement(faqQuestion).click();
    }

    public String getTextFaqAnswer(int numberOfQuestion) {
        clickFaqQuestion(numberOfQuestion);
        return driver.findElement(faqVisibleAnswer).getText();
    }
}


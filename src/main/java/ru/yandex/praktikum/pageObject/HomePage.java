package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.praktikum.constants.LocatorsHomePage.*;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHeaderOrderButton() {
        driver.findElement(HEADER_ORDER_BUTTON).click();
    }
    public void clickRoadmapOrderButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(ROAD_MAP_ORDER_BUTTON));
        driver.findElement(ROAD_MAP_ORDER_BUTTON).click();
    }

    public void clickFaqQuestion(By question) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question));
        driver.findElement(question).click();
    }

    public String getTextFaqAnswer(By question) {
        clickFaqQuestion(question);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(question));
        return driver.findElement(FAQ_VISIBLE_ANSWER).getText();
    }
}


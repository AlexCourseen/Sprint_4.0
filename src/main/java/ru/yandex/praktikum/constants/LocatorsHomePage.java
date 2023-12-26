package ru.yandex.praktikum.constants;

import org.openqa.selenium.By;

public class LocatorsHomePage {
    //Кнопка "Заказать" в header
    public static final By HEADER_ORDER_BUTTON = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //Кнопка "Заказать" в roadmap
    public static final By ROAD_MAP_ORDER_BUTTON = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[contains(@class,'Button_Button__ra12g')]");
    // FAQ Вопрос №1
    public static final By FAQ_QUESTION_1 = By.xpath(".//div[@id='accordion__heading-0']");
    // FAQ Вопрос №2
    public static final By FAQ_QUESTION_2 = By.xpath(".//div[@id='accordion__heading-1']");
    // FAQ Вопрос №3
    public static final By FAQ_QUESTION_3 = By.xpath(".//div[@id='accordion__heading-2']");
    // FAQ Вопрос №4
    public static final By FAQ_QUESTION_4 = By.xpath(".//div[@id='accordion__heading-3']");
    // FAQ Вопрос №5
    public static final By FAQ_QUESTION_5 = By.xpath(".//div[@id='accordion__heading-4']");
    // FAQ Вопрос №6
    public static final By FAQ_QUESTION_6 = By.xpath(".//div[@id='accordion__heading-5']");
    // FAQ Вопрос №7
    public static final By FAQ_QUESTION_7 = By.xpath(".//div[@id='accordion__heading-6']");
    // FAQ Вопрос №8
    public static final By FAQ_QUESTION_8 = By.xpath(".//div[@id='accordion__heading-7']");
    // FAQ Видимый ответ на вопрос
    public static final By FAQ_VISIBLE_ANSWER = By.xpath(".//div[@class='accordion__panel' and not(@hidden)]/p");

}

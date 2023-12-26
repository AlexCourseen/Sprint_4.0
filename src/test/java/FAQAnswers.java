import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.pageObject.HomePage;

import static ru.yandex.praktikum.constants.LocatorsHomePage.*;


public class FAQAnswers {

    @RunWith(Parameterized.class)
    public static class CheckAnswersTest {

        private final String answer;
        private final By question;
        private WebDriver driver;

        public CheckAnswersTest(By question, String answer) {
            this.question = question;
            this.answer = answer;
        }

        @Parameterized.Parameters
        public static Object[][] getTextData() {
            return new Object[][]{
                    {FAQ_QUESTION_1, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {FAQ_QUESTION_2, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {FAQ_QUESTION_3, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {FAQ_QUESTION_4, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {FAQ_QUESTION_5, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {FAQ_QUESTION_6, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {FAQ_QUESTION_7, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {FAQ_QUESTION_8, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }

        @Test
        public void checkFAQAnswers() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
            HomePage objHomePage = new HomePage(driver);
            String textAnswer = objHomePage.getTextFaqAnswer(question);
            Assert.assertEquals(textAnswer, answer);
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }
}

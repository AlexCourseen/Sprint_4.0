import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.pageObject.HomePage;
import ru.yandex.praktikum.pageObject.OrderPage;

public class ButtonsOrderOpenOrderPage {
    private WebDriver driver;
    @Test
    public void checkHeaderOrderButtonOpenOrderPage(){
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickHeaderOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForLoadOrderHeader();
        Assert.assertNotNull(objOrderPage.getHeaderText());
    }

    @Test
    public void checkRoadmapOrderButtonOpenOrderPage(){
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickRoadmapOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForLoadOrderHeader();
        Assert.assertNotNull(objOrderPage.getHeaderText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

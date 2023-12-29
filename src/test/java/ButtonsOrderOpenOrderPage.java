import org.junit.Assert;
import org.junit.Test;
import ru.praktikum.scooter.models.HomePage;
import ru.praktikum.scooter.models.OrderPage;

public class ButtonsOrderOpenOrderPage extends BaseTest{

    @Test
    public void checkHeaderOrderButtonOpenOrderPage(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickHeaderOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForLoadOrderHeader();
        Assert.assertNotNull(objOrderPage.getHeaderText());
    }

    @Test
    public void checkRoadmapOrderButtonOpenOrderPage(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickRoadmapOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForLoadOrderHeader();
        Assert.assertNotNull(objOrderPage.getHeaderText());
    }

}

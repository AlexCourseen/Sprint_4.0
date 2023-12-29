import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.scooter.models.HomePage;
import ru.praktikum.scooter.models.OrderPage;

public class CreateOrder {
    @RunWith(Parameterized.class)
    public static class CheckCreateOrderTest extends BaseTest {

        private final String name;
        private final String surname;
        private final String address;
        private final String phone;
        private final String date;

        public CheckCreateOrderTest(String name, String surname, String address, String phone, String date) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.phone = phone;
            this.date = date;
        }


        @Parameterized.Parameters
        public static Object[][] getTextData() {
            return new Object[][]{
                    {"Иван", "Петров", "Москва", "79097686857", "30.12.2023"},
                    {"Семен", "Козлович", "ул.Красная", "79605867689", "08.01.2024"},
            };
        }


        @Test
        public void checkCreateOrder() {
            HomePage objHomePage = new HomePage(driver);
            objHomePage.clickHeaderOrderButton();
            OrderPage objOrderPage = new OrderPage(driver);
            objOrderPage.createOrder(name, surname, address, phone, date);
            String textHeader = objOrderPage.getTextPopupHeaderOrderConfirmed();
            Assert.assertTrue(textHeader.contains("Заказ оформлен"));
        }
    }
}

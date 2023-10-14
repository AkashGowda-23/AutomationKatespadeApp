package TestCases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.OrderStatus;
import Utils.BaseTest;

public class OrderStatusTest extends BaseTest {

    @BeforeMethod
    public void initialize() {
        driver = initializeBrowser();
    }


    @Test
    public void invalidOrderStatus() throws InterruptedException {
        OrderStatus p = new OrderStatus();
        p.acc();
        p.orderstatuslink();
        p.orderstatusno("12345");
         p.submit();
         p.invalidno();
         
        
       
    }
    @Test
    public void BlankOrderStatus() throws InterruptedException {
        OrderStatus p = new OrderStatus();

        p.acc();
       p.orderstatuslink();
       p.orderstatusno("");
        p.submit();
        p.blankmsg();
        
       
    }

}

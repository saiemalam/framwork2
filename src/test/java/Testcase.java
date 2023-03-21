import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase extends setup {

    // go to temu.com

    // find the text "Health & Household"
    // expected result will be matched.
//saiem alam
    homepage home;
@BeforeMethod
    void setuptest(){

        setupdriver("http://ebay.com");
        home = PageFactory.initElements(driver,homepage.class);



    }
@Test
    void testhealth(){

   String actualtext= home.healthtext();

   Assert.assertEquals(actualtext,"Smart home");
}
     @Test

    void testpayment(){

    home.clickpayment();

    String actualUrl= driver.getCurrentUrl();

    Assert.assertEquals(actualUrl,"https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334");


     }


     }



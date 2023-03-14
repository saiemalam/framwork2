import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class autozonetest extends setup {

    homepage home;
   @BeforeMethod
   void setuptest1(){

       setupdriver ("http://www.autozone.com");
       home= PageFactory.initElements(driver, homepage.class);
   }
@AfterMethod
void close1() throws InterruptedException {

       close();
}

    @Test (groups = "tst")
    void test1(){
    String actualtext= home.oiltext();

        Assert.assertEquals(actualtext,"Oil Filters");
}
 @Test (groups = "tst1")
    void test2(){

       home.clickcart();
      String actualurl= driver.getCurrentUrl();

       Assert.assertEquals(actualurl,"https://autozone.com/cart");
 }
@Test (groups = "tst")
    void see1(){

       Assert.assertTrue(home.see());
}

}

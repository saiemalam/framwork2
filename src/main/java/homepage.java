import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {

    @FindBy(xpath ="//div[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]" )
    WebElement smart;

    @FindBy(xpath ="//ul[@class=\"hl-cat-nav__container\"]/li[3]")
    WebElement motors;

    String healthtext(){
        return smart.getText();
    }

    void clickpayment(){

        motors.click();
    }
    @FindBy(xpath = "//ul[@class=\"az_kl az__n\"]/li[2]/div/a/div")

    WebElement oil;


    @FindBy(xpath = "//div[@class=\"az_S8\"]/div[4]/div[1]/div/a/span")
    WebElement cart;

    String oiltext(){

        return oil.getText();
    }

void clickcart(){

        cart.click();
}

void close () throws InterruptedException{

        cart.click();
        Thread.sleep(8000);
}

 boolean see(){

       return oil.isDisplayed();

 }


}

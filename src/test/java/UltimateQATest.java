import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup {



    @Test
    public void testOne() {
        WebElement button = driver.findElementById("idExample");
        button.click();
        WebElement text = driver.findElementByClassName("entry-title");
        String textSuccess = text.getText();
        Assertions.assertEquals("Button success", textSuccess);
    }


    @Test
    public void testTwo() {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("tester@test.pl");

        WebElement button = driver.findElementByName("et_builder_submit_button");
        button.click();
       
    }

}

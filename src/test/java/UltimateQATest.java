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
        @Test
        public void testThree() {
//            WebElement blueField = driver.findElementByClassName("et_pb_module et_pb_cta_0 et_pb_promo  et_pb_text_align_center et_pb_bg_layout_dark");
            WebElement blueField = driver.findElementByXPath("//*[contains(@class, 'et_pb_cta_0 et_pb_promo')]");
            Assertions.assertEquals("rgba(46, 163, 242, 1)", blueField.getCssValue("background-color"));
        }

}

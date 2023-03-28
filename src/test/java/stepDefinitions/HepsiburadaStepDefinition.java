package stepDefinitions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;


public class HepsiburadaStepDefinition {
    AllPages allPages=new AllPages();


@Given("user opens the hepsiburada app")
public void user_opens_the_hepsiburada_app() throws MalformedURLException {
   Driver.getAppiumDriver();
   ReusableMethods.bekle(2);
}
    @Then("click the my account button")
    public void click_the_my_account_button() {

    allPages.myAccountButton.click();
        ReusableMethods.bekle(3);

    }

    @Then("click the sign in button")
    public void click_the_sign_in_button() {
    allPages.signInButton.click();
        ReusableMethods.bekle(2);

    }
    @Then("enter the email adress and click the sign in button")
    public void enter_the_email_adress_and_click_the_sign_in_button() {

    allPages.emailBox.sendKeys(ConfigReader.getProperty("email"));
    allPages.emailSinIn.click();

    }
    @Then("enter the password and click the sign in button")
    public void enter_the_password_and_click_the_sign_in_button() {

    allPages.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    allPages.passwordSignIn.click();

    }
    @Then("click the Okay button")
    public void click_the_okay_button() {
    allPages.okayButton.click();
        ReusableMethods.bekle(2);

    }
    @Then("click the special for you button")
    public void click_the_special_for_you_button() {
    allPages.specailForYouButton.click();
        ReusableMethods.bekle(12);
    }
    @Then("add a product to the cart")
    public void add_a_product_to_the_cart() {
        Actions actions1=new Actions(Driver.getAppiumDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();

     ReusableMethods.bekle(2);


    }
    @Then("go to the cart")
    public void go_to_the_cart() {
    allPages.cart.click();
        ReusableMethods.bekle(2);

    }
    @Then("click the complete the transaction button")
    public void click_the_complete_the_transaction_button() {
        allPages.completeTheTransactionButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("click new card button")
    public void click_new_card_button() {
    allPages.newCard.click();
        ReusableMethods.bekle(2);

    }
    @Then("enter the credi card information")
    public void enter_the_credi_card_information() {
    allPages.cardNumberBox.sendKeys(ConfigReader.getProperty("cardNumber"));
    allPages.nameBox.sendKeys(ConfigReader.getProperty("name"));
    ReusableMethods.bekle(2);
    Actions actions1=new Actions(Driver.getAppiumDriver());
    actions1.sendKeys(Keys.TAB).perform();
    actions1.sendKeys(ConfigReader.getProperty("date")).perform();
    ReusableMethods.bekle(2);
    actions1.sendKeys(Keys.TAB).perform();
    actions1.sendKeys(ConfigReader.getProperty("code")).perform();
    ReusableMethods.bekle(2);

    //allPages.dateBox.sendKeys(ConfigReader.getProperty("date"));
    //allPages.securityBox.sendKeys(ConfigReader.getProperty("code"));

    }
    @Then("close the driver without buying")
    public void close_the_driver_without_buying() {
    Driver.quitAppiumDriver();
    }

    @Then("wait {int} second")
    public void waitSecond(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    @Then("click the give permission button")
    public void clickTheGivePermissionButton() {
    allPages.givePermissionButton.click();
    ReusableMethods.bekle(2);

    }


    @Then("scroll down a bit until the product shown")
    public void scrollDownABitUntilTheProductShown() {
        ReusableMethods.scrollDownJavascript(0,1000);
        ReusableMethods.bekle(6);
    }

    @Given("click the sign ın with google button")
    public void click_the_sign_ın_with_google_button() {
       allPages.googleEnterance.click();
        ReusableMethods.bekle(2);
    }

    @Given("click the yasaruzun91 gmail button")
    public void click_the_yasaruzun91_gmail_button() {
       allPages.yasargmail.click();
        ReusableMethods.bekle(2);
    }


    @Given("test that order Confirmation Button is displayed")
    public void test_that_order_confirmation_button_is_displayed() {
        Assert.assertTrue(allPages.orderConfirmationButton.isDisplayed());

    }

}

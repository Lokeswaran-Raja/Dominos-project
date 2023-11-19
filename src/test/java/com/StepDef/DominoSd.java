package com.StepDef;

import com.base.Base;
import com.pom.DominosCheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

public class DominoSd extends Base {

    DominosCheckoutPage checkoutPage=new DominosCheckoutPage();

    @Given("launch url")
    public void launch_url() {
        driver.get("https://www.dominos.co.in/");
        driver.manage().window().maximize();

    }
    @When("User click order online now button")
    public void user_click_order_online_now_button() throws InterruptedException {
        driver.findElement(checkoutPage.orderNow).click();
        Thread.sleep(3000);
        driver.findElement(checkoutPage.notifBtn).click();

    }
    @When("User Enter your address and pincode")
    public void user_enter_your_address_and_pincode() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(checkoutPage.deliveryAddressBtn).click();
//        implicitWait(driver);
//        driver.findElement(checkoutPage.notifBtn).click();
        driver.findElement(checkoutPage.searchArea).sendKeys("6000");
        Thread.sleep(3000);
        driver.findElement(checkoutPage.locateMe).click();
        Thread.sleep(3000);
        driver.findElement(checkoutPage.selectLocation).click();


    }
    @When("User choose veg pizza section")
    public void user_choose_veg_pizza_section() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(checkoutPage.vegSection).click();


    }
    @When("User add pizzas")
    public void user_add_pizzas() throws InterruptedException {

       // driver.findElement(checkoutPage.addOn).click();
//        driver.findElement(checkoutPage.malabarPizza).click();
        waitClick(driver);
        driver.findElement(checkoutPage.margImg).click();
        driver.findElement(checkoutPage.margAddCart).click();
        driver.findElement(checkoutPage.peppyImg).click();
        driver.findElement(checkoutPage.peppyAddCart).click();
//        driver.findElement(checkoutPage.pizza1).click();
//       implicitWait(driver);
//        driver.findElement(checkoutPage.addOn).click();


//     waitClick(driver);
//        driver.findElement(checkoutPage.pizza2).click();
//        Thread.sleep(3000);
//        driver.findElement(checkoutPage.pizza3).click();


//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        scrollDown(driver,driver.findElement(checkoutPage.pizza1));
//        scrollClick(driver,driver.findElement(checkoutPage.pizza1));

    }
    @When("User choose beverage section")
    public void user_choose_beverage_section() throws InterruptedException {
        driver.findElement(checkoutPage.BeverageSection).click();
             waitClick(driver);

    }
    @When("User add drinks")
    public void user_add_drinks() throws InterruptedException, IOException {
        driver.findElement(checkoutPage.pepsi).click();
             waitClick(driver);
        screenshot(driver,"add.png");
    }
    @When("User removes products")
    public void user_removes_products() throws InterruptedException, IOException {
        driver.findElement(checkoutPage.removePdt).click();
        screenshot(driver,"remove.png");
             waitClick(driver);

    }

    @Then("User Checkout")
    public void user_checkout() throws IOException {
            driver.findElement(checkoutPage.checkOut).click();
            screenshot(driver,"TestPassed.png");

    }

}

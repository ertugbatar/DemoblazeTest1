package com.Demoblaze.stepDefs;

import com.Demoblaze.PageObject.MainPage;
import com.Demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class stepDefs {

    MainPage MainPage = new MainPage();

    @Given("User open the homepage")
    public void user_open_the_homepage( ) throws InterruptedException {


    Driver.getDriver().get("https://www.demoblaze.com/");
        Thread.sleep(10000);


    }

    @When("the user selects an item to add to the cart")
    public void the_user_selects_an_item_to_add_to_the_cart() throws InterruptedException {
//        driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']")).click();

        MainPage.samsungS6.click();
        Thread.sleep(3000);
        MainPage.addToCartButton.click();
        Thread.sleep(3000);


    }

    @Then("the item should be in the user's cart")
    public void the_item_should_be_in_the_user_s_cart() throws InterruptedException {
        Assert.assertEquals("Product added",Driver.getDriver().switchTo().alert().getText());
        Thread.sleep(3000);
    }

    @When("the user goes to the cart page")
    public void the_user_goes_to_the_cart_page() throws InterruptedException {
        MainPage.cartButton.click();
        Thread.sleep(3000);
        MainPage.PlaceOrder.click();
        Thread.sleep(3000);
    }

    @And("the_user_proceeds_to_checkout_and_confirms_the_order")
    public void the_user_proceeds_to_checkout_and_confirms_the_order() {
        MainPage.name.sendKeys("Ertug Batar");
        MainPage.country.sendKeys("United Kingdom");
        MainPage.city.sendKeys("London");
        MainPage.card.sendKeys("123456789");
        MainPage.month.sendKeys("11");
        MainPage.year.sendKeys("1988");
        MainPage.Purchase.click();
    }

    @Then("the user should have successfully placed an order and completed the purchase")
    public void the_user_should_have_successfully_placed_an_order_and_completed_the_purchase() {
        WebElement purchaseMessage = Driver.getDriver().findElement(By.xpath("/html/body/div[10]/h2"));
        String expectedErrorMessage = "Thank you for your purchase!";
        String actualErrorMessage = purchaseMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println(" message verification PASSED!");
        }else{
            System.out.println(" message verification FAILED!!!");
        }

        MainPage.OKbutton.click();
    }

}




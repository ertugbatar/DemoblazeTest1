package com.Demoblaze.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.Demoblaze.utilities.Driver.getDriver;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    public WebElement samsungS6;

    @FindBy( xpath = "//a[@class='btn btn-success btn-lg']")
    public WebElement addToCartButton;

    @FindBy( id = "cartur")
    public WebElement cartCount;

    @FindBy(xpath = "//a[normalize-space()='Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    public WebElement PlaceOrder;


    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    public WebElement Purchase;

    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    public WebElement OKbutton;



}
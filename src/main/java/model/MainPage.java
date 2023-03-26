package model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    public static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private static final By CREATE_ORDER_BUTTON_TOP = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    public static final By CREATE_ORDER_BUTTON_BOTTOM = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By FIRST_QUESTION = By.id("accordion__heading-0");
    public static final By SECOND_QUESTION = By.id("accordion__heading-1");
    public static final By THIRD_QUESTION = By.id("accordion__heading-2");
    public static final By FOURTH_QUESTION = By.id("accordion__heading-3");
    public static final By FIFTH_QUESTION = By.id("accordion__heading-4");
    public static final By SIXTH_QUESTION = By.id("accordion__heading-5");
    public static final By SEVENTH_QUESTION = By.id("accordion__heading-6");
    public static final By EIGHTH_QUESTION = By.id("accordion__heading-7");
    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get(PAGE_URL);
    }


    public void clickCreateOrderButtonTop() {

        driver.findElement(CREATE_ORDER_BUTTON_TOP).click();
    }
    public void clickCreateOrderButtonBottom() {
        WebElement element = driver.findElement(CREATE_ORDER_BUTTON_BOTTOM);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(CREATE_ORDER_BUTTON_BOTTOM).click();
    }
    public void clickOnTheFirstQuestion() {
        WebElement element = driver.findElement(FIRST_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIRST_QUESTION).click();
    }
    public void clickOnTheSecondQuestion() {
        WebElement element = driver.findElement(SECOND_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SECOND_QUESTION).click();
    }
    public void clickOnTheThirdQuestion() {
        WebElement element = driver.findElement(THIRD_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(THIRD_QUESTION).click();
    }
    public void clickOnTheFourthQuestion() {
        WebElement element = driver.findElement(FOURTH_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FOURTH_QUESTION).click();
    }
    public void clickOnTheFifthQuestion() {
        WebElement element = driver.findElement(FIFTH_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIFTH_QUESTION).click();
    }
    public void clickOnTheSixthQuestion() {
        WebElement element = driver.findElement(SIXTH_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SIXTH_QUESTION).click();
    }
    public void clickOnTheSeventhQuestion() {
        WebElement element = driver.findElement(SEVENTH_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SEVENTH_QUESTION).click();
    }
    public void clickOnTheEighthQuestion() {
        WebElement element = driver.findElement(EIGHTH_QUESTION);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(EIGHTH_QUESTION).click();
    }

}

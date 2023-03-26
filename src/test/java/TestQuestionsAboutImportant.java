import model.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestQuestionsAboutImportant {
    private WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @Test
    public void checkQuestionsAboutImportant() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickOnTheFirstQuestion();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(By.id("accordion__panel-0")).getText());
        mainPage.clickOnTheSecondQuestion();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement(By.id("accordion__panel-1")).getText());
        mainPage.clickOnTheThirdQuestion();
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", driver.findElement(By.id("accordion__panel-2")).getText());
        mainPage.clickOnTheFourthQuestion();
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", driver.findElement(By.id("accordion__panel-3")).getText());
        mainPage.clickOnTheFifthQuestion();
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", driver.findElement(By.id("accordion__panel-4")).getText());
        mainPage.clickOnTheSixthQuestion();
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", driver.findElement(By.id("accordion__panel-5")).getText());
        mainPage.clickOnTheSeventhQuestion();
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", driver.findElement(By.id("accordion__panel-6")).getText());
        mainPage.clickOnTheEighthQuestion();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", driver.findElement(By.id("accordion__panel-7")).getText());
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ZnwrHomePage;

public class ZnwrCardTests {
    private WebDriver driver;

    @BeforeMethod
    public void initPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addToCard() {
        boolean CardResult = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput()
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .cardButton();
        Assert.assertTrue(CardResult, "FAILED TEST");
    }

    @Test
    public void clearCard() {
        boolean ClearCardSuccess = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput()
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .clickButtonClear()
                .cardIsNotSelect();
        Assert.assertFalse(ClearCardSuccess);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
    }
}

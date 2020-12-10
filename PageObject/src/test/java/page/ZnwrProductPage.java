package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrProductPage extends AbstractPage
{
    @FindBy(xpath = "//a[@title='Черный']")
    private WebElement SelectProductColorLocator;
    @FindBy(xpath = "//div[@data-variant-id='2']")
    private WebElement SelectProductSizeLocator;
    @FindBy(xpath = "//button[@id='product__add-cart-btn']")
    private  WebElement AddProductToOrderLocator;
    @FindBy(xpath = "//div[@class='product__success-modal-btn']//a ")
    private  WebElement OrderLocator;

    public ZnwrProductPage(WebDriver driver)
    {
        super(driver);
    }

    public ZnwrProductPage selectProductColor()
    {
        SelectProductColorLocator.click();
        return this;
    }

    public ZnwrProductPage selectProductSize()
    {
        SelectProductSizeLocator.click();
        return this;
    }

    public ZnwrProductPage addProductToOrder()
    {
        AddProductToOrderLocator.click();
        return this;
    }

    public ZnwrCardPage openCardPage()
    {
        OrderLocator.click();
        return new ZnwrCardPage(driver);
    }

}

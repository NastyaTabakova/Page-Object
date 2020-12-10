package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrSeachPage extends AbstractPage
{
    @FindBy(xpath = "//div[@class='catalog__search']//input")
    private WebElement SearchInputLocator;
    @FindBy(xpath = "//div[@class='catalog__search']//button")
    private WebElement SearchButtonLocator;
    @FindBy(xpath = "//div[@class='card__content']//a")
    private WebElement ProductLocator;

    public ZnwrSeachPage (WebDriver driver)
    {
        super(driver);
    }

    public ZnwrSeachPage searchInput()
    {
        SearchInputLocator.sendKeys("Вчера работало");
        return this;
    }

    public ZnwrSeachPage clickSearchButton()
    {
        SearchButtonLocator.click();
        return this;
    }

    public ZnwrProductPage openProductPage()
    {
        ProductLocator.click();
        return new ZnwrProductPage(driver);
    }
}

package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrCardPage extends AbstractPage
{
    @FindBy(xpath = "//a[@class='header__cart-btn']")
    private WebElement CardLocator;
    @FindBy(xpath = "//div[@class='checkout__cart-item-total-delete--desktop']/button")
    private WebElement ClearButtonLocator;
    public ZnwrCardPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean cardButton()
    {
        WebElement Card=CardLocator;
        return Card.isEnabled();
    }

    public ZnwrHomePage clickButtonClear()
    {
        ClearButtonLocator.click();
        return new ZnwrHomePage(driver);
    }
}

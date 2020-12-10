package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrHomePage extends AbstractPage
{
    @FindBy(id = "header__search-btn")
    private WebElement SearchClickLocator;
    @FindBy(xpath = "//a[@class='header__cart-btn']")
    private WebElement CardLocator;

    public ZnwrHomePage(WebDriver driver)
    {
        super(driver);
    }

    public ZnwrHomePage openPage()
    {
        driver.get("https://znwr.ru");
        return this;
    }

    public ZnwrSeachPage openSearchPage()
    {
        SearchClickLocator.click();
        return new ZnwrSeachPage(driver);
    }

    public boolean cardIsNotSelect()
    {
        WebElement Card=CardLocator;
        return Card.isSelected();
    }
}

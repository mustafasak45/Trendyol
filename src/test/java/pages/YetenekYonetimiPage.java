package pages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YetenekYonetimiPage {
    public YetenekYonetimiPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//h4[text()='Yetenek Yönetimi']")
    public WebElement yetenekYonetimiText;

    @FindBy(xpath = "//div[@onclick=\"location.href = '/Domain/List/60';\"]//article[@class='media']")
    public WebElement isAilesiButton;

    @FindBy(xpath = "//div[@onclick=\"location.href = '/Domain/List/61';\"]//article[@class='media']")
    public WebElement yetkinlikVeBeceriButton;

    @FindBy(xpath = "//div[@onclick=\"location.href = '/Domain/List/102';\"]//article[@class='media']")
    public WebElement temelTanimlamalarButton;
}

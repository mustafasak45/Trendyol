package pages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DenemePage {
    public DenemePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit' and @name='btnLogin']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@id='activeLogoDiv']")
    public WebElement bilgeAdamLogo;
}

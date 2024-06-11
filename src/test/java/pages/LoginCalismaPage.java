package pages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCalismaPage {
    public LoginCalismaPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='activeLogoDiv']")
    public WebElement bilgeAdamLogo;

}

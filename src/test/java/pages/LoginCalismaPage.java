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

    @FindBy(xpath = "//a[@href='/Domain/Menu/1043']")
    public WebElement temelIKVeOrganizasyonButton;

    @FindBy(xpath = "//h4[text()='Temel IK ve Organizasyon']")
    public WebElement temelIKVeOrganizasyonText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1042']")
    public WebElement yetenekYonetimiButton;

    @FindBy(xpath = "//h4[text()='Yetenek Yönetimi']")
    public WebElement yetenekYonetimiText;

}

package pages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
    @FindBy(xpath = "//*[@name='btnLogin']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameTextBox;
    @FindBy(xpath = "//div[@id='activeLogoDiv']")
    public WebElement bilgeAdamLogo;
    @FindBy(xpath = "//*[@data-sider-select-id='3b239e51-fe1e-4082-b874-f1cb9e7209fb']")
    public WebElement girisError;
}

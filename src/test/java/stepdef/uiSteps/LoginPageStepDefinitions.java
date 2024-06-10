package stepdef.uiSteps;

import com.qa.utils.ConfigReader;
import com.qa.utils.DriverManager;
import com.qa.utils.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("I see Giris Sayfasi page")
    public void iSeeGirisSayfasiPage() {
        DriverManager.
                getDriver().
                get(ConfigReader.
                        getProperty("website.url"));

    }

    @Then("I click the UserName")
    public void iClickTheUserName() {
        ReusableMethods.waitForVisibility(loginPage.userNameTextBox, 2).click();
    }

    @Then("I click the UserName type {string}")
    public void iClickTheUserNameType(String userName) {
        userName = ConfigReader.getProperty("validUserName");
        loginPage.userNameTextBox.sendKeys(userName);
        loginPage.userNameTextBox.sendKeys(Keys.TAB);
    }

    @Then("I click the Password type {string}")
    public void iClickThePasswordType(String password) {
        password = ConfigReader.getProperty("validPassword");
        loginPage.passwordTextBox.sendKeys(password);
    }

    @When("I click the LoginButton")
    public void iClickTheLoginButton() {
        loginPage.loginButton.click();

    }

    @When("User waits for {int} seconds")
    public void userWaitsForSeconds(Integer wait) {
        ReusableMethods.waitFor(wait);
    }

    @Then("I find BilgeAdam Logo")
    public void iFindBilgeAdamLogo() {
        Assert.assertTrue(loginPage.bilgeAdamLogo.isDisplayed());
       // System.out.println("loginPage.bilgeAdamLogo.isDisplayed() = " + loginPage.bilgeAdamLogo.isDisplayed());
    }

    @Then("I click on the UserName and type {string}")
    public void iClickOnTheUserNameAndType(String invalidUserName) {
        ReusableMethods.waitForVisibility(loginPage.userNameTextBox, 2).click();
        loginPage.userNameTextBox.sendKeys(invalidUserName);
        loginPage.userNameTextBox.sendKeys(Keys.TAB);
    }
    @Then("I click on the Password and type {string}")
    public void iClickOnThePasswordAndType(String invalidPassword) {
        ReusableMethods.waitForVisibility(loginPage.passwordTextBox, 2).click();
        loginPage.passwordTextBox.sendKeys(invalidPassword);
        loginPage.passwordTextBox.sendKeys(Keys.TAB);

    }
    @Then("I see that I can't log in")
    public void iSeeThatICanTLogIn() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());

    }
}

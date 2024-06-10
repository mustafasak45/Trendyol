package stepdef.uiSteps;

import com.qa.utils.ConfigReader;
import com.qa.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DenemePage;

public class DenemeStepDef {
    DenemePage denemePage = new DenemePage();

    @Given("Giris sayfasina gidilir")
    public void girisSayfasinaGidilir() {
        DriverManager.getDriver().get(ConfigReader.getProperty("website.url"));
    }

    @Then("Dogru kullanici adi girilir")
    public void dogruKullaniciAdiGirilir() {
        denemePage.userName.sendKeys(ConfigReader.getProperty("validUserName"));
    }

    @Then("Dogru sifre girilir")
    public void dogruSifreGirilir() throws InterruptedException {
        denemePage.password.sendKeys(ConfigReader.getProperty("validPassword"));
        Thread.sleep(3000);
    }

    @And("Giris buttonuna tiklanir")
    public void girisButtonunaTiklanir() {
        denemePage.loginButton.click();
    }

    @And("Giris yapildigi gorulur")
    public void girisYapildigiGorulur() {
        Assert.assertTrue(denemePage.bilgeAdamLogo.isDisplayed());
    }
}

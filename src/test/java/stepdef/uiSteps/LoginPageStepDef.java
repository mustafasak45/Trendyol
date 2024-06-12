package stepdef.uiSteps;

import com.qa.utils.ConfigReader;
import com.qa.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.config.Config;
import org.testng.Assert;
import pages.LoginCalismaPage;

public class LoginPageStepDef {

    LoginCalismaPage loginCalismaPage=new LoginCalismaPage();
    @Given("Kullanici URL gider")
    public void kullaniciURLGider() {
        DriverManager.getDriver().get(ConfigReader.getProperty("website.url"));
    }

    @And("Kullanici dogru kullanici adini girer")
    public void kullaniciDogruKullaniciAdiniGirer() {

        loginCalismaPage.userName.sendKeys(ConfigReader.getProperty("validUserName"));

    }

    @And("Kullanici dogru sifre girer")
    public void kullaniciDogruSifreGirer(){
        loginCalismaPage.password.sendKeys(ConfigReader.getProperty("validPassword"));
    }

    @Then("Kullanici giris buttonuan tiklar")
    public void kullaniciGirisButtonuanTiklar() throws InterruptedException {
        loginCalismaPage.loginButton.click();
        Thread.sleep(3000);
    }

    @When("Kullanici giris yaptigini gorur")
    public void kullaniciGirisYaptiginiGorur() {
        Assert.assertTrue(loginCalismaPage.bilgeAdamLogo.isDisplayed());
    }
    @And("Temel IK ve Organizasyon buttonuna tiklanir")
    public void temelIKVeOrganizasyonButtonunaTiklanir() {
        loginCalismaPage.temelIKVeOrganizasyonButton.click();
    }

    @And("Temel IK ve Organizasyon sayfasinin acildigi gorulur")
    public void temelIKVeOrganizasyonSayfasininAcildigiGorulur() {
        Assert.assertTrue(loginCalismaPage.temelIKVeOrganizasyonText.isDisplayed());
        Assert.assertEquals(loginCalismaPage.temelIKVeOrganizasyonText.getText(),"Temel IK ve Organizasyon");
    }


    @And("Yetenek Yonetimi buttonuna tiklanir")
    public void yetenekYonetimiButtonunaTiklanir() {
        loginCalismaPage.yetenekYonetimiButton.click();
    }

    @And("Yetenek Yonetimi sayfasinin acildigi gorulur")
    public void yetenekYonetimiSayfasininAcildigiGorulur() {
        Assert.assertTrue(loginCalismaPage.yetenekYonetimiText.isDisplayed());
        Assert.assertEquals(loginCalismaPage.yetenekYonetimiText.getText(),"Yetenek Yönetimi");
    }
}

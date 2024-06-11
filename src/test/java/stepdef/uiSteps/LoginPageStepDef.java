package stepdef.uiSteps;

import com.qa.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginCalismaPage;

public class LoginPageStepDef {

    LoginCalismaPage loginCalismaPage=new LoginCalismaPage();
    @Given("Kullanici URL gider")
    public void kullaniciURLGider() {
        DriverManager.getDriver().get("https://hcm-manager-test.opthemateknoloji.com/");
    }

    @And("Kullanici dogru kullanici adini girer")
    public void kullaniciDogruKullaniciAdiniGirer() {

        loginCalismaPage.userName.sendKeys("kuzeyadmintest");

    }

    @And("Kullanici dogru sifre girer")
    public void kullaniciDogruSifreGirer(){
        loginCalismaPage.password.sendKeys("Bilge123");
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
}

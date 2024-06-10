package stepdef.uiSteps;

import com.qa.utils.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import pages.YetenekYonetimiPage;

public class YetenekYonetimiStepDef {
    HomePage homePage = new HomePage();
    YetenekYonetimiPage yetenekYonetimiPage=new YetenekYonetimiPage();

    @And("I click the {string} for Yetenek Yonetimi")
    public void iClickTheForYetenekYonetimi(String buttonName) {
        WebElement button = getButtonByName(buttonName);
        ReusableMethods.waitForVisibility(button, 5);
        ReusableMethods.jsClick(button);
    }

    private WebElement getButtonByName(String buttonName) {
        switch (buttonName) {
            case "Yetenek Yonetimi":
                return homePage.yetenekYonetimiButton;

            default:
                throw new RuntimeException("Button not found: " + buttonName);
        }
    }

    @When("I see Yetenek Yonetimi text")
    public void iSeeYetenekYonetimiText() {
        WebElement yetenekYonetimiText;
        yetenekYonetimiText = yetenekYonetimiPage.yetenekYonetimiText;
        Assert.assertTrue(yetenekYonetimiText.isDisplayed());
    }


    @Then("I see the button_name for Yetenek Yonetimi")
    public void iSeeTheButtonNameForYetenekYonetimi(io.cucumber.datatable.DataTable dataTable) {

        for (int i = 1; i < dataTable.asLists().size(); i++) {
            String expectedTextName = dataTable.row(i).get(0);
            WebElement actualButtonElement = null;
            switch (expectedTextName) {
                case "İş Ailesi":
                    actualButtonElement = yetenekYonetimiPage.isAilesiButton;
                    break;
                case "Yetkinlik ve Beceri":
                    actualButtonElement = yetenekYonetimiPage.yetkinlikVeBeceriButton;
                    break;
                case "Temel Tanımlamalar":
                    actualButtonElement = yetenekYonetimiPage.temelTanimlamalarButton;
                    break;

                default:
                    throw new RuntimeException();
            }
            if (actualButtonElement != null) {
                System.out.println("actualButtonElement Ciktisi = " + actualButtonElement.getText());
                checkWebElement(actualButtonElement);
            }
        }

    }
    private void checkWebElement(WebElement webElement) {
        ReusableMethods.waitForVisibility(webElement, 3);
//        ReusableMethods.jsScroll(buttonElement);
        Assert.assertTrue(webElement.isDisplayed());
    }
}

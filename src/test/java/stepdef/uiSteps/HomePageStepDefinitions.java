package stepdef.uiSteps;

import com.qa.utils.DriverManager;
import com.qa.utils.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomePage;

import java.util.List;

public class HomePageStepDefinitions {
    HomePage homePage = new HomePage();

    @Given("I see the button_name and text_name")
    public void iSeeTheButtonNameAndTextName(io.cucumber.datatable.DataTable dataTable) {

//        List<String> actualElementsTextList = ReusableMethods.getElementsText(By.tagName("p"));//Bütün textleri bu liste attık
//        System.out.println("actualElementsTextList.size() = " + actualElementsTextList.size());
//        System.out.println("dataTable.asLists().size() = " + dataTable.asLists().size());
//
//        System.out.println("===========actualElementsTextList===============");
//        actualElementsTextList.stream().forEach(System.out::println);
//        System.out.println("===========actualElementsTextList===============");
//

        for (int i = 1; i < dataTable.asLists().size(); i++) { //feature deki tabloyu forloop la okutarak kontrolleri yaptık
            String expectedTextName = dataTable.row(i).get(0);
//            String actualTextName = actualElementsTextList.get(i - 1);
            System.out.println("expectedTextName Forlooptan sonra taablodan alınan deger ===>> " + expectedTextName);
//            System.out.println("actualTextName ===>> "+actualTextName);

            String actualTextElement = null;
            WebElement actualButtonElement = null;

            switch (expectedTextName) {
                case "Temel IK ve Organizasyon":
                    actualTextElement = homePage.temelIkVeOrganizasyonText.getText();
                    actualButtonElement = homePage.temelIkVeOrganizasyonButton;
                    break;
                case "Yetenek Yönetimi":
                    actualTextElement = homePage.yetenekYonetimiText.getText();
                    actualButtonElement = homePage.yetenekYonetimiButton;
                    break;
                case "Performans":
                    actualTextElement = homePage.performansText.getText();
                    actualButtonElement = homePage.performansButton;
                    break;
                case "İşe Alım ve İşe Uyum":
                    actualTextElement = homePage.iseAlimVeIseUyumText.getText();
                    actualButtonElement = homePage.iseAlimVeIseUyumButton;
                    break;
                case "Eğitim ve Gelişim Planı":
                    actualTextElement = homePage.egitimVeGelisimPlaniText.getText();
                    actualButtonElement = homePage.egitimVeGelisimPlaniButton;
                    break;
//                case "Sınav":
//                    ReusableMethods.waitFor(5);
//                    actualTextElement = homePage.sinavText.getText();
//                    System.out.println("actualTextElement i switch case in içinden kontrolü = "+actualTextElement);
//                    actualButtonElement = homePage.sinavButton;
//                    System.out.println("actualButtonElement i switch case in içinden kontrolü = "+actualButtonElement);
//                    break;
                case "İş Gücü Analitiği ve Planlaması":
                    actualTextElement = homePage.isGucuAnalitigiVePlanlamasiText.getText();
                    actualButtonElement = homePage.isGucuAnalitigiVePlanlamasiButton;
                    break;
                case "Ücret ve Yan haklar":
                    actualTextElement = homePage.ucretVeYanHaklarText.getText();
                    actualButtonElement = homePage.ucretVeYanHaklarButton;
                    break;
                case "Zaman ve Devamlılık":
                    actualTextElement = homePage.zamanVeDevamlilikText.getText();
                    actualButtonElement = homePage.zamanVeDevamlilikButton;
                    break;
                case "Bordrolama":
                    actualTextElement = homePage.bordrolamaText.getText();
                    actualButtonElement = homePage.bordrolamaButton;
                    break;
                case "Doküman Yönetimi":
                    actualTextElement = homePage.dokumanYonetimiText.getText();
                    actualButtonElement = homePage.dokumanYonetimiButton;
                    break;
//                case "Sorun ve Talep Yönetimi":
//                    actualTextElement = homePage.sorunVeTalepYonetimiText.getText();
//                    actualButtonElement = homePage.sorunVeTalepYonetimiButton;
//                    break;
                case "Masraf Yönetimi":
                    actualTextElement = homePage.masrafYonetimiText.getText();
                    actualButtonElement = homePage.masrafYonetimiButton;
                    break;
                case "Demirbaş ve Zimmet":
                    actualTextElement = homePage.demirbasVeZimmetText.getText();
                    actualButtonElement = homePage.demirbasVeZimmetButton;
                    break;
                case "Değerlendirme ve Anket":
                    actualTextElement = homePage.degerlendirmeVeAnketText.getText();
                    actualButtonElement = homePage.degerlendirmeVeAnketButton;
                    break;
                case "Çevrimiçi Toplantı":
                    actualTextElement = homePage.cevrimiciToplantiText.getText();
                    actualButtonElement = homePage.cevrimiciToplantiButton;
                    break;
                case "IK Portal":
                    actualTextElement = homePage.ikPortalText.getText();
                    actualButtonElement = homePage.IKButton;
                    break;
//                case "vMerch":
//                    actualTextElement = homePage.vMerchText.getText();
//                    actualButtonElement = homePage.vMerchButton;
//                    break;
                case "Görev Yönetimi":
                    actualTextElement = homePage.gorevYonetimiText.getText();
                    actualButtonElement = homePage.gorevYonetimiButton;
                    break;
                case "Ayarlar":
                    actualTextElement = homePage.ayarlarText.getText();
                    actualButtonElement = homePage.ayarlarButton;
                    break;
                // Add more cases for other elements as needed
                default:
                    throw new RuntimeException();
            }
            if (actualTextElement != null && actualButtonElement != null) {
                System.out.println("actualTextElement Ciktisi = " + actualTextElement);
                System.out.println("actualButtonElement Ciktisi = " + actualButtonElement);
                checkTextAndButton(actualTextElement, expectedTextName, actualButtonElement);
            }
        }
    }

    private void checkTextAndButton(String textElement, String expectedText, WebElement buttonElement) {
        ReusableMethods.waitForVisibility(buttonElement, 3);
        System.out.println("checkTextAndButton methodundan ====>>>  " + textElement);
//        ReusableMethods.jsScroll(buttonElement);
        Assert.assertEquals(textElement, expectedText);
        Assert.assertTrue(buttonElement.isDisplayed());
    }

}

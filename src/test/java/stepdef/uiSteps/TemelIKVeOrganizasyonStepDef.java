package stepdef.uiSteps;

import com.qa.utils.DriverManager;
import com.qa.utils.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import pages.TemelIKVeOrganizasyonPage;
import java.util.Map;
import java.util.HashMap;

public class TemelIKVeOrganizasyonStepDef {
    HomePage homePage = new HomePage();
    TemelIKVeOrganizasyonPage temelIKVeOrganizasyonPage = new TemelIKVeOrganizasyonPage();

    @When("I click the Temel IK ve Organizasyon")
    public void iClickTheTemelIKVeOrganizasyon() {
        homePage.IKButton.click();
    }

    @When("I see Temel IK ve Organizasyon text")
    public void iSeeTemelIKVeOrganizasyonText() {
        WebElement temelIKVeOrganizasyonText;
        temelIKVeOrganizasyonText = temelIKVeOrganizasyonPage.temelIKVeOrganizasyonText;
        Assert.assertTrue(temelIKVeOrganizasyonText.isDisplayed());
    }

    @Then("I see the button_name for Temel IK ve Organizasyon")
    public void iSeeTheButtonNameForTemelIKVeOrganizasyon(io.cucumber.datatable.DataTable dataTable) {

        for (int i = 1; i < dataTable.asLists().size(); i++) {
            String expectedTextName = dataTable.row(i).get(0);
            WebElement actualButtonElement = null;
            switch (expectedTextName) {
                case "Temel IK":
                    actualButtonElement = temelIKVeOrganizasyonPage.temelIKButton;
                    break;
                case "Organizasyon":
                    actualButtonElement = temelIKVeOrganizasyonPage.organizasyonButton;
                    break;
                case "İşten ayrılma":
                    actualButtonElement = temelIKVeOrganizasyonPage.istenAyrilmaButton;
                    break;
                case "Yeniden İşe Alım":
                    actualButtonElement = temelIKVeOrganizasyonPage.yenidenIseAlimButton;
                    break;
                case "Rol ve Yetki":
                    actualButtonElement = temelIKVeOrganizasyonPage.rolVeYetkiButton;
                    break;
                case "Temel Tanımlamalar":
                    actualButtonElement = temelIKVeOrganizasyonPage.temelTanimlamalarButton;
                    break;
                case "Raporlar":
                    actualButtonElement = temelIKVeOrganizasyonPage.raporlarButton;
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


    //---------------------------------------------------------------------------


    @Then("I click the {string} for Temel IK ve Organizasyon")
    public void iClickTheForTemelIKVeOrganizasyon(String buttonName) {
        WebElement button = getButtonByName(buttonName);
        ReusableMethods.waitForVisibility(button, 5);
        ReusableMethods.jsClick(button);
    }

    @When("I see the text of {string} for Temel IK ve Organizasyon")
    public void iSeeTheTextOfForTemelIKVeOrganizasyon(String expectedText) {
        WebElement textElement = getTextElementByName(expectedText);
        Assert.assertTrue(textElement.getText().equalsIgnoreCase(expectedText));
    }

    @When("I see the all links and descriptions for Temel IK ve Organizasyon")
    public void iSeeTheAllLinksAndDescriptionsForTemelIKVeOrganizasyon(io.cucumber.datatable.DataTable dataTable) {
        Map<String, WebElement[]> actualElementsMap = createElementsMap();
        verifyLinksAndDescriptions(dataTable, actualElementsMap);
    }

    private Map<String, WebElement[]> createElementsMap() {
        Map<String, WebElement[]> actualElementsMap = new HashMap<>();
        // Temel IK Elemanları
        actualElementsMap.put("Çalışanlar", new WebElement[]{temelIKVeOrganizasyonPage.calisanlarLink, temelIKVeOrganizasyonPage.calisanlarDescription});
        actualElementsMap.put("Çalışan - Organizasyon", new WebElement[]{temelIKVeOrganizasyonPage.calisanOrganizasyonLink, temelIKVeOrganizasyonPage.calisanOrganizasyonDescription});
        actualElementsMap.put("Personel Özlük Bilgileri Raporu", new WebElement[]{temelIKVeOrganizasyonPage.personelVeOzlukBilgileriRaporuLink, temelIKVeOrganizasyonPage.personelVeOzlukBilgileriRaporuDescription});
        actualElementsMap.put("Sözleşmeler", new WebElement[]{temelIKVeOrganizasyonPage.sozlesmelerLink, temelIKVeOrganizasyonPage.sozlesmelerDescription});
        actualElementsMap.put("Sözleşme Atama", new WebElement[]{temelIKVeOrganizasyonPage.sozlesmeAtamaLink, temelIKVeOrganizasyonPage.sozlesmeAtamaDescription});
        actualElementsMap.put("IK / Profil Kategorileri", new WebElement[]{temelIKVeOrganizasyonPage.ikProfilKategorileriLink, temelIKVeOrganizasyonPage.ikProfilKategorileriDescription});
        actualElementsMap.put("IK / Profil Bilgileri", new WebElement[]{temelIKVeOrganizasyonPage.ikProfilBilgileriLink, temelIKVeOrganizasyonPage.ikProfilBilgileriDescription});
        actualElementsMap.put("Özgeçmiş Ayarları", new WebElement[]{temelIKVeOrganizasyonPage.ozgecmisAyarlariLink, temelIKVeOrganizasyonPage.ozgecmisAyarlariDescription});
        actualElementsMap.put("Özgeçmiş Bölümleri", new WebElement[]{temelIKVeOrganizasyonPage.ozgecmisBolumleriLink, temelIKVeOrganizasyonPage.ozgecmisBolumleriDescription});
        actualElementsMap.put("Portal Sözleşme Metinleri", new WebElement[]{temelIKVeOrganizasyonPage.portalSozlesmeMetinleriLink, temelIKVeOrganizasyonPage.portalSozlesmeMetinleriDescription});
        actualElementsMap.put("Aile Bilgileri", new WebElement[]{temelIKVeOrganizasyonPage.aileBilgileriLink, temelIKVeOrganizasyonPage.aileBilgileriDescription});
        actualElementsMap.put("Portal Sözleşme (KVKK) Metinleri Raporu", new WebElement[]{temelIKVeOrganizasyonPage.portalSozlesmeKVKKMetinRaporuLink, temelIKVeOrganizasyonPage.portalSozlesmeKVKKMetinRaporuDescription});
        actualElementsMap.put("Doküman Şablonları", new WebElement[]{temelIKVeOrganizasyonPage.dokumanSablonlariLink, temelIKVeOrganizasyonPage.dokumanSablonlariDescription});
        actualElementsMap.put("Portal Sözleşme (KVKK) Metinleri Raporu-Kurum Dışı", new WebElement[]{temelIKVeOrganizasyonPage.portalSozlesmeKVKKMetinRaporu_KurumDisiLink, temelIKVeOrganizasyonPage.portalSozlesmeKVKKMetinRaporu_KurumDisiDescription});
        actualElementsMap.put("Kullanıcı Tanımlı Rapor", new WebElement[]{temelIKVeOrganizasyonPage.kullaniciTanimliRaporLink, temelIKVeOrganizasyonPage.kullaniciTanimliRaporDescription});
        // Organizasyon Elemanları
        actualElementsMap.put("Organizasyon", new WebElement[]{temelIKVeOrganizasyonPage.organizasyonLink, temelIKVeOrganizasyonPage.organizasyonDescription});
        actualElementsMap.put("Organizasyon Öğesi", new WebElement[]{temelIKVeOrganizasyonPage.organizasyonOgesiLink, temelIKVeOrganizasyonPage.organizasyonOgesiDescription});
        actualElementsMap.put("Organizasyon Bölümleri", new WebElement[]{temelIKVeOrganizasyonPage.organizasyonBolumleriLink, temelIKVeOrganizasyonPage.organizasyonBolumleriDescription});
        actualElementsMap.put("Masraf Merkezi Organizasyon Bölümleri", new WebElement[]{temelIKVeOrganizasyonPage.masrafMerkeziOrganizasyonBolumleriLink, temelIKVeOrganizasyonPage.masrafMerkeziOrganizasyonBolumleriDecsription});
        actualElementsMap.put("Özel Organizasyon Bölümleri", new WebElement[]{temelIKVeOrganizasyonPage.ozelOrganizasyonBolumleriLink, temelIKVeOrganizasyonPage.ozelOrganizasyonBolumleriDescription});
        actualElementsMap.put("İş Yerleri", new WebElement[]{temelIKVeOrganizasyonPage.isYerleriLink, temelIKVeOrganizasyonPage.isYerleriDescription});
        actualElementsMap.put("Organizasyon Şeması", new WebElement[]{temelIKVeOrganizasyonPage.organizasyonSemasiLink, temelIKVeOrganizasyonPage.organizasyonSemasiDescription});
        actualElementsMap.put("Lokasyonlar", new WebElement[]{temelIKVeOrganizasyonPage.lokasyonlarLink, temelIKVeOrganizasyonPage.lokasyonlarDescription});
        actualElementsMap.put("Rol Kategorileri", new WebElement[]{temelIKVeOrganizasyonPage.rolKategorileriLink, temelIKVeOrganizasyonPage.rolKategorileriDescription});
        actualElementsMap.put("Yetkilendirme Rolleri", new WebElement[]{temelIKVeOrganizasyonPage.yetkilendirmeRolleriLink, temelIKVeOrganizasyonPage.yetkilendirmeRolleriDescription});
        actualElementsMap.put("Vergi Daireleri", new WebElement[]{temelIKVeOrganizasyonPage.vergiDaireleriLink, temelIKVeOrganizasyonPage.vergiDaireleriDescrition});
        //Isten Ayrilma Elemanları
        actualElementsMap.put("Personeller", new WebElement[]{temelIKVeOrganizasyonPage.personellerLink, temelIKVeOrganizasyonPage.personellerDescription});
        actualElementsMap.put("İşten Ayrılan Çalışanlar", new WebElement[]{temelIKVeOrganizasyonPage.istenAyrilanCalisanlarLink, temelIKVeOrganizasyonPage.istenAyrilanCalisanlarDescription});
        //Yeniden İşe Alım Elemanları
        actualElementsMap.put("Yeniden İşe Alım", new WebElement[]{temelIKVeOrganizasyonPage.yenidenIseAlimLink, temelIKVeOrganizasyonPage.yenidenIseAlimDescription});
        //Rol ve Yetki Elemanları
        actualElementsMap.put("Kullanıcı Sistem Rolleri", new WebElement[]{temelIKVeOrganizasyonPage.kullaniciSistemRolleriLink, temelIKVeOrganizasyonPage.kullaniciSistemRolleriDescription});
        actualElementsMap.put("Rol ve Yetkiler", new WebElement[]{temelIKVeOrganizasyonPage.rolVeYetkilerLink, temelIKVeOrganizasyonPage.rolVeYetkilerDescription});
        actualElementsMap.put("Rol Yetki Atama", new WebElement[]{temelIKVeOrganizasyonPage.rolYetkiAtamaLink, temelIKVeOrganizasyonPage.rolYetkiAtamaDescription});
        //Temel Tanımlamalar Elemanları
        actualElementsMap.put("İşten Çıkış Türü", new WebElement[]{temelIKVeOrganizasyonPage.istenCikisTuruLink, temelIKVeOrganizasyonPage.istenCikisTuruDescription});
        actualElementsMap.put("İşten Çıkış Nedenleri", new WebElement[]{temelIKVeOrganizasyonPage.istenCikisNedenleriLink, temelIKVeOrganizasyonPage.istenCikisNedenleriDescription});
        actualElementsMap.put("Dil Seçenekleri", new WebElement[]{temelIKVeOrganizasyonPage.dilSecenekleriLink, temelIKVeOrganizasyonPage.dilSecenekleriDescription});
        actualElementsMap.put("Temel IK ve Organizasyon Parametreleri", new WebElement[]{temelIKVeOrganizasyonPage.temelIKVeOrganizasyonParametreleriLink, temelIKVeOrganizasyonPage.temelIKVeOrganizasyonParametreleriDescription});
        //Raporlar Elemanları
        actualElementsMap.put("TurkNet Raporlar", new WebElement[]{temelIKVeOrganizasyonPage.turkNetRaporlarLink, temelIKVeOrganizasyonPage.turkNetRaporlarDescription});
        actualElementsMap.put("TürkNet Avans, Masraf, Seyahat Ve Görevlendirme Raporları", new WebElement[]{temelIKVeOrganizasyonPage.turkNetAvansMasrafSeyahatVeGorevlendirmeRaporlariLink, temelIKVeOrganizasyonPage.turkNetAvansMasrafSeyahatVeGorevlendirmeRaporlariDescription});


        return actualElementsMap;
    }

    private void verifyLinksAndDescriptions(io.cucumber.datatable.DataTable dataTable, Map<String, WebElement[]> elementsMap) {
        for (int i = 1; i < dataTable.asLists().size(); i++) {
            String expectedTextName = dataTable.row(i).get(0);
            WebElement[] elements = elementsMap.get(expectedTextName);

            if (elements != null) {
                checkTextAndDescription(elements[1], elements[0]);
            } else {
                throw new RuntimeException("No element found for: " + expectedTextName);
            }
        }
    }
    private Map<String,String> expectedTitleMapMethod(){
        Map<String, String> expTitleMap = new HashMap<>();
        // Temel IK Title
        expTitleMap.put("Çalışanlar","Çalışanlar");
        expTitleMap.put("Çalışan - Organizasyon","Organizasyon Çalışanları");
        expTitleMap.put("Personel Özlük Bilgileri Raporu","Personel Özlük Bilgileri");
        expTitleMap.put("Sözleşmeler","Sözleşmeler");
        expTitleMap.put("Sözleşme Atama","Sözleşme Atamaları");
        expTitleMap.put("IK / Profil Kategorileri","İK / Profil Kategorileri");
        expTitleMap.put("IK / Profil Bilgileri","İK / Profil Bilgileri");
        expTitleMap.put("Özgeçmiş Ayarları","Özgeçmiş Ayarları");
        expTitleMap.put("Özgeçmiş Bölümleri","Özgeçmiş Bölümleri");
        expTitleMap.put("Portal Sözleşme Metinleri","Portal Sözleşme Metinleri");
        expTitleMap.put("Aile Bilgileri","Aile Bilgileri");
        expTitleMap.put("Portal Sözleşme (KVKK) Metinleri Raporu","Portal Sözleşme (KVKK) Metinleri Raporu");
        expTitleMap.put("Doküman Şablonları","Dokümantasyon Şablonları");
        expTitleMap.put("Portal Sözleşme (KVKK) Metinleri Raporu-Kurum Dışı","Portal Sözleşme Metinleri Raporu - Kurum Dışı");
        expTitleMap.put("Kullanıcı Tanımlı Rapor","Reports");
        // Organizasyon Title
        expTitleMap.put("Organizasyon","Organizasyonlar");
        expTitleMap.put("Organizasyon Öğesi","Organizasyon Öğeleri");
        expTitleMap.put("Organizasyon Bölümleri","Organizasyon Bölümleri");
        expTitleMap.put("Masraf Merkezi Organizasyon Bölümleri","Maliyet Merkezi");
        expTitleMap.put("Özel Organizasyon Bölümleri","Özel Organizasyonlar");
        expTitleMap.put("İş Yerleri","İş Yeri");
        expTitleMap.put("Organizasyon Şeması","Organizasyon Şeması");
        expTitleMap.put("Lokasyonlar","Lokasyon Listesi");
        expTitleMap.put("Rol Kategorileri","Kategori");
        expTitleMap.put("Yetkilendirme Rolleri","Roller");
        expTitleMap.put("Vergi Daireleri","Vergi Daireleri");

        // İşten ayrılma Title
        expTitleMap.put("Personeller","Çalışan Çıkış İşlemleri");
        expTitleMap.put("İşten Ayrılan Çalışanlar","İşten Ayrılan Çalışanlar");

        // Yeniden İse Alim Title
        expTitleMap.put("Yeniden İşe Alım","Yeniden İşe Giriş");

        // Rol ve Yetki Title
        expTitleMap.put("Kullanıcı Sistem Rolleri","Kullanıcı Rolleri");
        expTitleMap.put("Rol ve Yetkiler","Rol Listesi");
        expTitleMap.put("Rol Yetki Atama","Yetki Listesi");

        // Temel Tanımlamalar
        expTitleMap.put("İşten Çıkış Türü","Kategori Değerleri");
        expTitleMap.put("İşten Çıkış Nedenleri","Kategori Değerleri");
        expTitleMap.put("Dil Seçenekleri","Kategori Değerleri");
        expTitleMap.put("Temel IK ve Organizasyon Parametreleri","Parametreler");

        // Raporlar Title
        expTitleMap.put("TurkNet Raporlar","Rapor");
        expTitleMap.put("TürkNet Avans, Masraf, Seyahat Ve Görevlendirme Raporları","Rapor");

        return expTitleMap;

    }
    private void clickLinksMethod(io.cucumber.datatable.DataTable dataTable, Map<String, WebElement[]> elementsMap) {
        for (int i = 1; i < dataTable.asLists().size(); i++) {
            String expectedTextName = dataTable.row(i).get(0);
            WebElement[] elements = elementsMap.get(expectedTextName);

            String expectedTitle = expectedTitleMapMethod().get(expectedTextName); //Sayfanın title kontrolü için

            if (elements != null) {
//                checkTextAndDescription(elements[1], elements[0]);
                ReusableMethods.jsClick(elements[0]);
                ReusableMethods.waitFor(3);
                String actualTitle = DriverManager.getDriver().getTitle();
                Assert.assertEquals(actualTitle,expectedTitle);
                DriverManager.getDriver().navigate().back();
            } else {
                throw new RuntimeException("No element found for: " + expectedTextName);
            }
        }
    }

    private void checkTextAndDescription(WebElement actualDescription, WebElement actualElement) {
        ReusableMethods.waitForVisibility(actualElement, 3);
        Assert.assertTrue(actualDescription.isDisplayed());
        Assert.assertTrue(actualElement.isDisplayed());
    }

    private WebElement getButtonByName(String buttonName) {
        switch (buttonName) {
            case "Temel IK ve Organizasyon":
                return homePage.temelIkVeOrganizasyonButton;
            case "Temel IK":
                return temelIKVeOrganizasyonPage.temelIKButton;
            case "Organizasyon":
                return temelIKVeOrganizasyonPage.organizasyonButton;
            case "İşten ayrılma":
                return temelIKVeOrganizasyonPage.istenAyrilmaButton;
            case "Yeniden İşe Alım":
                return temelIKVeOrganizasyonPage.yenidenIseAlimButton;
            case "Rol ve Yetki":
                return temelIKVeOrganizasyonPage.rolVeYetkiButton;
            case "Temel Tanımlamalar":
                return temelIKVeOrganizasyonPage.temelTanimlamalarButton;
            case "Raporlar":
                return temelIKVeOrganizasyonPage.raporlarButton;
            default:
                throw new RuntimeException("Button not found: " + buttonName);
        }
    }

    private WebElement getTextElementByName(String textName) {
        switch (textName) {
            case "Temel IK":
                return temelIKVeOrganizasyonPage.temelIKText;
            case "Organizasyon":
                return temelIKVeOrganizasyonPage.organizasyonText;
            case "İşten ayrılma":
                return temelIKVeOrganizasyonPage.istenAyrilmaText;
            case "Yeniden İşe Alım":
                return temelIKVeOrganizasyonPage.yenidenIseAlimText;
            case "Rol ve Yetki":
                return temelIKVeOrganizasyonPage.rolVeYetkiText;
            case "Temel Tanımlamalar":
                return temelIKVeOrganizasyonPage.temelTanimlamalarText;
            case "Raporlar":
                return temelIKVeOrganizasyonPage.raporlarText;
            default:
                throw new RuntimeException("Text element not found: " + textName);
        }
    }

//---------------------------------------------------------------------------

    @Then("I click the all links for Temel IK ve Organizasyon")
    public void iClickTheAllLinksForTemelIKVeOrganizasyon(io.cucumber.datatable.DataTable dataTable) {
        Map<String, WebElement[]> actualElementsMap = createElementsMap();
        clickLinksMethod(dataTable, actualElementsMap);
    }
//
//    @Then("I click the Organizasyon")
//    public void iClickTheOrganizasyon() {
//        ReusableMethods.waitForVisibility(temelIKVeOrganizasyonPage.organizasyonButton, 5);
//        ReusableMethods.jsClick(temelIKVeOrganizasyonPage.organizasyonButton);
//    }
//
//    @Then("I see the text of Organizasyon")
//    public void iSeeTheTextOfOrganizasyon() {
//        Assert.assertTrue(temelIKVeOrganizasyonPage.organizasyonText.getText().
//                                                    equalsIgnoreCase("Organizasyon"));
//    }
//
//    @Then("I see the all links and descriptions for Organizasyon")
//    public void iSeeTheAllLinksAndDescriptionsForOrganizasyon(io.cucumber.datatable.DataTable dataTable) {
//
//        for (int i = 1; i < dataTable.asLists().size(); i++) {
//            String expectedTextName = dataTable.row(i).get(0);
//            WebElement actualTextLinkElement = null;
//            WebElement actualDescriptionText = null;
//            switch (expectedTextName) {
//                case "Organizasyon":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.organizasyonDescription;
//                    break;
//                case "Organizasyon Öğesi":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonOgesiLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.organizasyonOgesiDescription;
//                    break;
//                case "Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonBolumleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.organizasyonBolumleriDescription;
//                    break;
//                case "Masraf Merkezi Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.masrafMerkeziOrganizasyonBolumleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.masrafMerkeziOrganizasyonBolumleriDecsription;
//                    break;
//                case "Özel Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.ozelOrganizasyonBolumleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.ozelOrganizasyonBolumleriDescription;
//                    break;
//                case "İş Yerleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.isYerleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.isYerleriDescription;
//                    break;
//                case "Organizasyon Şeması":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonSemasiLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.organizasyonSemasiDescription;
//                    break;
//                case "Lokasyonlar":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.lokasyonlarLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.lokasyonlarDescription;
//                    break;
//                case "Rol Kategorileri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.rolKategorileriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.rolKategorileriDescription;
//                    break;
//                case "Yetkilendirme Rolleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.yetkilendirmeRolleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.yetkilendirmeRolleriDescription;
//                    break;
//                case "Vergi Daireleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.vergiDaireleriLink;
//                    actualDescriptionText = temelIKVeOrganizasyonPage.vergiDaireleriDescrition;
//                    break;
//                default:
//                    throw new RuntimeException();
//            }
//            if (actualTextLinkElement != null && actualDescriptionText != null) {
//                checkTextAndDescription(actualDescriptionText, actualTextLinkElement);
//            }
//        }
//
//    }
//    @Then("I click the all links for Organizasyon")
//    public void iClickTheAllLinksForOrganizasyon(io.cucumber.datatable.DataTable dataTable) {
//
//        for (int i = 1; i < dataTable.asLists().size(); i++) {
//            String expectedTextName = dataTable.row(i).get(0);
//            WebElement actualTextLinkElement = null;
//            String expectedTitle = null;
//            switch (expectedTextName) {
//                case "Organizasyon":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonLink;
//                    expectedTitle = "Organizasyonlar";
//                    break;
//                case "Organizasyon Öğesi":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonOgesiLink;
//                    expectedTitle = "Organizasyon Öğeleri";
//                    break;
//                case "Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonBolumleriLink;
//                    expectedTitle = "Organizasyon Bölümleri";
//                    break;
//                case "Masraf Merkezi Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.masrafMerkeziOrganizasyonBolumleriLink;
//                    expectedTitle = "Maliyet Merkezi";
//                    break;
//                case "Özel Organizasyon Bölümleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.ozelOrganizasyonBolumleriLink;
//                    expectedTitle = "Özel Organizasyonlar";
//                    break;
//                case "İş Yerleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.isYerleriLink;
//                    expectedTitle = "İş Yeri";
//                    break;
//                case "Organizasyon Şeması":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.organizasyonSemasiLink;
//                    expectedTitle = "Organizasyon Şeması";
//                    break;
//                case "Lokasyonlar":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.lokasyonlarLink;
//                    expectedTitle = "Lokasyon Listesi";
//                    break;
//                case "Rol Kategorileri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.rolKategorileriLink;
//                    expectedTitle = "Kategori";
//                    break;
//                case "Yetkilendirme Rolleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.yetkilendirmeRolleriLink;
//                    expectedTitle = "Roller";
//                    break;
//                case "Vergi Daireleri":
//                    actualTextLinkElement = temelIKVeOrganizasyonPage.vergiDaireleriLink;
//                    expectedTitle = "Vergi Daireleri";
//                    break;
//                default:
//                    throw new RuntimeException();
//            }
//            if (actualTextLinkElement != null) {
//                ReusableMethods.jsScrollClick(actualTextLinkElement);
//                ReusableMethods.waitFor(3);
//                String actualTitle;
//                actualTitle = DriverManager.getDriver().getTitle();
//                Assert.assertEquals(actualTitle, expectedTitle);
//                DriverManager.getDriver().navigate().back();
//                ReusableMethods.waitFor(3);
//            }
//        }
//    }

//    @Then("I click the Isten Ayrilma")
//    public void iClickTheIstenAyrilma() {
//        ReusableMethods.waitForVisibility(temelIKVeOrganizasyonPage.istenAyrilmaButton, 5);
//        ReusableMethods.jsClick(temelIKVeOrganizasyonPage.istenAyrilmaButton);
//    }
//    @And("I see the text of Isten Ayrilma")
//    public void iSeeTheTextOfIstenAyrilma() {
//       Assert.assertTrue(temelIKVeOrganizasyonPage.istenAyrilmaText.getText().
//               equalsIgnoreCase("İşten Ayrılma"));
//    }


}

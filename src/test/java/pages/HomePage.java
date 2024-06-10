package pages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='icon is-100' and  @href='/Domain/Menu/1043']")
    public WebElement temelIkVeOrganizasyonButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1043';\" and contains(text(),\"Temel IK ve Organizasyon\")]")
    public WebElement temelIkVeOrganizasyonText;

    @FindBy(xpath = "//a[@class='icon is-100' and @href='/Domain/Menu/1042']")
    public WebElement yetenekYonetimiButton;

    @FindBy(xpath = "//p[contains(text(),'Yetenek Yönetimi') and @onclick=\"location.href = '/Domain/Menu/1042';\"]")
    public WebElement yetenekYonetimiText;

    @FindBy(xpath = "//span[@class='tas-03_performans-01']")
    public WebElement performansButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1044';\" and contains(text(),'Performans')]")
    public WebElement performansText;

    @FindBy(xpath = "//div[@class=' big-circlebox ' and @style='background-color: #00D4BC']//span[@class='tas-04_ise_alim_ise_uyum-01']")
    public WebElement iseAlimVeIseUyumButton;

    @FindBy(xpath = "//p[contains(text(),'İşe Alım ve İşe Uyum') and @class=' big-menu-title' and @onclick=\"location.href = '/Domain/Menu/1046';\"]")
    public WebElement iseAlimVeIseUyumText;

    @FindBy(xpath = "//a//span[@class='tas-05_egitim_ve_gelisim_plani-01']")
    public WebElement egitimVeGelisimPlaniButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1047';\" and contains(text(),'Eğitim ve Gelişim Planı')]")
    public WebElement egitimVeGelisimPlaniText;

    @FindBy(xpath = "//*[@id=\"divCompanentMain\"]/div/div/div[6]/div/a")
    public WebElement sinavButton;

    @FindBy(xpath = "//*[@id=\"divCompanentMain\"]/div/div/div[6]/p")
    public WebElement sinavText;

    @FindBy(xpath = "//a[@href=\"/Domain/Menu/1049\"]//span[@class=\"tas-07_is_gucu_analitigi-01\"]")
    public WebElement isGucuAnalitigiVePlanlamasiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1049';\" and contains(text(),'İş Gücü Analitiği ve Planlaması')]")
    public WebElement isGucuAnalitigiVePlanlamasiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1050']//span[@class='tas-08_ucret_ve_yan_haklar-01']")
    public WebElement ucretVeYanHaklarButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1050';\" and contains(text(),'Ücret ve Yan haklar')]")
    public WebElement ucretVeYanHaklarText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1051']//span[@class='tas-09_zaman_ve_devamlilik-01']")
    public WebElement zamanVeDevamlilikButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1051';\" and contains(text(),'Zaman ve Devamlılık')]")
    public WebElement zamanVeDevamlilikText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1052']//span[@class='tas-10_bordrolama-01']")
    public WebElement bordrolamaButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1052';\" and contains(text(),'Bordrolama')]")
    public WebElement bordrolamaText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1053']//span[@class='tas-folder']")
    public WebElement dokumanYonetimiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1053';\" and contains(text(),'Doküman Yönetimi')]")
    public WebElement dokumanYonetimiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1054']//span[@class='tas-12_sorun_ve_talep_yonetimi-01']")
    public WebElement sorunVeTalepYonetimiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1054';\" and contains(text(),'Sorun ve Talep Yönetimi')]")
    public WebElement sorunVeTalepYonetimiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1055']//span[@class='tas-13_masraf_yonetimi-01']")
    public WebElement masrafYonetimiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1055';\" and contains(text(),'Masraf Yönetimi')]")
    public WebElement masrafYonetimiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1056']//span[@class='tas-14_demirbas_ve_zimmet-01']")
    public WebElement demirbasVeZimmetButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1056';\" and contains(text(),'Demirbaş ve Zimmet')]")
    public WebElement demirbasVeZimmetText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1057']//span[@class='tas-15_degerlendirme_ve_anket-01']")
    public WebElement degerlendirmeVeAnketButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1057';\" and contains(text(),'Değerlendirme ve Anket')]")
    public WebElement degerlendirmeVeAnketText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1058']//span[@class='tas-16_cevrimici_toplanti-01']")
    public WebElement cevrimiciToplantiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1058';\" and contains(text(),'Çevrimiçi Toplantı')]")
    public WebElement cevrimiciToplantiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1059']//span[@class='tas-17_ik_portal-01']")
    public WebElement ikPortalButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1059';\" and contains(text(),'IK Portal')]")
    public WebElement ikPortalText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1064']//span[@class='tas-ikon_yetkinlik_bazli_karar-01']")
    public WebElement vMerchButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1064';\" and contains(text(),'vMerch')]")
    public WebElement vMerchText;

    @FindBy(xpath = "//div[@class=' big-circlebox ']//a[@href='/Domain/Menu/1065']")
    public WebElement gorevYonetimiButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1065';\" and contains(text(),'Görev Yönetimi')]")
    public WebElement gorevYonetimiText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1060']//span[@class='tas-11_dokuman_yonetimi']")
    public WebElement ayarlarButton;

    @FindBy(xpath = "//p[@onclick=\"location.href = '/Domain/Menu/1060';\" and contains(text(),'Ayarlar')]")
    public WebElement ayarlarText;

    @FindBy(xpath = "//a[@href='/Domain/Menu/1043']")
    public WebElement IKButton;

    @FindBy(xpath = "//span[@class='icon is-20 tas-grid_header_sag_alt_ev']")
    public WebElement homeIcon;

    @FindBy(xpath = "//div[@id='activeLogoDiv' and @class='logo']")
    public WebElement bilgeAdamLogo;



}
package pages;


import com.qa.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemelIKVeOrganizasyonPage {
  public TemelIKVeOrganizasyonPage() {
      PageFactory.initElements(DriverManager.getDriver(),this);
  }
  @FindBy(xpath = "//div[@onclick=\"location.href = '/Domain/List/55';\"]//article[@class='media']")
  public WebElement temelIKButton;

  @FindBy(xpath = "//p[@data-key='Organizasyon' and @class='scQualToolTip tooltipstered']")
  public WebElement organizasyonButton;

  @FindBy(xpath = "//p[@data-key='İşten ayrılma' and @class='scQualToolTip tooltipstered']")
  public WebElement istenAyrilmaButton;

  @FindBy(xpath = "//p[@data-key='Yeniden İşe Alım' and @class='scQualToolTip tooltipstered']")
  public WebElement yenidenIseAlimButton;

  @FindBy(xpath = "//p[@data-key='Rol ve Yetki' and @class='scQualToolTip tooltipstered']")
  public WebElement rolVeYetkiButton;

  @FindBy(xpath = "//p[@data-key='Temel Tanımlamalar' and @class='scQualToolTip tooltipstered']")
  public WebElement temelTanimlamalarButton;

  @FindBy(xpath = "//p[@data-key='Raporlar' and @class='scQualToolTip tooltipstered']")
  public WebElement raporlarButton;

  @FindBy(xpath = "//h4[text()='Temel IK ve Organizasyon']")
  public WebElement temelIKVeOrganizasyonText;

  @FindBy(xpath = "//h4[text()='Temel IK']")
  public WebElement temelIKText;

  @FindBy(xpath = "//a[@href='/DomainUser/GetUserList/' and text()='Çalışanlar']")
  public WebElement calisanlarLink;

  @FindBy(xpath = "//div[contains(text(),'Kullanıcıların listelendiği sayfadır')]")
  public WebElement calisanlarDescription;

  @FindBy(xpath = "//a[@href='/Organization/User/Index/' and text()='Çalışan - Organizasyon']")
  public WebElement calisanOrganizasyonLink;

  @FindBy(xpath = "//div[contains(text(),'Organizasyon çalışanlarının listelendiği sayfadır.')]")
  public WebElement calisanOrganizasyonDescription;

  @FindBy(xpath = "//a[@href='/Employee/Report/Index/' and text()='Personel Özlük Bilgileri Raporu']")
  public WebElement personelVeOzlukBilgileriRaporuLink;

  @FindBy(xpath = "//div[contains(text(),'Personel özlük bilgileriyle ilgili rapor çıktısı alınmasını sağlayan sayfadır.')]")
  public WebElement personelVeOzlukBilgileriRaporuDescription;

  @FindBy(xpath = "//a[@href='/Agreement/Definition/Definitions/' and text()='Sözleşmeler']")
  public WebElement sozlesmelerLink;

  @FindBy(xpath = "//div[contains(text(),'Sözleşmeleri görüntüleyebilir, güncelleyebilir ve silebilirsiniz.')]")
  public WebElement sozlesmelerDescription;

  @FindBy(xpath = "//a[@href='/Agreement/Assignment/Assignments/' and text()='Sözleşme Atama']")
  public WebElement sozlesmeAtamaLink;

  @FindBy(xpath = "//div[contains(text(),'Sözleşme atamalarını görüntüleyebilir, güncelleyebilir ve silebilirsiniz.')]")
  public WebElement sozlesmeAtamaDescription;

  @FindBy(xpath = "//a[@href='/DomainUser/GetVariableFormInputCategoryList/' and text()='IK / Profil Kategorileri  ']")
  public WebElement ikProfilKategorileriLink;

  @FindBy(xpath = "//div[contains(text(),'IK / Kategori Listesinin gösterildiği sayfadır.')]")
  public WebElement ikProfilKategorileriDescription;

  @FindBy(xpath = "//a[@href='/DomainUser/GetVariableFormInputList/' and text()='IK / Profil Bilgileri']")
  public WebElement ikProfilBilgileriLink;

  @FindBy(xpath = "//div[contains(text(),'Eklenmiş olan IK/Profil bilgilerinin listelendiği sayfadır. ')]")
  public WebElement ikProfilBilgileriDescription;

  @FindBy(xpath = "//a[@href='/Resume/Index/' and text()='Özgeçmiş Ayarları']")
  public WebElement ozgecmisAyarlariLink;

  @FindBy(xpath = "//div[contains(text(),'Özgeçmiş ayarlarının yapıldığı sayfadır. ')]")
  public WebElement ozgecmisAyarlariDescription;

  @FindBy(xpath = "//a[@href='/Resume/CvParts/' and text()='Özgeçmiş Bölümleri']")
  public WebElement ozgecmisBolumleriLink;

  @FindBy(xpath = "//div[contains(text(),'Özgeçmiş bölümlerinin listelendiği sayfadır. ')]")
  public WebElement ozgecmisBolumleriDescription;

  @FindBy(xpath = "//a[@href='/Settings/ContractTextIndex/' and text()='Portal Sözleşme Metinleri']")
  public WebElement portalSozlesmeMetinleriLink;

  @FindBy(xpath = "//div[contains(text(),'Kurum İçi ve Kurum Dışı; KVKK, Çalışan Bilgileri Doğruluğu ve Başvuru Bilgileri Doğruluğu')]")
  public WebElement portalSozlesmeMetinleriDescription;

  @FindBy(xpath = "//a[@href='/Family/AllFamilyForms/' and text()='Aile Bilgileri']")
  public WebElement aileBilgileriLink;

  @FindBy(xpath = "//div[contains(text(),'Çalışanlara ait aile bilgilerinin yönetilebildiği ekrandır.')]")
  public WebElement aileBilgileriDescription;

  @FindBy(xpath = "//a[@href='/Settings/DomainUserApproveReports/' and text()='Portal Sözleşme (KVKK) Metinleri Raporu']")
  public WebElement portalSozlesmeKVKKMetinRaporuLink;

  @FindBy(xpath = "//div[contains(text(),'Portal sözleşme metinleri  onay durumlarını listeleyibilrsiniz. ')]")
  public WebElement portalSozlesmeKVKKMetinRaporuDescription;

  @FindBy(xpath = "//a[@href=\"/Settings/ExternalUserApproveReports/\" and text()=' Portal Sözleşme (KVKK) Metinleri Raporu-Kurum Dışı']")
  public WebElement portalSozlesmeKVKKMetinRaporu_KurumDisiLink;

  @FindBy(xpath = "//div[contains(text(),'Kurum Dışı - Portal sözleşme metinleri onay durumlarını listeleyebilirsiniz. ')]")
  public WebElement portalSozlesmeKVKKMetinRaporu_KurumDisiDescription;

  @FindBy(xpath = "//a[@href='/Document/DocumentTemplate/DocumentTemplates/' and text()='Doküman Şablonları']")
  public WebElement dokumanSablonlariLink;

  @FindBy(xpath = "//div[contains(text(),'Doküman Şablonları Listesi')]")
  public WebElement dokumanSablonlariDescription;

  @FindBy(xpath = "//a[@href='/ReportEngine/ReportEngine/Reports/' and text()='Kullanıcı Tanımlı Rapor']")
  public WebElement kullaniciTanimliRaporLink;

  @FindBy(xpath = "//div[contains(text(),'Kullanıcı Tanımlı Rapor ')]")
  public WebElement kullaniciTanimliRaporDescription;

  @FindBy(xpath = "//h4[text()='Organizasyon']")
  public WebElement organizasyonText;

  @FindBy(xpath = "//a[@href=\"/Organization/Definition/Organization/\"]")
  public WebElement organizasyonLink;

  @FindBy(xpath = "//div[contains(text(),'Şirketinize ait organizasyon tiplerinin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement organizasyonDescription;

  @FindBy(xpath = "//a[@href=\"/Organization/Element/Index/\"]")
  public WebElement organizasyonOgesiLink;

  @FindBy(xpath = "//div[contains(text(),'Organizasyon öğelerinin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement organizasyonOgesiDescription;

  @FindBy(xpath = "//a[@href=\"/Organization/Unit/Index/\"]")
  public WebElement organizasyonBolumleriLink;

  @FindBy(xpath = "//div[contains(text(),'Organizasyon bölümlerinin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement organizasyonBolumleriDescription;

  @FindBy(xpath = "//a[@href=\"/Organization/Definition/CostCenter/\"]")
  public WebElement masrafMerkeziOrganizasyonBolumleriLink;

  @FindBy(xpath = "//div[contains(text(),'Masraf Merkezi organizasyon bölümleri bölümlerinin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement masrafMerkeziOrganizasyonBolumleriDecsription;

  @FindBy(xpath = "//a[@href=\"/Organization/Definition/Special/\"]")
  public WebElement ozelOrganizasyonBolumleriLink;

  @FindBy(xpath = "//div[contains(text(),'Özel organizasyon bölümlerinin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement ozelOrganizasyonBolumleriDescription;

  @FindBy(xpath = "//a[@href=\"/Domain/Workshop/List/\"]")
  public WebElement isYerleriLink;

  @FindBy(xpath = "//div[contains(text(),'Yasal İş Yerlerinin listelendiği sayfadır. Sayfada ekleme, güncelleme, silme, aktif/pasif işlemleri yapılmaktadır.')]")
  public WebElement isYerleriDescription;

  @FindBy(xpath = "//a[@href=\"/Department/OrganizationPage/\"]")
  public WebElement organizasyonSemasiLink;

  @FindBy(xpath = "//div[contains(text(),'Organizasyonunuza ait departmanların ilişki şemasının, fonksiyonel ve idari olarak gösterildiği sayfadır.')]")
  public WebElement organizasyonSemasiDescription;

  @FindBy(xpath = "//a[@href=\"/Settings/GetLocationList/\"]")
  public WebElement lokasyonlarLink;

  @FindBy(xpath = "//div[contains(text(),'Lokasyonları ekleme, silme, güncelleme, aktif pasif yapıldığı bölümdür.')]")
  public WebElement lokasyonlarDescription;

  @FindBy(xpath = "//a[@href=\"/DomainCategory/GetCategoryList/\"]")
  public WebElement rolKategorileriLink;

  @FindBy(xpath = "//div[contains(text(),'Kategorilerin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement rolKategorileriDescription;

  @FindBy(xpath = "//a[@href=\"/DomainRole/GetRoleList/\"]")
  public WebElement yetkilendirmeRolleriLink;

  @FindBy(xpath = "//div[contains(text(),'Rollerin listelendiği sayfadır. Bu sayfa üzerinden silme, ekleme ve düzenlemeleri yapılabilir.')]")
  public WebElement yetkilendirmeRolleriDescription;

  @FindBy(xpath = "//a[@href=\"/Domain/TaxOffices/List/\"]")
  public WebElement vergiDaireleriLink;

  @FindBy(xpath = "//div[contains(text(),'Vergi Dairesi ekleyebilir, düzenleyebilir ve silebilirsiniz.')]")
  public WebElement vergiDaireleriDescrition;

  @FindBy(xpath = "//h4[text()='İşten ayrılma']")
  public WebElement istenAyrilmaText;

  @FindBy(xpath = "//a[@href=\"/Employee/Exit/Index/\"]")
  public WebElement personellerLink;

  @FindBy(xpath = "//div[text()='Personellerin çıkış işlemlerinin yapıldığı yönetim sayfasıdır. ']")
  public WebElement personellerDescription;

  @FindBy(xpath = "//a[@href=\"/Employee/Exit/DomainUsersLeavingTheJob/\"]")
  public WebElement istenAyrilanCalisanlarLink;

  @FindBy(xpath = "//div[text()='İşten  ayrılan çalışanlar listelenir ve sgk çıkış raporu alınabilir. ']")
  public WebElement istenAyrilanCalisanlarDescription;

  @FindBy(xpath = "//h4[text()='Yeniden İşe Alım']")
  public WebElement yenidenIseAlimText;

  @FindBy(xpath = "//a[@href=\"/RecruitAgain/Index/\" and text()='Yeniden İşe Alım']")
  public WebElement yenidenIseAlimLink;

  @FindBy(xpath = "//div[contains(text(),'Yeniden işe alım süreçlerinin yönetildiği sayfadır.')]")
  public WebElement yenidenIseAlimDescription;

  @FindBy(xpath = "//h4[text()='Rol ve Yetki']")
  public WebElement rolVeYetkiText;

  @FindBy(xpath = "//a[@href=\"/Authorization/ListDomainUserRoles/\" and text()=' Kullanıcı Sistem Rolleri ']")
  public WebElement kullaniciSistemRolleriLink;

  @FindBy(xpath = "//div[contains(text(), 'Kullanıcıların sistem rollerinin listelendiği sayfadır. Sayfada rol ekleme, güncelleme yapılmaktadır.')]")
  public WebElement kullaniciSistemRolleriDescription;

  @FindBy(xpath = "//a[@href=\"/Domain/RoleAndAuthorities/\" and text()='Rol ve Yetkiler']")
  public WebElement rolVeYetkilerLink;

  @FindBy(xpath = "//div[text()='Rol ve yetkiler ']")
  public WebElement rolVeYetkilerDescription;

  @FindBy(xpath = "//a[@href=\"/Domain/AuthAssignments/\" and text()='Rol Yetki Atama']")
  public WebElement rolYetkiAtamaLink;

  @FindBy(xpath = "//div[contains(text(),'Rol yetki ataması ')]")
  public WebElement rolYetkiAtamaDescription;

  @FindBy(xpath = "//h4[text()='Temel Tanımlamalar']")
  public WebElement temelTanimlamalarText;

  @FindBy(xpath = "//a[@href=\"/SystemGeneral/CategoryDefinitionList/66/\" and contains(text(),'İşten Çıkış Türü')]")
  public WebElement istenCikisTuruLink;

  @FindBy(xpath = "//div[contains(text(),'İşten çıkış türünü (istifa ya da iş akti feshi) belirler.')]")
  public WebElement istenCikisTuruDescription;

  @FindBy(xpath = "//a[@href=\"/SystemGeneral/CategoryDefinitionList/67/\" and contains(text(),'İşten Çıkış Nedenleri')]")
  public WebElement istenCikisNedenleriLink;

  @FindBy(xpath = "//div[contains(text(),'İşten çıkış sebepleri ')]")
  public WebElement istenCikisNedenleriDescription;

  @FindBy(xpath = "//a[@href=\"/SystemGeneral/CategoryDefinitionList/75/\" and contains(text(),'Dil Seçenekleri')]")
  public WebElement dilSecenekleriLink;

  @FindBy(xpath = "//div[contains(text(),'Diğer')]")
  public WebElement dilSecenekleriDescription;

  @FindBy(xpath = "//a[@href=\"/Parameter/GeneralParameterList/145/\" and contains(text(),'Temel IK ve Organizasyon Parametreleri')]")
  public WebElement temelIKVeOrganizasyonParametreleriLink;

  @FindBy(xpath = "//div[contains(text(),'Temel IK ve Organizasyon Parametreleri')]")
  public WebElement temelIKVeOrganizasyonParametreleriDescription;

  @FindBy(xpath = "//h4[text()='Raporlar']")
  public WebElement raporlarText;

  @FindBy(xpath = "//a[@href=\"/CustomerReport/TurkNet/Index/\" and text()='TurkNet Raporlar']")
  public WebElement turkNetRaporlarLink;

  @FindBy(xpath = "//div[contains(text(),'TurkNet çalışan özlük bilgileri, işe giriş/çıkış gibi raporların olduğu sayfadır.')]")
  public WebElement turkNetRaporlarDescription;

  @FindBy(xpath = "//a[@href=\"/CustomerReport/TurkNetCustomReport/Index/\" and text()='TürkNet Avans, Masraf, Seyahat Ve Görevlendirme Raporları']")
  public WebElement turkNetAvansMasrafSeyahatVeGorevlendirmeRaporlariLink;

  @FindBy(xpath = "//div[contains(text(),'TürkNet avans, masraf, seyahat ve görevlendirme raporlarının alındığı sayfadır.')]")
  public WebElement turkNetAvansMasrafSeyahatVeGorevlendirmeRaporlariDescription;


}

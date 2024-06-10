@all @homepage
Feature: Main Menu
  Scenario: Control of all buttons
    Given I see Giris Sayfasi page
    Then I click the UserName
    Then I click the UserName type "validUserName"
    Then I click the Password type "validPassword"
    When I click the LoginButton
    And User waits for 3 seconds
    Given I see the button_name and text_name
      | text_name                       |
      | Temel IK ve Organizasyon        |
      | Yetenek Yönetimi                |
      | Performans                      |
      | İşe Alım ve İşe Uyum            |
      | Eğitim ve Gelişim Planı         |
     # | Sınav                           |
      | İş Gücü Analitiği ve Planlaması |
      | Ücret ve Yan haklar             |
      | Zaman ve Devamlılık             |
      | Bordrolama                      |
      | Doküman Yönetimi                |
     # | Sorun ve Talep Yönetimi         |
      | Masraf Yönetimi                 |
      | Demirbaş ve Zimmet              |
      | Değerlendirme ve Anket          |
      | Çevrimiçi Toplantı              |
      | IK Portal                       |
     # | vMerch                          |
      | Görev Yönetimi                  |
      | Ayarlar                         |
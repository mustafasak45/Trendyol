Feature: Login
  @deneme
  Scenario: Correct Login
    Given Giris sayfasina gidilir
    Then Dogru kullanici adi girilir
    Then Dogru sifre girilir
    And Giris buttonuna tiklanir
    And Giris yapildigi gorulur
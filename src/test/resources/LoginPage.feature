@logintest
Feature: Login Page Testleri
  Background:
    Given Kullanici URL gider
    And Kullanici dogru kullanici adini girer
    And Kullanici dogru sifre girer
    Then Kullanici giris buttonuan tiklar
    When Kullanici giris yaptigini gorur

  Scenario: Pozitif test
    And Temel IK ve Organizasyon buttonuna tiklanir
    And Temel IK ve Organizasyon sayfasinin acildigi gorulur

    Scenario: Yetenek Yönetimi
      And Yetenek Yonetimi buttonuna tiklanir
      And Yetenek Yonetimi sayfasinin acildigi gorulur
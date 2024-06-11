Feature: Login Page Testleri
  @logintest
  Scenario: Pozitif test
    Given Kullanici URL gider
    And Kullanici dogru kullanici adini girer
    And Kullanici dogru sifre girer
    Then Kullanici giris buttonuan tiklar
    When Kullanici giris yaptigini gorur

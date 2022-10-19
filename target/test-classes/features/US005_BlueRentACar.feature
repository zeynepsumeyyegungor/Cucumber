@blue
Feature: US005 Blue RentaCar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then kullanici 2 saniye bekler
    Then Login yazisina tiklar
    Then kullanici 2 saniye bekler
    And gecersiz username girer
    Then kullanici 2 saniye bekler
    And gecersiz password girer
    Then kullanici 2 saniye bekler
    And Login butonuna basar
    Then kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    #And sayfayi kapatir AmazonPage class'indan kullandik

Feature: Parametre Kullanimi

  Scenario: TC001 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekeler
    When url'in "facebook" icerdigini test edelim
    And sayfayi kapatir
  @gp2
  Scenario: TC002 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "google" sayfasina gider
    Then kullanici 3 saniye bekeler
    When url'in "google" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC003 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekeler
    When url'in "blue" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC004 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici 3 saniye bekeler
    When url'in "amazon" icerdigini test edelim
    And sayfayi kapatir

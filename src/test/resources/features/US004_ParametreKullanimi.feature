Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://trendyol.com" sayfasinda
    Then kullanici 3 saniye bekeler
    When url'in "trend" icerdigini test edelim
    And sayfayi kapatir
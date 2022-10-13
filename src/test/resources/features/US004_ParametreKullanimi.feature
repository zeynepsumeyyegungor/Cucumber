Feature: US004 Parametre Kullanimi
  @gp5
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://trendyol.com" sayfasinda
    Then kullanici 3 saniye bekeler
    When url'in "trendyol" icerdigini test edelim
    And sayfayi kapatir
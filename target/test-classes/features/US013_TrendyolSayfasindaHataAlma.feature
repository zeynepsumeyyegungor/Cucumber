Feature: US013 Parametre Kullanimi
  @gp6
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://trendyol.com" sayfasinda
    Then kullanici 3 saniye bekeler
    When url'in "amazon" icerdigini test edelim
    And sayfayi kapatir
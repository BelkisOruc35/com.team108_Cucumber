Feature: US1007 Scenario Outline ile coklu negative login test

  @so
  Scenario Outline: TC11 kullanici verilen listedeki kullanici isimleri ile giris yapamamali
    Given kullanici "qdUrl" anasayfaya gider
    Then cookiesleri kabul eder
    Then ilk login linkine tiklar
    And username olarak examples dan "<username>" girer
    And password olarak examples dan "<password>" girer
    And login butonuna basar
    And 10 saniye bekler
    Then giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
      |username|password|
      |belkisoruc35@gmail.com   |12344   |
      |belkisoruc35@gmail.com     |645363  |
      |Eyup    |jskdbvk |
      |Fidan   |ytefv86 |

















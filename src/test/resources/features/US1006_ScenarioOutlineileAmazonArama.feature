Feature: US1006 Kullanici Scanario outline ile birden fazla kelime aratir

  @ss

  Scenario Outline: TC10 Amazon coklu urun testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazonda "<kelimeler>" icin arama yapar
    And sonuclarin "<kelimeler>" icerdigini test eder

    Examples:
      |kelimeler  |
      |Nutella    |
      |Java       |
      |Samsung    |
      |Apple      |
      |Furkan     |



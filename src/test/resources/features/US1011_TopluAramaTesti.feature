
  Feature: US1011 kullanici liste olarak verilen urunleri aratir

    @paralel2
    Scenario Outline: TC17 Verilen her bir urun bulunabilmeli

      Given kullanici "toUrl" anasayfaya gider
      When arama kutusuna "<aratilacakUrun>" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder


      Examples:
      |aratilacakUrun|
      |phone         |
      |samsung       |
      |java          |
      |apple         |
      |cokoprens     |
      |dress         |


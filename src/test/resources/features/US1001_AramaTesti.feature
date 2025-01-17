
  Feature: US1001 Kullanici testotomasyonu sayfasinda arama yapar

    Scenario: TC01 kullanici phone arattiginda sonuc bulabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir




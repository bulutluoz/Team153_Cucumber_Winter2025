
  Feature: US1004 Kullanici background ile bastaki tekrarlardan kurtulur

    Background: ortak baslangic adimlari
      Given kullanici testotomasyonu anasayfaya gider

    Scenario: TC06 kullanici phone arattiginda sonuc bulabilmeli

      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC07 kullanici dress arattiginda sonuc bulabilmeli

      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC08 kullanici Java arattiginda sonuc bulamamali
      
      When arama kutusuna Java yazip aratir
      Then arama sonucunda urun bulunamadigini test eder
      And sayfayi kapatir

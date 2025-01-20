
  Feature: US1005 Kullanici parametre olarak verilen urunu aratir

    Scenario: TC09 Kullanici verilen her urunu tek step ile aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "apple" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And aratma sonuclarindan ilk urunu tiklar
      And senkronizasyon icin 2 saniye bekler
      Then acilan urun sayfasindaki urun isminde case sensitive olmadan "apple" bulundugunu test eder
      And sayfayi kapatir

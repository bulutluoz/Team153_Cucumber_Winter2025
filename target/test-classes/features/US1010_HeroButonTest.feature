
  Feature: US1010 Kullanici butonlari kullanir


    Scenario: TC16 Kullanici butonlarin gorundugunu ve calistigini test eder

      Given kullanici "heroUrl" anasayfaya gider
      When kullanici Add Element butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And Delete butonu’nun gorunur oldugunu test eder
      Then Delete tusuna basar
      And Add Remove Elements yazisinin gorunur oldugunu test eder
      And senkronizasyon icin 2 saniye bekler
      And sayfayi kapatir

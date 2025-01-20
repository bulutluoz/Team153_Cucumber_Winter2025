
  Feature: US1008 kullanici fake bilgilerle kullanici olusturur
    
    Scenario: TC14 Kullanici fake bilgilerle kullanici olusturabilmeli

      Given kullanici "faceUrl" anasayfaya gider
      Then facebook cookies kabul eder
      And facebook'da yeni hesap olustur butonuna basar
      And senkronizasyon icin 1 saniye bekler
      When Faker class'indan bilgilerle facebook kayit formunu doldurur
      Then senkronizasyon icin 2 saniye bekler
      And facebook kayit ol tusuna basar
      Then senkronizasyon icin 2 saniye bekler
      And sayfayi kapatir
  
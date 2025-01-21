
  Feature: US1009 Saucedemo alisveris sepeti testi


    Scenario: TC15 Kullanici sepete dogru urun eklendigini test edebilmeli

      Given kullanici "saucedemoUrl" anasayfaya gider
      And senkronizasyon icin 2 saniye bekler
      Then saucedemo username kutusuna "standard_user" yazar
      And saucedemo password kutusuna "secret_sauce" yazar
      And senkronizasyon icin 2 saniye bekler
      Then saucedemo login tusuna basar
      And saucedemo ilk urunun ismini kaydeder ve bu urunun sayfasina gider
      When saucedemo add to Cart butonuna basar
      Then saucedemo alisveris sepetine tiklar
      And senkronizasyon icin 2 saniye bekler
      And saucedemo sectigi urunun basarili olarak sepete eklendigini test eder
      And senkronizasyon icin 2 saniye bekler
      And sayfayi kapatir
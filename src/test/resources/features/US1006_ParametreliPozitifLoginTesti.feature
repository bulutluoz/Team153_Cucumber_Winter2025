
  Feature: US1006 kullanici gecerli bilgilerle giris yapar

    @smoke @kullaniciE2E @saticiE2E
    Scenario: TC10 Kullanici configuration dosyasindaki gecerli datalarla giris yapabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      Then anasayfadaki account linkine tiklar
      When email kutusuna configuration dosyasindaki "toGecerliEmail" degerini girer
      And password kutusuna configuration dosyasindaki "toGecerliPassword" degerini girer
      And senkronizasyon icin 3 saniye bekler
      Then login sayfasindaki signIn butonuna basar
      And basarili sekilde giris yapilabildigini test eder
      And senkronizasyon icin 3 saniye bekler
      Then logout butonuna basar
      And sayfayi kapatir
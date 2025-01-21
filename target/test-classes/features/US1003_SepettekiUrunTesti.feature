
  Feature: US1003 Kullanici sepete dogru urun ekleyebilmeli

    @smoke
    Scenario: TC05 Kullanici sepete ekledigi urunun dogru sekilde sepete eklendigini kontrol edebilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna belirlenen aranacak kelimeyi yazip aratir
      Then aratma sonuclarindan ilk urunu tiklar
      And acilan urun sayfasindaki urun ismini kaydeder
      And urunu sepete ekler
      When your cart linkine tiklar
      Then sepetteki urun ismi ile daha once kaydettigi ismin case sensitive olmadan ayni oldugunu test eder
      And sayfayi kapatir



  Feature:US1018 Kullanici tablodaki sirket listesini yazdirir

    Scenario: TC26 Kullanici istenen sirketlerin listede oldugunu test eder

      Given kullanici "guru99Url" anasayfaya gider
      Then Company listesini consola yazdirir
      And listede 20'den fazla sirket oldugunu test eder
      And  "Jet Airways" %Change oraninin pozitif oldugunu test eder
      Then senkronizasyon icin 3 saniye bekler
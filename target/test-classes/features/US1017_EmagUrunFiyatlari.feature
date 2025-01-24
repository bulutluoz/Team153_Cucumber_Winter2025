
  Feature: US1017 kullanici urun fiyatlarini kaydeder
    
    Scenario: TC25 kullanici exceldeki urunlerin fiyatlarini kaydedebilmeli
      
      Given kullanici "emagUrl" anasayfaya gider
      Then urunListesi2 excelindeki Sheet1'e gider
      And birinci satirdaki bos olan ilk hucrenin indexini kaydeder
      Then birinci satirdaki bos olan ilk hucreye gunun tarihini kaydeder
      And her satirdaki urunu emag sitesinde aratir ve bulunan urunlerden ilkinin fiyatini kaydedilen index'deki sutuna yazar


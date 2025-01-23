
  Feature: US1015 Kullanici butonlari kullanir
    @wip
    Scenario:TC21 Kullanici butonlarin calistirabilmeli

      Given kullanici "demoqaUrl" anasayfaya gider
      Then Alerts’e tiklar
      When On button click, alert will appear after 5 seconds karsisindaki click me butonuna basar
      And Alert’in gorunur olmasini bekler
      Then Alert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test eder
      And Ok diyerek alerti kapatir








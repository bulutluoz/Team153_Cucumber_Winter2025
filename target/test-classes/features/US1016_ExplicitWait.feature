
  Feature:US1016 kullanici butonun erisilebilir olmasini bekler

    Scenario: TC22 Kullanici buton erisilebilir oluncaya kadar bekleyip
              butonun erisilebilir oldugunu test edebilmeli

    Given kullanici "demoqaUrl" anasayfaya gider
    Then Elements menusunu acar
    And Dynamic Properties menusune gider
    When Will enable 5 seconds butonunun enable olmasini bekler
    And Will enable 5 seconds butonunun enable oldugunu test eder




    Scenario: TC23 Kullanici buton gorunur oluncaya kadar bekleyip
                   butonun erisilebilir oldugunu test edebilmeli

    Given kullanici "demoqaUrl" anasayfaya gider
    Then Elements menusunu acar
    And Dynamic Properties menusune gider
    When Visible after 5 seconds butonunun gorunur olmasini bekler
    And Visible after 5 seconds butonunun gorunur oldugunu test eder

  Feature: US1012 verilen gecersiz bilgilerle giris yapilamaz


    Scenario Outline: TC18 Kullanici yanlis bilgilerle giris yapamamali

      Given kullanici "toUrl" anasayfaya gider
      When anasayfadaki account linkine tiklar
      Then email kutusuna listede verilen "<verilenEmail>" degerini girer
      And password kutusuna listede verilen "<verilenPassword>" degerini girer
      And login sayfasindaki signIn butonuna basar
      Then basarili olarak giris yapilamadigini test eder




    Examples:
    |verilenEmail    		|verilenPassword    |
    |esra@fmail.com  		|1234555            |
    |gamze@gmail.com 	    |mesela123          |
    |zehra@zmail.com 	    |asdf4321           |
    |ayca@amail.com  	    |6543241tre65       |
    |gulnur@gmail.com	    |123ert678          |
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmagStepdefinitions {
    FileInputStream fileInputStream;
    Workbook workbook;
    Sheet sheet1;
    int ilkBosHucreIndexi;
    String excelDosyaYolu;

    @Then("urunListesi{int} excelindeki Sheet{int}'e gider")
    public void urunlistesiExcelindekiSheetEGider(int onemsiz, int onemsiz2) throws IOException {
        excelDosyaYolu = "src/test/resources/urunListesi2.xlsx";
        fileInputStream = new FileInputStream(excelDosyaYolu);
        workbook = WorkbookFactory.create(fileInputStream);
        sheet1 = workbook.getSheet("Sheet1");

    }


    @And("birinci satirdaki bos olan ilk hucrenin indexini kaydeder")
    public void birinciSatirdakiBosOlanIlkHucreninIndexiniKaydeder() {

        for (int i = 0; i <1000000 ; i++) {

            if (sheet1.getRow(0).getCell(i) == null){
                ilkBosHucreIndexi = i;
                break;
            }
        }

    }

    @Then("birinci satirdaki bos olan ilk hucreye gunun tarihini kaydeder")
    public void birinciSatirdakiBosOlanIlkHucreyeGununTarihiniKaydeder() {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        sheet1.getRow(0)
                .createCell(ilkBosHucreIndexi)
                .setCellValue(localDateTime.format(istenenFormat));

    }

    @And("her satirdaki urunu emag sitesinde aratir ve bulunan urunlerden ilkinin fiyatini kaydedilen index'deki sutuna yazar")
    public void herSatirdakiUrunuEmagSitesindeAratirVeBulunanUrunlerdenIlkininFiyatiniKaydedilenIndexDekiSutunaYazar() throws IOException {









        FileOutputStream fileOutputStream = new FileOutputStream(excelDosyaYolu);
        workbook.write(fileOutputStream);

        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }


}

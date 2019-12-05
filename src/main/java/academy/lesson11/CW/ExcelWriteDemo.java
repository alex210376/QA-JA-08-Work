package academy.lesson11.CW;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo {
    public static void main(String[] args) throws IOException {
        String pathOut = "d:/QA_Java/Files for lesson11/excel-names.xlsx";
        FileOutputStream fos = new FileOutputStream(new File(pathOut));

        XSSFWorkbook workbook = new XSSFWorkbook();
        // Налним данными
        XSSFSheet sheet = workbook.createSheet();

        for(int i=0; i<10;i++){
        XSSFRow row = sheet.createRow(i);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Ашот");}


//        XSSFCell cell1 = row.createCell(1);
//        cell1.setCellValue("Andrew");

        // Физически запись в файл
        workbook.write(fos);
        fos.close();
        workbook.close();
    }

}

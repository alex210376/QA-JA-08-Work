package academy.lesson11.CW;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExcelReadDemo {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String pathIn = "d:/QA_Java/Files for lesson11/excel-names.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook(new File(pathIn));
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);
        String name = cell.getStringCellValue();
        XSSFCell cell1 = row.getCell(1);
        String name1 = cell1.getStringCellValue();
        System.out.println(name);
        System.out.println(name1);

        workbook.close();
    }
}

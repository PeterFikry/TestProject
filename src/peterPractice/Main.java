package peterPractice;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        String path = "/Users/peterghobrial/Downloads/Test.xls";
        FileInputStream fileInputStream = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = hssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelReader {

    public static void main(String[] args){

        try {
            String str = System.getProperty("user.dir")+"\\src\\main\\resources\\excelreader.xlsx";
            FileInputStream fs  = new FileInputStream(new File(str));
            Workbook workbook = new XSSFWorkbook(fs);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row:sheet ) {
                for (Cell cell :  row) {
                    System.out.println(cell);
                }
            }





            System.out.println(str);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

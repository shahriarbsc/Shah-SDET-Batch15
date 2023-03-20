package Class32;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo8 {
    public static void main(String[] args) throws IOException {

        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);  // checked exception
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet2 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        List<Map<String, String>> excelData = new ArrayList<>();



        Row row0 = sheet2.getRow(0);


        for (int i = 1; i < noOfRows; i++) {  // outer for loop

            Row row = sheet2.getRow(i);

            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                rowMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }

            /* it will execute 4 times because of row.   in the iteration keys: Hamid, age, city, salary (row o in spreadsheet Book1 and values are
            for every row there will be new map
             the excel data is a List. we are storing values

             String.valueOf - is same as toSting method. it does the same thing
             row0 is a constant as a variable
             row is keeps changing in each iteration of the loop.

             enhanced for loop does not work with excel file but work with maps



             */


            excelData.add(rowMap);

        }
        System.out.println(excelData);

    }
}

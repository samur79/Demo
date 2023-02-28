package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    String filePath= "SampleData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    @Test
    public void ecxel_write ()throws IOException {
        //first open file to with FileInputStream
        FileInputStream fileInputStream= new FileInputStream(filePath);
        workbook= new XSSFWorkbook(fileInputStream);
        sheet= workbook.getSheet("Employees");

        XSSFCell salaryCell= sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1=sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);
        XSSFCell salary2=sheet.getRow(2).createCell(3);
        salary2.setCellValue(300000);
        XSSFCell salary3=sheet.getRow(3).createCell(3);
        salary3.setCellValue(400000);
        XSSFCell salary4=sheet.getRow(4).createCell(3);
        salary4.setCellValue(500000);


        //TODO: Change Mary's lastname to "Jones"

        for (int rowNum=0;rowNum<sheet.getLastRowNum();rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equalsIgnoreCase("Mary")){
                sheet.getRow(rowNum).getCell(1 ).setCellValue("Jones");
            }
        }


        // we have finished setting up the values
        // now we need to save the file

        //open to write  to the file: FileInputStream ---> reading
        // save changes             : FileOutputStream---> Writing

        FileOutputStream outputStream=new FileOutputStream(filePath);
        // save/wtite changes to the workbook
        workbook.write(outputStream);

        //close all
        outputStream.close();
        workbook.close();
        fileInputStream.close();


    }

}

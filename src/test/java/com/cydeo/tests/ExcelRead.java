package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead  {

    @Test
    public void  read_from_excel ()throws IOException {

    String path="SampleData.xlsx";
    File file= new File(path);
    // To read from  excel we need to load ıt to FileInputStream
    FileInputStream fileInputStream= new FileInputStream(file);

    //workbook>sheet>row>cell  to read data  from
    //<1> create a workbook

    XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);

    //<2> we need to get specific sheet from currently opened file
    XSSFSheet sheet= workbook.getSheet("Employees");

    //<3> Select row and cell
    //print Mary's cell
        //Indexez start from 0

        System.out.println(sheet.getRow(1).getCell(0));

        // printout  developer

        System.out.println(sheet.getRow(3).getCell(2));
        //Return the count of used cells
        //ıt starts from 1

        int usedRows= sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        //Return the number from top cell to bottom cell
        // ıt doesn't care id the cell is emğty or not
        //starts counting from 0

        int lastUsedRow= sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        //Findind a specific name dynamically
        //TODO: Create a logic to print Vinod's name
        for (int rowNum=0;rowNum<usedRows;rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equalsIgnoreCase("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
                //TODO:Create a logic to print out Linda's Job_ID
                // check if the name is Lnda --->print out job_ID of her

                /*for (int rowNum=0;rowNum<usedRows;rowNum++){
                    if (sheet.getRow(rowNum).getCell(0).toString().equalsIgnoreCase("Linda")){
                        System.out.println("Linda's Job_ID "+ sheet.getRow(rowNum).getCell(2));
                    }

                 */
                }


            }
        }



}


package com.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ReadXmlData {
	@Test
	public void Create() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		int count =-1;
		Workbook wb= WorkbookFactory.create(new FileInputStream("C:\\Users\\bekal\\Downloads\\Untitled spreadsheet.xlsx"));
		int coll =wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(coll);
		Row row = wb.getSheet("Sheet1").getRow(0);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(i);
			if (cell.toString().equalsIgnoreCase("un")) {
				count = i;
				System.out.println(count);
			}
			
		}
		System.out.println(count);
		int j = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(j);
		int c = 1;
 		for (int i = 0; i < coll; i++) {
			if(wb.getSheet("Sheet1").getRow(0).getCell(i).toString().equalsIgnoreCase("un")) {
				while (c<=j) {
					System.out.println(wb.getSheet("Sheet1").getRow(c).getCell(count));
					c++;
				}
			}
		}
	}

}
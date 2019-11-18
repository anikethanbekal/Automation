package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataXmlData {
	@DataProvider
	public String[][] CreateUser() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException{
		String[][] s;
		Workbook excel = WorkbookFactory.create(new FileInputStream("‪‪‪‪‪‪‪‪‪C:\\Users\\bekal\\Documents\\New.xlsx"));
		Sheet sheet = excel.getSheet("Sheet1");
		s =new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getLastCellNum()];
		for(int i =1;i<sheet.getPhysicalNumberOfRows();i++)
		{
			for (int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				Cell value = sheet.getRow(i).getCell(j);
				s[i-1][j] = value.toString();
				System.out.println(s[i-1][j]);
			}
		}
		return s;
	}
}

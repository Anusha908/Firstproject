package com.google.crm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.crm.base.Testbase;

public class Testutil extends Testbase{
public static int impwait=30;
XSSFWorkbook book;
XSSFSheet sheet;


public Object [][] getTestData(String Sheetname){

try {
f = new File("C:\\Users\\GOOD\\eclipse-workspace\\pageobjectmodel\\src\\main\\java\\com\\google\\crm\\excel\\contactsample.xlsx");
fis = new FileInputStream(f);
book = new XSSFWorkbook(fis);
XSSFSheet sheet=book.getSheet(Sheetname);
}
catch(FileNotFoundException e) {
	e.printStackTrace();
}
catch(IOException e) {
e.printStackTrace();
}
int row=sheet.getLastRowNum();
int col=sheet.getRow(0).getLastCellNum();
Object[][] data=new Object[row][col];
for(int i=1;i<row;i++) {
	for(int j=0;j<col;j++) {
	data[i][j]=sheet.getRow(i).getCell(j).toString();
	
}
}
return data;
	
	
	
	
	
}







}

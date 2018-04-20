package com.selenium.testng.basics;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import jxl.*;

public class ParameterSamplesFromXL {

	
	 @DataProvider(name = "DP1")
	 public Object[][] createData1() throws Exception{
	        Object[][] retObjArr=getTableArray("C:\\Users\\Karthick Kumar\\Desktop\\TestData.xls","Sheet1", "Login");
	        return(retObjArr);
	 }
	
	 @DataProvider(name = "DP2")
	 public Object[][] createData2() throws Exception{
	        Object[][] retObjArr=getTableArray("C:\\Users\\Karthick Kumar\\Desktop\\TestData.xls","Sheet1", "Register");
	        return(retObjArr);
	 }
	    
	
	@Test(dataProvider="DP1")
	public void X(String x1,String x2){
		System.out.println("value : "+x1);
		System.out.println("value1 : "+x2);
	}
	
	@Test(dataProvider="DP2")
	public void X1(String x1){
		System.out.println("value : "+x1);
	}
	
	
	
	
	public String[][] getTableArray(String xlFilePath, String sheetName, String tableName) throws Exception{
        String[][] tabArray=null;
        
            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName); 
            int startRow,startCol, endRow, endCol,ci,cj;
            Cell tableStart=sheet.findCell(tableName);
            startRow=tableStart.getRow();
            startCol=tableStart.getColumn();

            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                

            endRow=tableEnd.getRow();
            endCol=tableEnd.getColumn();
            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                    "startCol="+startCol+", endCol="+endCol);
            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
            ci=0;

            for (int i=startRow+1;i<endRow;i++,ci++){
                cj=0;
                for (int j=startCol+1;j<endCol;j++,cj++){
                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
                }
            }
        

        return(tabArray);
    }
    
    
	
}
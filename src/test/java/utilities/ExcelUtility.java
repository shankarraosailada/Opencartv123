package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public String path;
	
	ExcelUtility(String path){
		this.path=path;
	}
	
	public int getRowCount(String sheetname) throws IOException {
	fi = new FileInputStream(path);
	workbook = new XSSFWorkbook(fi);
	 sheet = workbook.getSheet(sheetname);
	int rowcount = sheet.getLastRowNum();
	workbook.close();
	fi.close();
	return rowcount;
	}
	
	public int getCellCount(String sheetname,int rownum) throws IOException {
		
		fi = new FileInputStream(path);
		workbook = new  XSSFWorkbook(fi);
		 sheet = workbook.getSheet(sheetname);
	     row = sheet.getRow(rownum);
	     int cellcount = row.getLastCellNum();
	     fi.close();
	     workbook.close();
	     return cellcount;
	}
	
   public String getCellData(String sheetname,int rownum,int columnum) throws IOException {
	   
	   fi = new FileInputStream(path);
	   workbook = new XSSFWorkbook(fi);
	      sheet =  workbook.getSheet(sheetname);
	      row   =   sheet.getRow(rownum);
	       cell  =  row.getCell(columnum);
	       
	       //DataFormatter formatter = new DataFormatter();---->works just like the cell.toString() method 
	       //in for loop while reading the data if there is no data in the cell then it will raise an exception,so 
	       //we will place the data= cell.toString() in the try block ,because if there is no data in the excel cell then it
	       //return an exception ,so in catch block we will mention data = ""; this will return null and execution doesnot stop
	       //there no value is printed and the remaining values in the excel cell will execute ie, read .
	       
	       String data;
	       try {
	      //data =  formatter.formatCellValue(cell);
	       
	       data = cell.toString();
	       }
	       catch(Exception e) 
	       {
	    	   data = "";
	       }
	      workbook.close();
	      fi.close();
	      return data;
   }
}
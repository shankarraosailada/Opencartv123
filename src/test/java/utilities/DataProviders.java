package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "LoginData")
	
	public String [][] getData() throws IOException{
		
		String path = ".\\Testdata\\OpenCart_Login.xlsx";
		
		ExcelUtility util = new ExcelUtility(path);
		int totalrows = util.getRowCount("sheet1");
		int totalcols = util.getCellCount("sheet1",1);
		
		String [][] Logindata = new String[totalrows][totalcols];
		
		for(int i = 1; i<=totalrows;i++) {       // In excel the first row is header part so to ignore we started from 1 onwards
			for(int j=0; j<totalcols ; j++) {
				
			Logindata [i-1][j]  = util.getCellData("sheet1", i, j);   //Array index starts from 0 .this for loop will read all the 
			                                                         //data from the excel and store in the two dimensional array
			}
		}
		
		return Logindata;     //returning two dimensional array
	}
	
	  @DataProvider(name = "ValidEmailPassword")
	
	  public String[][] getValidemailPasswordData() throws IOException{
		  String path =".\\Testdata\\emailpasswords.xlsx";		  
		  ExcelUtility util = new ExcelUtility(path);
		   int totalrows   =   util.getRowCount("sheet1");
		  int totalcols =  util.getCellCount("sheet1", 1);
		  
		  String [][] Validemailpassword = new String [totalrows][totalcols];
		  
		  for(int i=1;i<totalrows;i++) {
			  for(int j=0;j<totalcols;j++) {
				Validemailpassword [i-1][j]=   util.getCellData("sheet1",i, j);
			  }
		  }
		  
		  return Validemailpassword;
	  }
}

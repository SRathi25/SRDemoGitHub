package Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DemoWithExcelXSSF {

	public static void main(String[] args) throws IOException {
		//Two types of excel files
		//1 .xls - we are going to use HSSF classes
		//2 .xlsx - we are going to use XSSF classes
		/*	Workbook->sheet->row->cell	*/
		/*Workbook is an interface which is inherited by HSSF workbook and XSSF workbook 
		 * same is the case for sheet, row and cell 
		 * means Sheet interface is inherited by HSSF Sheet and XSSF Sheet
		 * means Row interface is inherited by HSSF Row and XSSF Row
		 * means Cell interface is inherited by HSSF Cell and XSSF Cell
		 * we are going to use all the above HSSF and XSSF classes
		 */
		
		XSSFWorkbook myWorkbook = new XSSFWorkbook();
		XSSFSheet mySheet=myWorkbook.createSheet("EmpInfo");
		
		Object empData[][]= {{"Emp Id", "Emp Name", "Emp Dept"},
				{3001,"ABC","HR"},
				{3002,"DEF","Sales"},
				{3003,"HIJ","Marketing"}};
		
		int rowcnt=empData.length;
		int colcnt=empData[0].length;
		
		for(int i=0;i<rowcnt;i++)
		{
			XSSFRow myRow=mySheet.createRow(i);	//can create one row at a time
			
			for(int j=0;j<colcnt;j++)
			{
				XSSFCell myCell=myRow.createCell(j);	//can create one row at a time
				Object cellValue=empData[i][j];
				if(cellValue instanceof String)
				{
					myCell.setCellValue((String)cellValue);
				}
				if(cellValue instanceof Integer)
				{
					myCell.setCellValue((Integer) cellValue);
				}
				
			}
			
		}
		
		//to create a file
		String excelPath="E:\\jarFiles\\EmpInfo.xlsx";
		FileOutputStream fos=new FileOutputStream(excelPath);
		myWorkbook.write(fos);
		fos.close();
		System.out.println("File created");
		

	}

}

package Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DemoWithExcelHSSF {

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
		
		HSSFWorkbook myWorkbook=new HSSFWorkbook();
		HSSFSheet mySheet = myWorkbook.createSheet("StudInfo");

		Object studData[][]= {{"Stud Id", "Stud Name", "Stud Marks"},
							{1,"ABC",78},
							{2, "DEF",97},
							{3,"HIJ",67},
							{4,"LMN",83}};
		
		int rowcnt=studData.length;
		int colcnt=studData[0].length;
		
		for(int i=0;i<rowcnt;i++)
		{
			HSSFRow myRow=mySheet.createRow(i);
			for(int j=0;j<colcnt;j++)
			{
				HSSFCell myCell = myRow.createCell(j);
				Object cellValue=studData[i][j];
				if(cellValue instanceof String)
				{
					myCell.setCellValue((String)cellValue);
				}
				if(cellValue instanceof Integer)
				{
					myCell.setCellValue((Integer)cellValue);
				}
			}
		}
		
		//to create a file
		String excelPath="E:\\JarFiles\\StudInfo.xls";
		FileOutputStream fos=new FileOutputStream(excelPath);
		myWorkbook.write(fos);
		fos.close();
		System.out.println("File created");
		
	}

}

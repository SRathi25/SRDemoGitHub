package MavenProject.MavenTutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class DemoReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\JarFiles\\StudInfo.xls");
		HSSFWorkbook myWorkbook=new HSSFWorkbook(fis);
		HSSFSheet mySheet=myWorkbook.getSheet("StudInfo");
		HSSFRow myRow;
		HSSFCell myCell;
		int rowcount=mySheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			myRow=mySheet.getRow(i);
			int colcnt=myRow.getLastCellNum();
			for(int j=0;j<colcnt;j++)
			{
				myCell=myRow.getCell(j);
				switch(myCell.getCellType())
				{
					case STRING:
							System.out.println(myCell.getStringCellValue());
							break;
					case NUMERIC:
							System.out.println(myCell.getNumericCellValue());
							break;
					case BOOLEAN:
							System.out.println(myCell.getBooleanCellValue());
							break;
						default:
							System.out.println(myCell.getDateCellValue());
							break;
				}
			}
		}
		fis.close();
		myWorkbook.close();
	}

}

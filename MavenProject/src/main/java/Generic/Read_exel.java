package Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_exel implements frameWork_constant {
 
	static File f= new File(Register_path);
	public static Object[][] fetchexel() throws Exception
	{
		FileInputStream fil=new FileInputStream(f);
		Workbook w= WorkbookFactory.create(fil);
		Sheet s=w.getSheet("sheet1");
		int rows= s.getPhysicalNumberOfRows();
		int cols= s.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;i<cols;j++)
			{
				data[i][j]= s.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
}

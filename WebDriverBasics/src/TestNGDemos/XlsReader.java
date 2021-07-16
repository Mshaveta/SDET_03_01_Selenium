package TestNGDemos;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/* .xls -  HSSFWorkBook
 * .xlsx - XSSFWorkBook
 * WorkBook,Sheet,Row - I
 * 
 * logiNwithValidCredntials(){}
 */

public class XlsReader {
	private Workbook wb;
	private Sheet sheet;
	private Row row;

	public XlsReader(String wrkBkPath, String sheetName)  {
		try {
			wb = new XSSFWorkbook(wrkBkPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetName);
	}

	public int getRowCount() {
		int lastRowNum = sheet.getLastRowNum();// 5
		int firstRowNum = sheet.getFirstRowNum();// 0
		int ttlRows = lastRowNum - firstRowNum + 1;
		return ttlRows;
	}

	public int getColCount() {
		Row row = sheet.getRow(0);
		int lastColNum = row.getLastCellNum();// 2
		int firstColNum = row.getFirstCellNum();// 0
		int ttlCols = lastColNum - firstColNum;
		return ttlCols;
	}

	public String getCellData(int row, int col) {
		String cellData = sheet.getRow(row).getCell(col).getStringCellValue();
		return cellData;
	}
	
	 

}

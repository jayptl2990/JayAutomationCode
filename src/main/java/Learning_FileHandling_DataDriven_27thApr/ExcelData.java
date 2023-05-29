package Learning_FileHandling_DataDriven_27thApr;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {

	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	@DataProvider(name = "Rediff")
	public static Object[][] getRediffExcelData() throws Exception {
		Object[][] data = ExcelData.readDataFromExcelforRediff("LoginRediff");
		return data;

	}
	
	@DataProvider(name = "TNN")
	public static Object[][] getTNExcelData() throws Exception {
		Object[][] data = ExcelData.readDataFromExcelforTutorialsNinja("LoginTN");
		return data;

	}

	public static Object[][] readDataFromExcelforRediff(String sheetName) throws Exception {
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Learning_FileHandling_DataDriven_27thApr\\ExcelData_TN_Rediff.xlsx");
		workbook = new XSSFWorkbook(ip);
		
		sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);
			
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				CellType celltype = cell.getCellType();

				switch (celltype) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}

			}

		}
		return data;
	}

	public static Object[][] readDataFromExcelforTutorialsNinja(String sheetName) throws Exception {
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Learning_FileHandling_DataDriven_27thApr\\ExcelData_TN_Rediff.xlsx");
		workbook = new XSSFWorkbook(ip);
		sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				CellType celltype = cell.getCellType();

				switch (celltype) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}

			}

		}
		return data;
	}

}

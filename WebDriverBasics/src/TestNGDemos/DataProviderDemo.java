package TestNGDemos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@BeforeClass
	public void launchApp() {
		//sel browser app launch code
	}

	@DataProvider
	public String[][] readData() {
		// Stp1:
		String workBookPath = System.getProperty("user.dir") + "\\src\\TestData\\testData.xlsx";
		// Stp2:
		XlsReader xls = new XlsReader(workBookPath, "Login");
		// St3 count Rows
		int rCount = xls.getRowCount();// 6
		// 4. Cols count
		int cCount = xls.getColCount();// 2

		// rCount-1 --> exclude heading Row
		// crEATING 2d Array to store the values of data cols
		String[][] dataArr = new String[rCount - 1][cCount];

		// loop to read the data from rows and cols
		// for rows
		// i=1, to exclude the heading
		for (int i = 1; i < rCount; i++) {
			// for cols
			for (int j = 0; j < cCount; j++) {
				// to read the data from the col
				dataArr[i - 1][j] = xls.getCellData(i, j);
			}
		}
		return dataArr;
	}

	@Test(dataProvider = "readData")
	public void login(String uname, String password) { // need to pass the number of params as per the nof of cols
														// create dint he excel sheet
		System.out.println(uname + "----" + password);
		
		//username
		//password
	}

}

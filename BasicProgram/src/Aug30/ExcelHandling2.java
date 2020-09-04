package Aug30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelHandling2 {
	private static Scanner sc;
	public void readdatafromRow(int row) throws BiffException, IOException {
	File f = new File("../BasicProgram/src/Aug30/InputData.xls");
	Workbook wk = Workbook.getWorkbook(f);
	Sheet ws =wk.getSheet(0);
	int r = ws.getRows();
	int c =ws.getColumns();		
	for (int i=0;i<r;i++) {
		if(i==row) {
		for (int j=0;j<c;j++) {
			Cell ce= ws.getCell(j, i);
			System.out.println(ce.getContents());
			}	
		}
	}
}
	public static void main(String[] args) throws BiffException, IOException {
		ExcelHandling2 rc = new ExcelHandling2();
		System.out.println("Enter row number of excel(limit 1-10)");
		sc = new Scanner(System.in);
		int initialrow=sc.nextInt();
		rc.readdatafromRow(initialrow);
	
	}


}

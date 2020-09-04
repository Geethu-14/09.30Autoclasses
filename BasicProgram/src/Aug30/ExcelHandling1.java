package Aug30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelHandling1 {
	private static Scanner sc;
	public void readdatafromCell(int row, int col) throws BiffException, IOException {
	File f = new File("../BasicProgram/src/Aug30/InputData.xls");
	Workbook wk = Workbook.getWorkbook(f);
	Sheet ws =wk.getSheet(0);
	int r = ws.getRows();
	int c =ws.getColumns();		
	for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
			Cell ce= ws.getCell(col, row);
			if(col==j || row==i) {
			System.out.println(ce.getContents());
			}	
		}
	}
}
	public static void main(String[] args) throws BiffException, IOException {
		ExcelHandling1 rc = new ExcelHandling1();
		System.out.println("Enter row number and coulumn number of excel(limit 1-10)");
		sc = new Scanner(System.in);
		int initialrow=sc.nextInt();
		sc = new Scanner(System.in);
		int initialcolum=sc.nextInt();
		rc.readdatafromCell(initialrow, initialcolum);
	
	}
}

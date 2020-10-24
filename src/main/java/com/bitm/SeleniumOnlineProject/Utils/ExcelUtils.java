package com.bitm.SeleniumOnlineProject.Utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.SeleniumOnlineProject.DTO.AssignLeaveDTO;
import com.bitm.SeleniumOnlineProject.DTO.CommentDTO;
import com.bitm.SeleniumOnlineProject.DTO.FromDateDTO;
import com.bitm.SeleniumOnlineProject.DTO.LeaveTypeDTO;
import com.bitm.SeleniumOnlineProject.DTO.LoginDTO;
import com.bitm.SeleniumOnlineProject.DTO.ToDateDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;

	public static Sheet getSheet(int sheetNo) throws IOException {
		File f = new File("C:\\Users\\Nayeem\\Desktop\\Data.xlsx");
		inputStream = new FileInputStream(f);

		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;

	}

	public static List<LoginDTO> getLoginData() throws IOException {

		List<LoginDTO> logindata = new ArrayList<LoginDTO>();
		DataFormatter formater = new DataFormatter();
		Iterator<Row> rowiIterator = ExcelUtils.getSheet(0).iterator();

		while (rowiIterator.hasNext()) {
			Row nextRow = rowiIterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			LoginDTO login = new LoginDTO();
			byte cellcounter = 0;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				switch (cellcounter) {
				case 0:
					login.setUsername(formater.formatCellValue(cell));
					cellcounter++;
					break;
				case 1:
					login.setPassword(formater.formatCellValue(cell));
					break;

				case 2:
					login.setUsername(formater.formatCellValue(cell));
					cellcounter++;
					break;

				case 3:
					login.setPassword(formater.formatCellValue(cell));
					break;
				}
			}

			logindata.add(login);

		}
		// workbook.close();
		return logindata;

	}

	public static List<AssignLeaveDTO> getAssignLeavedata() throws IOException {

		List<AssignLeaveDTO> AssignLeaveData = new ArrayList<AssignLeaveDTO>();
		DataFormatter formater = new DataFormatter();
		Iterator<Row> rowiIterator1 = ExcelUtils.getSheet(1).iterator();

		while (rowiIterator1.hasNext()) {
			Row nextrow1 = (Row) rowiIterator1.next();
			Iterator<Cell> cellIterator = nextrow1.cellIterator();
			AssignLeaveDTO AssignLeave = new AssignLeaveDTO();
			byte cellcounter1 = 0;
			while (cellIterator.hasNext()) {
				Cell cell1 = cellIterator.next();

				switch (cellcounter1) {
				case 0:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));
					cellcounter1++;
					break;
				case 1:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));
					cellcounter1++;
					break;

				case 2:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));

					break;

				case 3:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));
					cellcounter1++;
					break;

				case 4:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));
					cellcounter1++;
					break;
				case 5:
					AssignLeave.setEmployeeName(formater.formatCellValue(cell1));
					break;
				}

			}
			AssignLeaveData.add(AssignLeave);

		}
		return AssignLeaveData;
	}

	public static List<LeaveTypeDTO> getLeaveTypedata() throws IOException {

		List<LeaveTypeDTO> LeaveTypedata = new ArrayList<LeaveTypeDTO>();

		DataFormatter formatter = new DataFormatter();
		Iterator<Row> rowetarator2 = ExcelUtils.getSheet(2).iterator();

		while (rowetarator2.hasNext()) {
			Row nextRow2 = (Row) rowetarator2.next();
			Iterator<Cell> ceIterator = nextRow2.cellIterator();
			LeaveTypeDTO LeaveType = new LeaveTypeDTO();
			byte cellCounter2 = 0;
			while (ceIterator.hasNext()) {
				Cell cell2 = ceIterator.next();

				switch (cellCounter2) {
				case 0:
					LeaveType.setLeaveType(formatter.formatCellValue(cell2));

					break;
				}
			}
			LeaveTypedata.add(LeaveType);
		}
		return LeaveTypedata;
	}

	public static List<FromDateDTO> getFromDateData() throws IOException {

		List<FromDateDTO> FromDateData = new ArrayList<FromDateDTO>();
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> roIterator4 = ExcelUtils.getSheet(3).iterator();
		while (roIterator4.hasNext()) {
			Row nexRow4 = roIterator4.next();
			Iterator<Cell> ceIterator4 = nexRow4.cellIterator();
			FromDateDTO fromDate = new FromDateDTO();
			byte cellcounter4 = 0;
			while (ceIterator4.hasNext()) {
				Cell cell = ceIterator4.next();

				switch (cellcounter4) {
				case 0:
					fromDate.setMonth(formatter.formatCellValue(cell));
					cellcounter4++;
					break;

				case 1:
					fromDate.setYear(formatter.formatCellValue(cell));
					cellcounter4++;
					break;

				case 2:
					fromDate.setDate(formatter.formatCellValue(cell));
					break;
				}
			}
			FromDateData.add(fromDate);
		}
		return FromDateData;
	}

	public static List<ToDateDTO> getToDateData() throws IOException {
		List<ToDateDTO> ToDateData = new ArrayList<ToDateDTO>();
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> roIterator6 = ExcelUtils.getSheet(4).iterator();
		while (roIterator6.hasNext()) {
			Row nexRow6 = roIterator6.next();
			Iterator<Cell> ceIterator6 = nexRow6.cellIterator();
			ToDateDTO ToDate = new ToDateDTO();
			byte cellcounter6 = 0;
			while (ceIterator6.hasNext()) {
				Cell cell = ceIterator6.next();

				switch (cellcounter6) {
				case 0:
					ToDate.setMonth(formatter.formatCellValue(cell));
					cellcounter6++;
					break;

				case 1:
					ToDate.setYear(formatter.formatCellValue(cell));
					cellcounter6++;
					break;

				case 2:
					ToDate.setDate(formatter.formatCellValue(cell));
					break;
				}
			}
			ToDateData.add(ToDate);
		}
		return ToDateData;
	}

	public static List<CommentDTO> getCommentData() throws IOException {
		List<CommentDTO> CommentData = new ArrayList<CommentDTO>();
		DataFormatter dataFormatter = new DataFormatter();

		Iterator<Row> roIterator5 = ExcelUtils.getSheet(5).iterator();
		while (roIterator5.hasNext()) {
			Row nextRow5 = (Row) roIterator5.next();
			Iterator<Cell> ceIterator5 = nextRow5.cellIterator();

			CommentDTO Comment = new CommentDTO();
			byte cellcounter5 = 0;

			while (ceIterator5.hasNext()) {
				Cell cell5 = ceIterator5.next();

				switch (cellcounter5) {
				case 0:
					Comment.setCom(dataFormatter.formatCellValue(cell5));
					break;

				}
			}
			CommentData.add(Comment);
		}
		return CommentData;
	}

}

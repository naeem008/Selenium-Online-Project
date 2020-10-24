package com.bitm.SeleniumOnlineProject.DTO;

public class AssignLeaveDTO {

	private String EmployeeName;

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	@Override
	public String toString() {
		return "AssignLeaveDTO [EmployeeName=" + EmployeeName + "]";
	}
}

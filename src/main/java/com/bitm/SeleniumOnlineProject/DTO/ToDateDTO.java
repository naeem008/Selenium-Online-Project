package com.bitm.SeleniumOnlineProject.DTO;

public class ToDateDTO {
	private String Month;
	private String year;
	private String date;
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ToDateDTO [Month=" + Month + ", year=" + year + ", date=" + date + "]";
	}
}

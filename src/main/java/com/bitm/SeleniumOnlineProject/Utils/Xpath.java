package com.bitm.SeleniumOnlineProject.Utils;

import org.apache.poi.xssf.model.Comments;
import org.openqa.selenium.By;

public class Xpath {

	public class LoginModule {
		public static final String Username = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input";

		public static final String password = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input";

		public static final String LoginBTN = "btnLogin";
	}

	public class ClickAssignLeaveModule {

		public static final String AssignLeaveBTN = "quickLinkText";
	}

	public class AssignleaveModule {
		public static final String EmployeeName = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]";
	}
	
	public class ConfirmLeaveAssignmentModule
	{     
		public static final String Confirm = "/html/body/div[1]/div[3]/div[4]/div[3]/input[1]";
	}

	public class LeaveTypeModule {
		public static final String LeaveType = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select";
	}

	public class LeaveBalanceModule {
		public static final String LeaveBalance = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[3]/div/a";
	}

	public class LeaveBalanceDetails {
		public static final String ok = "/html/body/div[1]/div[3]/div[2]/div[3]/input";
	}

	public class FromDateModule {
		public static final String ClickFromdate = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/input";

		public static final String Month = "/html/body/div[3]/div/div/select[1]";

		public static final String Year = "/html/body/div[3]/div/div/select[2]";

		public static final String DAY = "/html/body/div[3]";
	}

	public class ToDateModule {
		public static final String ClickToDate = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input";

		public static final String Month = "/html/body/div[3]/div/div/select[1]";

		public static final String Year = "/html/body/div[3]/div/div/select[2]";

		public static final String DAY = "/html/body/div[3]/table";
	}
	
	public class CommentModule
	{
		public static final String Comments = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[10]/textarea";
	}
	public class ClickAssign
	{
		public static final String Assign = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input";
	}

}

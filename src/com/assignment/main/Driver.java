package com.assignment.main;
import com.assignment.department.*;

public class Driver {
	private static AdminDepartment adminObj = new AdminDepartment();
	private static HrDepartment hrObj = new HrDepartment();
	private static TechDepartment techObj = new TechDepartment();

	public static void main(String [] args) {
		
		System.out.println("Welcome to " + adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());	
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());

		System.out.println();		

		System.out.println("Welcome to " + hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());	
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println();		

		System.out.println("Welcome to " + techObj.departmentName());
		System.out.println(techObj.getTodaysWork());	
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}
}

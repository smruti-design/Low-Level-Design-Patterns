package com.sdw.accessProxyDesign;

public class Main {

	public static void main(String[] args) {
		
		try {
			EmployeeDao emp = new EmployeeDaoProxy();
			emp.create("ADMIN", new Employee());
			System.out.println("operartion successful");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package com.sdw.accessProxyDesign;

public class EmployeeDaoConcrete implements EmployeeDao {
	
	
	@Override
	public void create(String client, Employee obj) throws Exception {
		System.out.println("created new row in Employee table");	
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		System.out.println("deleted row with Employee id " + employeeId);
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		System.out.println("fetching data from dB");
		return null;
	}

}

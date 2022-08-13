package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> employeeList = new ArrayList<>();

	public boolean addEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeList;

	}

	public Employee getemployeebyEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;

			}

		}
		return null;
	}

	public boolean deleteEmpByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employeeList.remove(employee);

			}

		}
		return false;
	}

	public boolean UpdateEmployee(Employee e) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == e.getEmployeeId()) {
				employee.setName(e.getName());
				employee.setSalary(e.getSalary());
				return true;
			}
		}
		return false;
	}

}

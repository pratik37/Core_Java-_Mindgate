package com.mindgate.main;

import java.util.Iterator;
import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee1 = new Employee(1, "pratik", 1000);
		Employee employee2 = new Employee(2, "vineet", 1000);
		Employee employee3 = new Employee(3, "gagan", 1000);
		employeeRepository.addEmployee(employee1);
		employeeRepository.addEmployee(employee2);
		employeeRepository.addEmployee(employee3);
		
//		List<Employee> elist = employeeRepository.getAllEmployees();
//		for (Employee employee : elist) {
//			System.out.println(employee);
//
//		}
//		System.out.println();
//		Employee e = employeeRepository.getemployeebyEmployeeId(2);
//		System.out.println(e);
//
//		System.out.println("B4 Delete");
//		List<Employee> employees = employeeRepository.getAllEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//
//		}
//		boolean result = employeeRepository.deleteEmpByEmployeeId(2);
//		System.out.println("After Delete");
//		employees = employeeRepository.getAllEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//
//		}

		System.out.println("before update");
		List<Employee> employees = employeeRepository.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);

		}
		Employee UpdateEmployee = new Employee(2, "yy", 1000);
		boolean resultUpdate = employeeRepository.UpdateEmployee(UpdateEmployee);
		System.out.println(resultUpdate);
		System.out.println("After Update");
		for (Employee employee : employees) {
			System.out.println(employee);

		}
	}

}

package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;
//List ArrayList
public class CollectionsMain {
	public static void main(String[] args) 
	{
		List<String> nameList = new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("Pratik");
		nameList.add("Pratik m");
		nameList.add("Pratik g");
		nameList.add("Vineet");
		nameList.add("gagan");
		nameList.add("Pratik");
		nameList.add("rohit");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove(2);
		System.out.println(nameList);
		System.out.println(nameList.size());
		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee(101, "Pratik", 1000);
		Employee employee2 = new Employee(102, "Ashish", 1000);
		Employee employee3 = new Employee(103, "Vineet", 1000);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(employeeList);
		System.out.println();
		//set hashset
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Yash");
		nameSet.add("pratik");
		nameSet.add("Yash");
		nameSet.add("anjali");
		nameSet.add("vineet");
		nameSet.add(null);
		nameSet.add(null);
		System.out.println(nameSet);
		System.out.println();
		//sorted tree set
		SortedSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("Yash");
		sortedNameSet.add("pratik");
		sortedNameSet.add("Yash");
		sortedNameSet.add("anjali");
		sortedNameSet.add("vineet");
		System.out.println(sortedNameSet);
		
		System.out.println();
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "vivek");
		employeeMap.put(102, "kavita");
		employeeMap.put(103, "suraj");
		employeeMap.put(104, "siddesh");
		System.out.println(employeeMap);
	Integer i = 50;
	System.out.println(i.hashCode());
	
	System.out.println();
	SortedMap<Integer, String> employeeSortedMap = new TreeMap<>();
	employeeSortedMap.put(1, "Test 1");
	employeeSortedMap.put(10, "Test 10");
	employeeSortedMap.put(4, "Test 4");
	employeeSortedMap.put(6, "Test 6");
	System.out.println(employeeSortedMap);
	
	}

}

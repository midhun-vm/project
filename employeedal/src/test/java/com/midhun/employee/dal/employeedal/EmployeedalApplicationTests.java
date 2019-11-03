package com.midhun.employee.dal.employeedal;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.midhun.employee.dal.entities.Employee;
import com.midhun.employee.dal.repos.EmployeeRepository;


@SpringBootTest
class EmployeedalApplicationTests {
	
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	@Test
	public void test1Add() {
		Employee entity = new Employee();
		entity.setId(2l);
		entity.setFirstName("Midhun1");
		entity.setSurname("V M");
		employeeRepository.save(entity);
	}
	
	@Test
	public void test2Edit() {
		Employee employee = employeeRepository.findById(1l).get();
		employee.setFirstName("Mithuuuu");
		employeeRepository.save(employee);
	}
	
	@Test
	public void test3Delete() {
		Employee employee = new Employee();
		employee.setId(2l);
		employeeRepository.delete(employee);
	}
	
	@Test
	public void test4List() {	
		List<Employee> employeeList=employeeRepository.findAll();
		for(Employee ee: employeeList) {
			System.out.println("The list/n");
			System.out.println(ee.toString());
		}
	}
	
	@Test
	public void test5Count() {	
		long count= employeeRepository.count();
		System.out.println("The no of entries in list is : "+ count);
	}

}
 
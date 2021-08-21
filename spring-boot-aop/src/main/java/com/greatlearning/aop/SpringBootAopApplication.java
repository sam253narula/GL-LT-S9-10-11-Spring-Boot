package com.greatlearning.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.aop.entity.Employee;
import com.greatlearning.aop.service.EmployeeService;
import com.greatlearning.aop.serviceImpl.EmployeeServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootAopApplication implements CommandLineRunner {
		
	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		employeeService.addEmployee(Employee.builder().id(1).name("Samarth Narula").build());
//		employeeService.updateEmployee(Employee.builder().id(1).name("Samarth").build());
//		log.info("Get Employee By Id -> {}",employeeService.getEmployeeById(1));
		
		
	}

}

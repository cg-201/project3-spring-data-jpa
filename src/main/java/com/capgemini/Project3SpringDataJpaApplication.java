package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

@SpringBootApplication
public class Project3SpringDataJpaApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Project3SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee();
		employee.setName("rahul");
		employee.setEmail("rahul@gmail.com");
		employee.setMobile("23233223");
		
		// Create Record :: removes unnecessary lines of program was used in JPA
		 employeeRepository.save(employee);
		// employeeRepository.deleteById(1);
		
		System.out.println("Record Added!!");
	}

}

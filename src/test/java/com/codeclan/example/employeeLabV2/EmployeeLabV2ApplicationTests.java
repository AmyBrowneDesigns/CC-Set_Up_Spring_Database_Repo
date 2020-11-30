package com.codeclan.example.employeeLabV2;

import com.codeclan.example.employeeLabV2.models.Employee;
import com.codeclan.example.employeeLabV2.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabV2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
		Employee Amy= new Employee("Amy", 33, 201, "amybrowne@codeclan.co.uk");
		Employee Matt = new Employee("Matt", 33, 202, "mattm@codeclan.co.uk");
		employeeRepository.save(Amy);
		employeeRepository.save(Matt);



	}

}

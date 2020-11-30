package com.codeclan.example.employeeLabV2.repositories;

import com.codeclan.example.employeeLabV2.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

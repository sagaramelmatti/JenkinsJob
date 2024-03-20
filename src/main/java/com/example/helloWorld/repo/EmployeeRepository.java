package com.example.helloWorld.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.helloWorld.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
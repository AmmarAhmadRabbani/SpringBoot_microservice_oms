package com.te.oms.depts.externalservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.te.oms.depts.entity.Employee;


@FeignClient(name="EMPLOYEE-SERVICE")
public interface EmployeeService {
	
	@GetMapping("/employee/findEmployeesByDeptId/{id}")
	public List<Employee> findEmployeesBydeptId(@PathVariable int id);

}

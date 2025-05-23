package com.te.oms.orgs.externalservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.te.oms.orgs.entity.Department;



@FeignClient(name="DEPARTMENT-SERVICE")
public interface DepartmentService {

	@GetMapping("/dept/getAllDeptByOrgId/{id}")
	public List<Department> getAllDeptByOrgId(@PathVariable int id);
	
}

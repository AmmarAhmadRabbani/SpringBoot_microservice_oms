package com.te.oms.depts.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.oms.depts.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

	Optional<Department> findByDepartmentName(String name);
	
	List<Department> findAllByOrganizationId(int id);

}

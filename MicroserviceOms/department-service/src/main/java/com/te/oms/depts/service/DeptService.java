package com.te.oms.depts.service;

import java.util.List;

import com.te.oms.depts.entity.Department;

public interface DeptService {

	int	addDept(Department department);

	Department findByDeptName(String name);

	Department findByDeptId(int id);

	Department findEmployeesInDept(String name);

	List<Department> getAllDeptByOrgId(int id);

}

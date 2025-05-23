package com.te.oms.depts.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeEmail;
	private int employeeAge;
}

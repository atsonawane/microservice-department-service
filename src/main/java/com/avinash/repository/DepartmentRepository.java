package com.avinash.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.avinash.model.Department;

@Repository
public class DepartmentRepository {

	private List<Department> departments = new ArrayList<>();
	
	public Department addDepartment(Department department) {
		departments.add(department);
		return department;
	}
	
	public Department findDepartmentById(Long id) {
		return departments.stream().filter(d -> d.getId().equals(id)).findFirst().get();
	}
	
	public List<Department> findAllDepartment(){
		return departments;
	}
}

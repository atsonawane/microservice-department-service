package com.avinash.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.model.Department;
import com.avinash.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		LOGGER.info("Department add: {}", department);
		return departmentRepository.addDepartment(department);
	}
	
	@GetMapping
	public List<Department> findAllDepartment(){
		LOGGER.info("Department find");
		return departmentRepository.findAllDepartment();
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable Long id) {
		LOGGER.info("Department find: id={}",id);
		return departmentRepository.findDepartmentById(id);
	}
	
}

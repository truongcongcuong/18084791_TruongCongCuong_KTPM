package com.example._TruongCongCuong_KTPM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example._TruongCongCuong_KTPM.entity.Employee;
import com.example._TruongCongCuong_KTPM.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public List<Employee> getAll() {
		return employeeService.getAll();

	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getById(id);
	}

	@PostMapping
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdateEmployee(employee);
		return "Created";
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return "Deleted";
	}

	@PutMapping("/{id}")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdateEmployee(employee);
		return "Updated";
	}

}

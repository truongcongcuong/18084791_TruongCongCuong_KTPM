package com.example._TruongCongCuong_KTPM.service;

import java.util.List;

import com.example._TruongCongCuong_KTPM.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	
	public Employee getById(int id);
	
	public void saveOrUpdateEmployee(Employee employee);
	
	public void deleteEmployee(int id);

}

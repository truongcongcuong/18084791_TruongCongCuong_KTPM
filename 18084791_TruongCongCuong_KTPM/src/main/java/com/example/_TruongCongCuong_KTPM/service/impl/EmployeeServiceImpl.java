package com.example._TruongCongCuong_KTPM.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example._TruongCongCuong_KTPM.entity.Employee;
import com.example._TruongCongCuong_KTPM.repo.EmployeeRepository;
import com.example._TruongCongCuong_KTPM.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAll() {
		return repository.findAll();
	}

	@Override
	public Employee getById(int id) {
		Optional<Employee> optional = repository.findById(id);
		Employee employee = null;
		if(optional.isPresent())
			employee = optional.get();
		return employee;
	}

	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		repository.deleteById(id);
		
	}
	

}

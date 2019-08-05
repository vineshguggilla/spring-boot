package com.example.demo.delegate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.IplDao;
import com.example.demo.services.Employee;

@Service
public class IplRestDelegate {

	@Autowired
	private IplDao dao;

	public Employee getEmployee(Integer empId) {
		// call to dao layer and get employee object from database
		return dao.findById(empId).orElse(new Employee());
	}

	
	  
	  public String saveEmployee(Employee e) {
	  
	  dao.save(e); 
	  
	  return "success";
	  }
	  
	 
	public List<Employee> getAllEmployee() {
		return dao.findAll();
	}

	public String deleteEmployee(Integer id) {
		dao.deleteById(id);
		return "successfully deleted";
	}
}

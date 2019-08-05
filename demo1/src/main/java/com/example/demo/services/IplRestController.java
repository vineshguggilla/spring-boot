package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delegate.IplRestDelegate;

@RestController
public class IplRestController {

	@Autowired
	private IplRestDelegate iplDelegate;

	@RequestMapping(value = "/sayHelo", method = RequestMethod.GET)
	public String wishUser() {
		System.out.println("test Service!!");
		return "Helo";
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		Employee e = iplDelegate.getEmployee(empId);
		return e;
	}

	@RequestMapping(value = "/getAll")
	public List<Employee> getAllEmployee() {

		return iplDelegate.getAllEmployee();
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String saveEmployee(@RequestBody Employee e) {
		System.out.println("Saving employee object to database!!");
		return iplDelegate.saveEmployee(e);
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("empId") Integer id) {

		System.out.println("Delete employee triggered for " + id);
		return iplDelegate.deleteEmployee(id);
	}
}

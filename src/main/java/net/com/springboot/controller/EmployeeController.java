package net.com.springboot.controller;

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
import net.com.springboot.entity.Employee;
import net.com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employee")
	public List<Employee> findAllEmployee() {
		return service.getEmployee();
	}


	@PostMapping("/employee")
	public Employee addEmployeee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/employee/{empid}")
	public Employee findEmployeeById(@PathVariable int empid) {
		return service.getEmployeeById(empid);

	}

	@PutMapping("/employee/{empid}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{empid}")
	public String employee(@PathVariable int empid) {
		return service.deleteEmployee(empid);
	}

}

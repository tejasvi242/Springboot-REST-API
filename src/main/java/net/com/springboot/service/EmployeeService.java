package net.com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.com.springboot.entity.Employee;
import net.com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employee) {
		return (List<Employee>) employeeRepository.saveAll(employee);
	}

	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();

	}
	

	public Employee getEmployeeById(int empid) {
		if( employeeRepository.existsById(empid)) {
			Employee employee = employeeRepository.findById(empid).get();
			return employee;
		}
		else {
			return null;
		}
	}

	public List<Employee> getEmployeeByDesignation(String designation) {
		return (List<Employee>) employeeRepository.getEmployeeByDesignation(designation);
		
	}
	public String deleteEmployee(int empid) {
		employeeRepository.deleteById(empid);
		return "employee Removed Sucessfully";
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmp = employeeRepository.findById(employee.getEmpid()).orElse(null);
		existingEmp.setSalary(employee.getSalary());
		existingEmp.setDesignation(employee.getDesignation());
		return employeeRepository.save(existingEmp);

	}
	/*public List<Employee> findByDesignation(String designation) { //need to customize your query

		return employeeRepository.findByDesignation(designation);
		}*/

}

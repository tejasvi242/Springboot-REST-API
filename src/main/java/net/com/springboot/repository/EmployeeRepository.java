package net.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import net.com.springboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE LOWER(e.designation) LIKE LOWER(CONCAT('%',:designation,'%'))")
	public List<Employee> getEmployeeByDesignation(String designation);

	/*List<Employee> findByDesignation(String designation);*/

}

package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import core.utilities.results.DataResult;
import entities.concrete.Employee;

public interface EmployeeUserDao extends JpaRepository<Employee, Integer>{
	DataResult<Employee> findByMail(String mail);
}
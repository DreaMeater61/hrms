package business.concrete;

import java.util.List;

import business.abstracts.EmployeeService;
import core.utilities.results.DataResult;
import entities.concrete.Employee;

public class EmployeeManager implements EmployeeService{

	@Override
	public DataResult<List<Employee>> getAll() {
		return null;
	}

}

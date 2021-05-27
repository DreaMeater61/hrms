package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concrete.Employee;

public interface EmployeeService {
	DataResult<List<entities.concrete.Employee>> getAll();
}

package core.utilities;

import core.utilities.results.Result;

public interface İdentityValidationService {
	Result validate(String tckn, String firstName, String lastName, int yearOfDate);
}
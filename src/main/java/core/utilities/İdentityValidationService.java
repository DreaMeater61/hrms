package core.utilities;

import core.utilities.results.Result;

public interface ─░dentityValidationService {
	Result validate(String tckn, String firstName, String lastName, int yearOfDate);
}
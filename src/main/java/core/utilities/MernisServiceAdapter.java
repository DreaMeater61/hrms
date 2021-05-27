package core.utilities;

import core.utilities.results.Result;
import core.utilities.results.SuccessResult;

public class MernisServiceAdapter implements İdentityValidationService {

	@Override
	public Result validate(String tckn, String firstName, String lastName, int yearOfDate) {
		return new SuccessResult("TCKN doğrulaması başarılı.");
	}

}
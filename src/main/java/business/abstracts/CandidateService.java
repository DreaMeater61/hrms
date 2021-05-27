package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concrete.Candidate;

public interface CandidateService {
	 DataResult<List<entities.concrete.Candidate>> getAll();
}

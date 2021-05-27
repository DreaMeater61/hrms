package business.concrete;

import java.util.List;

import business.abstracts.CandidateService;
import core.utilities.results.DataResult;
import entities.concrete.Candidate;

public class CandidateManager implements CandidateService{

	@Override
	public DataResult<List<Candidate>> getAll() {
		return null;
	}

}
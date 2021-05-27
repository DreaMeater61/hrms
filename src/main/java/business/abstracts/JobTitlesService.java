package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import entities.concrete.JobTitles;
import entities.concrete.JobTitles;

public interface JobTitlesService {
	DataResult<List<JobTitles>> getAll();
}

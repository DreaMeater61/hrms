package business.concrete;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.concrete.JobTitles;
import business.abstracts.JobTitlesService;
import core.utilities.results.DataResult;
import dataAccess.abstracts.JobTitlesDao;
import entities.concrete.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService{

	private JobTitlesDao jobTitleDao;
	private int DataResult;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitles>> getAll() {
		
		return this.DataResult<List<DataResult>>;
	}

}

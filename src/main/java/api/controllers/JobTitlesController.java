package api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import business.abstracts.JobTitlesService;
import core.utilities.results.DataResult;
import entities.concrete.JobTitles;

@RestController
@RequestMapping("/api/titles")
public class JobTitlesController {
	
	private JobTitlesService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitlesService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	DataResult<List<JobTitles>> getAll(){
		return this.jobTitleService.getAll();
	}

}
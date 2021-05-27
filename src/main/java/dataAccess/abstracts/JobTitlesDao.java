package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concrete.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer>{

}
package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import core.utilities.results.DataResult;
import entities.concrete.Candidate;

public interface CandidateUserDao extends JpaRepository<Candidate, Integer>{
    DataResult<Candidate> findByIdentityNumber(String tcNo);
}

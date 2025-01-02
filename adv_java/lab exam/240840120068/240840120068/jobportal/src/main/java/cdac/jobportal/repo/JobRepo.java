package cdac.jobportal.repo;

import org.springframework.data.repository.CrudRepository;

import cdac.jobportal.entity.Job;

public interface JobRepo extends CrudRepository<Job, Integer> {
	
}

package cdac.jobportal.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdac.jobportal.dto.JobDTO;
import cdac.jobportal.services.JobService;

@RestController
@RequestMapping("/jobPostings")
public class JobController {
	@Autowired 
	JobService jobService;
	
	
	@PostMapping("/postJob")
	public boolean postJob(@RequestBody JobDTO dto) {
		return jobService.postJob(dto);
	}
	
	@PutMapping("/updateJob")
	public boolean updateJob(@RequestBody JobDTO dto) {
		return jobService.updateJob(dto);
	}
	
	@DeleteMapping("/deleteJob/{jobId}")
	public boolean deleteJob(@PathVariable("jobId") int jobId) {
		return jobService.deleteJob(jobId);
	}
	
	@GetMapping("/allJobs")
	public List<JobDTO> getAllJobs(){
		return jobService.getAllJob();
	}
}

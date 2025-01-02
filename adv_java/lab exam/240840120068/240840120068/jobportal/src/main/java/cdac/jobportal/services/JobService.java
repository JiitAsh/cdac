package cdac.jobportal.services;

import java.util.List;

import cdac.jobportal.dto.JobDTO;

public interface JobService {
	public boolean postJob(JobDTO dto);
	public boolean updateJob(JobDTO dto);
	public boolean deleteJob(int jobId);
	public List<JobDTO> getAllJob();
}

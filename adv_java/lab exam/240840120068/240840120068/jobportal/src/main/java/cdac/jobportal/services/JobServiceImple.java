package cdac.jobportal.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdac.jobportal.dto.JobDTO;
import cdac.jobportal.entity.Job;
import cdac.jobportal.repo.JobRepo;

@Service
public class JobServiceImple implements JobService {

	@Autowired
	JobRepo repo;
	
	@Override
	public boolean postJob(JobDTO dto) {
		Job jobEntity = new Job();
		dto.setPostingDate(new Date());
		BeanUtils.copyProperties(dto, jobEntity);
		repo.save(jobEntity);
		return true;
	}

	@Override
	public boolean updateJob(JobDTO dto) {
		Job jobEntity = new Job();
		jobEntity.setPostingDate(new Date());
		BeanUtils.copyProperties(dto, jobEntity);
		repo.save(jobEntity);
		return true;
	}

	@Override
	public boolean deleteJob(int jobId) {
		repo.deleteById(jobId);
		return true;
	}

	@Override
	public List<JobDTO> getAllJob() {
		
		Iterator<Job> iter = repo.findAll().iterator();
		ArrayList<JobDTO> finalList = new ArrayList<>();
		
		while(iter.hasNext()) {
			Job job = iter.next();
			JobDTO dto = new JobDTO();
			BeanUtils.copyProperties(job, dto);
			finalList.add(dto);
		}
		return finalList;
	}

}

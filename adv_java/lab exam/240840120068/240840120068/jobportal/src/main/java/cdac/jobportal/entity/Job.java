package cdac.jobportal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jobportal")
public class Job {
	@Id
	@Column(name="jobid")
	int jobId;
	
	@Column(name="jobtitle")
	String jobTitle;
	
	@Column(name="company")
	String company;
	
	@Column(name="location")
	String location;
	
	@Column(name="jobdesc")
	String jobDesc;
	
	@Column(name="requirements")
	String requirements;
	
	@Column(name="salary")
	double salary;
	
	@Column(name="postingdate")
	Date postingDate;
	
	public Job() {
		
	}
	
	

	public Job(int jobId, String jobTitle, String company, String location, String jobDesc, String requirements,
			double salary, Date postingDate) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.company = company;
		this.location = location;
		this.jobDesc = jobDesc;
		this.requirements = requirements;
		this.salary = salary;
		this.postingDate = postingDate;
	}



	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}
	
	
	

}

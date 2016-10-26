package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Job extends BaseModel {
	private Guid _jobPk;
	private String _description;
	
	public Job() { super(false); }
	
	public Job(Guid jobPk, String description, boolean isFromDatabase) {
		super(isFromDatabase);
		_jobPk = jobPk;
		_description = description;
	}
	
	public Guid getJobPk() {
		return _jobPk;
	}
	public void setJobPk(Guid jobPk) {
		_jobPk = jobPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
		setIsChanged(true);
	}
}

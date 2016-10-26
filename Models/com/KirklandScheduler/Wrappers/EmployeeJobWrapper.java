package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.EmployeeRepository;
import com.KirklandScheduler.DataRepositories.JobRepository;
import com.KirklandScheduler.Models.EmployeeJob;

public class EmployeeJobWrapper extends EmployeeJob {

	private EmployeeRepository employeeRepository;
	private JobRepository jobRepository;
	private EmployeeWrapper _employee;
	private JobWrapper _job;
	
	public EmployeeJobWrapper() {
		employeeRepository = new EmployeeRepository();
		jobRepository = new JobRepository();
		
		_employee = null;
		_job = null;
	}
	
	public EmployeeWrapper getEmployee(){
		if(_employee == null){
			_employee = employeeRepository.getByPk(this.getEmpFk());
		}
		
		return _employee;
	}
	
	public JobWrapper getJob(){
		if(_job == null){
			_job = jobRepository.getByPk(this.getJobFk());
		}
		
		return _job;
	}

}

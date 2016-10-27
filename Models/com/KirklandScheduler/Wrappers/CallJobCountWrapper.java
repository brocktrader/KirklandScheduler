package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.CallJobCountRepository;
import com.KirklandScheduler.DataRepositories.CallRepository;
import com.KirklandScheduler.DataRepositories.JobRepository;
import com.KirklandScheduler.Models.CallJobCount;
import com.KirklandScheduler.Utilities.Guid;

public class CallJobCountWrapper extends CallJobCount {

	private CallRepository callRepository;
	private JobRepository jobRepository;
	private CallJobCountRepository callJobCountRepository;
	private CallWrapper _call;
	private JobWrapper _job;
	private int _count;
	
	public CallJobCountWrapper() {
		callRepository = new CallRepository();
		jobRepository = new JobRepository();
		callJobCountRepository = new CallJobCountRepository();
		
		_call = null;
		_job = null;
		_count = 0;
	}
	
	public CallWrapper getCall(){
		if(_call == null){
			_call = callRepository.getByPk(this.getCallFk());
		}
		
		return _call;
	}
	
	public JobWrapper getJob(){
		if(_job == null){
			_job = jobRepository.getByPk(this.getJobFk());
		}
		
		return _job;
	}
	
	public int getCount(Guid jobFk, Guid callFk){		
		if(_count == 0){
			_count = callJobCountRepository.getCountByJobFkAndCallFk(jobFk, callFk);
		}
		
		return _count;
	}

}

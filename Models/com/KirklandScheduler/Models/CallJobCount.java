package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class CallJobCount extends BaseModel {
	//region Variables
	private Guid _callJobCountPk;
	private Guid _callFk;
	private Guid _jobFk;
	private int _count;
	//endregion
	
	//region Constructors
	public CallJobCount() { super(false); }
	
	public CallJobCount(Guid callJobCountPk, Guid callFk, Guid jobFk, int count, boolean isFromDatabase) {
		super(isFromDatabase);
		_callJobCountPk = callJobCountPk;
		_callFk = callFk;
		_jobFk = jobFk;
		_count = count;
	}
	//endregion

	//region Methods
	public Guid getCalljobFk() {
		return _callJobCountPk;
	}
	public void setCalljobFk(Guid callJobCountPk) {
		_callJobCountPk = callJobCountPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public Guid getCallFk() {
		return _callFk;
	}
	public void setCallFk(Guid callFk) {
		_callFk = callFk;
		setIsChanged(true);
	}
	public Guid getJobFk() {
		return _jobFk;
	}
	public void setJobFk(Guid jobFk) {
		_jobFk = jobFk;
		setIsChanged(true);
	}
	public int getCount() {
		return _count;
	}
	public void setCount(int count) {
		_count = count;
		setIsChanged(true);
	}
	//endregion
}

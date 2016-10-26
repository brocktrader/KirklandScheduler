package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class EmployeeJob extends BaseModel {
	//region Variables
	private Guid _empJobPk;
	private Guid _jobFk;
	private Guid _empFk;
	private boolean _canDo;
	//endregion

	//region Constructors
	public EmployeeJob() { super(false); }
	
	public EmployeeJob(Guid empJobPk, Guid jobFk, Guid empFk, boolean canDo, boolean isFromDatabase) {
		super(isFromDatabase);
		_empJobPk = empJobPk;
		_jobFk = jobFk;
		_empFk = empFk;
		_canDo = canDo;
	}
	//endregion

	//region Methods
	public Guid getEmpJobPk() {
		return _empJobPk;
	}
	public void setEmpJobPk(Guid empJobPk) {
		_empJobPk = empJobPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);		
	}
	public Guid getJobFk() {
		return _jobFk;
	}
	public void setJobFk(Guid jobFk) {
		_jobFk = jobFk;
		setIsChanged(true);		
	}
	public Guid getEmpFk() {
		return _empFk;
	}
	public void setEmpFk(Guid empFk) {
		_empFk = empFk;
		setIsChanged(true);
	}
	public boolean getCanDo() {
		return _canDo;
	}
	public void setCanDo(boolean canDo) {
		_canDo = canDo;
		setIsChanged(true);
	}
	//endregion
}

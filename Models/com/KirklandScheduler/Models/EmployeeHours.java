package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class EmployeeHours extends BaseModel {
	//region Variables
	private Guid _employeeHoursPk;
	private Guid _employeeFk;
	private Guid _dreamsheetFk;
	private int _hours;
	//endregion

	//region Constructors
	public EmployeeHours () { super(false); }
	
	public EmployeeHours(Guid employeeHoursPk, Guid employeeFk, Guid dreamsheetFk, int hours, boolean isFromDatabase) {
		super(isFromDatabase);
		_employeeHoursPk = employeeHoursPk;
		_employeeFk = employeeFk;
		_dreamsheetFk = dreamsheetFk;
		_hours = hours;
	}
	//endregion

	//region Methods
	public Guid getEmployeeHoursPk() {
		return _employeeHoursPk;
	}

	public void setEmployeeHoursPk(Guid employeeHoursPk) {
		_employeeHoursPk = employeeHoursPk;
		setIsChanged(true);
		setIsFromDatabase(false);
	}

	public Guid getEmployeeFk() {
		return _employeeFk;
	}

	public void setEmployeeFk(Guid employeeFk) {
		_employeeFk = employeeFk;
		setIsChanged(true);
	}

	public Guid getDreamsheetFk() {
		return _dreamsheetFk;
	}

	public void setDreamsheetFk(Guid dreamsheetFk) {
		_dreamsheetFk = dreamsheetFk;
		setIsChanged(true);
	}

	public int getHours() {
		return _hours;
	}

	public void setHours(int hours) {
		_hours = hours;
		setIsChanged(true);
	}
	//endregion
}

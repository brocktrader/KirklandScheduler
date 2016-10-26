package com.KirklandScheduler.Models;

import java.util.Date;

import com.KirklandScheduler.Utilities.Guid;

public class Availability extends BaseModel {
	//region Variables
	private Guid _availabilityPk;
	private Guid _callFk;
	private Guid _employeeFk;
	private Date _startDateTime;
	private Date _endDateTime;
	private boolean _isActive;
	//endregion

	//region Constructors
	public Availability() { super(false); }
	
	public Availability(Guid availabilityPk, Guid callFk, Guid employeeFk, Date startDateTime,
			Date endDateTime, boolean isActive, boolean isFromDatabase) {
		super(isFromDatabase);
		_availabilityPk = availabilityPk;
		_callFk = callFk;
		_employeeFk = employeeFk;
		_startDateTime = startDateTime;
		_endDateTime = endDateTime;
		_isActive = isActive;
	}
	//endregion

	//region Methods
	public Guid getAvailabilityPk() {
		return _availabilityPk;
	}

	public void setAvailabilityPk(Guid availabilityPk) {
		_availabilityPk = availabilityPk;
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

	public Guid getEmployeeFk() {
		return _employeeFk;
	}

	public void setEmployeeFk(Guid employeeFk) {
		_employeeFk = employeeFk;
		setIsChanged(true);
	}

	public Date getStartDateTime() {
		return _startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		_startDateTime = startDateTime;
		setIsChanged(true);
	}

	public Date getEndDateTime() {
		return _endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		_endDateTime = endDateTime;
		setIsChanged(true);
	}

	public boolean getIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
		setIsChanged(true);
	}
	//endregion
}
